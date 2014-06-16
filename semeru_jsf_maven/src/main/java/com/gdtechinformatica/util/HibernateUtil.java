/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdtechinformatica.util;


import javax.security.auth.login.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Giliarde
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
  
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    
    static {
        System.out.println("tentando abrir SF");
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry =  new ServiceRegistryBuilder();
        applySettings(configuration.getProperpies()).builServiceRegistry();
        
        sessionFactory =  new Configuration.buildSessionFactory(ServiceRegistry);
        
        
        System.out.println("SF criada");
        try {
            
        } catch (Throwable ex) {
         
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
