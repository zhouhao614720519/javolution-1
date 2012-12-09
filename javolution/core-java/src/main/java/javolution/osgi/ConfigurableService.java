/*
 * Javolution - Java(TM) Solution for Real-Time and Embedded Systems
 * Copyright (C) 2012 - Javolution (http://javolution.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package javolution.osgi;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import javolution.context.LogContext;
import javolution.context.SecurityContext;
import javolution.lang.Configurable;
import org.osgi.framework.Constants;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

/**
 *  <p> This class represents the service responsible for the configuration
 *      of {@link Configurable} elements.</p>

 *  <p> Bundles holding {@link Configurable} elements should register 
 *      a {@link ConfigurableService} to the framework as a ManagedService.
 *      [code]
 *      public class MyBundleActivator implements BundleActivator {
 *          ServiceRegistration<ManagedService> registration;
 *          public void start(BundleContext bc) throws Exception {
 *              ConfigurableService cs = new ConfigurableService("MyBundle"); // PID for Javolution is "Javolution"
 *              registration = bc.registerService(ManagedService.class, cs, cs.getProperties());
 *          }
 *          public void stop(BundleContext context) throws Exception {
 *              if (registration != null) {
 *                  registration.unregister();
 *                  registration = null;
 *              }
 *          }
 *      }[/code]</p>
 *
 * @author  <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @version 6.0, December 12, 2012
 */
public class ConfigurableService implements ManagedService {
    
    private Dictionary properties = new Hashtable();

    /**
     * Creates a configurable service having the specified PID identifier.
     *
     * @param pid the service pid (e.g. "MyBundle");
     */
    public ConfigurableService(String pid) {
        properties.put(Constants.SERVICE_PID, pid);
    }

    /**
     * Returns the properties for that managed service (holds the service.pid).
     *
     * @return the associated properties.
     */
    public Dictionary getProperties() {
        return properties;
    }

    /**
     * Updates the configurable elements using the specified configuration.
     * 
     * @param configuration
     * @throws ConfigurationException
     */
    public void updated(Dictionary<String, ?> configuration) throws ConfigurationException {
        SecurityContext.enter();
        try {
            SecurityContext.grant(Configurable.CONFIGURE_PERMISSION);
            Enumeration e = configuration.keys();
            while (e.hasMoreElements()) {
                String name = (String) e.nextElement();
                String textValue = (String) configuration.get(name);
                Configurable cfg = ConfigurableService.configurableFor(name);
                cfg.configure(textValue);
            }
        } finally {
            SecurityContext.exit();
        }
    }

    /**
     * Utility method to retrieve a configurable static instance from its 
     * full Java name (for example "javolution.context.ConcurrentContext#CONCURRENCY"
     * holding the concurrency parameter).
     * 
     * @param name the static field full name
     * @return the corresponding configurable or <code>null</code>
     */
    public static Configurable configurableFor(String name) {
        try {
            int sep = name.lastIndexOf('#');
            if (sep < 0) return null; // Not a configurable.
            String className = name.substring(0, sep);
            String fieldName = name.substring(sep + 1);
            Class cls = Class.forName(className);
            if (cls == null) {
                LogContext.warning("Class " + className + " not found");
                return null;
            }
            Configurable cfg = (Configurable) cls.getDeclaredField(fieldName).get(null);
            if (cfg == null) {
                LogContext.warning("Configurable " + name + " not found");
            }
            return cfg;
        } catch (Throwable error) {
            LogContext.error(error);
        }
        return null;
    }
}
