package com.bnpp.epita.Hibernate.sansSpring.infrastructure;

import com.bnpp.epita.Hibernate.sansSpring.domaine.Voiture;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class VoitureDaoImpl implements IVoitureDao{
    @Override
    public void create(Voiture v) {
        //SessionFactory
        SessionFactory sessionFactory = DaoFactory.getSessionFactory();
        //Session
        Session session = sessionFactory.openSession();
        //requête Persist
        session.beginTransaction();
        session.persist(v);
        session.getTransaction().commit();
    }

    @Override
    public Voiture findById(long id) {
        //SessionFactory
        SessionFactory sessionFactory = DaoFactory.getSessionFactory();
        //Session
        Session session = sessionFactory.openSession();
        //requête Find
        Voiture v = session.find(Voiture.class,id);
        session.close();
        return v;
    }

    @Override
    public List<Voiture> findAll() {
        //SessionFactory
        SessionFactory sessionFactory = DaoFactory.getSessionFactory();
        //Session
        Session session = sessionFactory.openSession();
        //requête JPQL
        Query query = session.createQuery("select v from Voiture v");
        List<Voiture> list = query.getResultList();
        session.close();
        return list;
    }

    @Override
    public List<Voiture> findByModele(String modele) {
        //SessionFactory
        SessionFactory sessionFactory = DaoFactory.getSessionFactory();
        //Session
        Session session = sessionFactory.openSession();
        //requête JPQL
        Query query = session.createQuery("select v from Voiture v where v.modele=:nomModele");
        query.setParameter("nomModele",modele);
        List<Voiture> list = query.getResultList();
        session.close();
        return list;
    }
}
