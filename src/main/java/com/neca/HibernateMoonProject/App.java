package com.neca.HibernateMoonProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        Alien alien = new Alien();
        alien.setAid(16);
        alien.setAname("Neca");
    	
    	Computer computer = new Computer(224, "Razer", 15, alien);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Computer.class);
        ServiceRegistry registry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory factory = config.buildSessionFactory(registry);
    	Session session = factory.openSession();
    	
    	session.beginTransaction();
    	session.save(alien);
    	session.getTransaction().commit();
    	
    	session.beginTransaction();
    	session.save(computer);
    	session.getTransaction().commit();
    }
}
