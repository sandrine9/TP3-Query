package com.bnpp.epita.Hibernate.sansSpring.infrastructure;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoFactory {
    static SessionFactory sessionFactory = null;
    public static IVoitureDao instanciateImplementationVoitureDao(){
        return new VoitureDaoImpl();
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            sessionFactory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }
}
