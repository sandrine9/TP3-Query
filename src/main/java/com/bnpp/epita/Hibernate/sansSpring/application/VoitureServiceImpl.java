package com.bnpp.epita.Hibernate.sansSpring.application;

import com.bnpp.epita.Hibernate.sansSpring.domaine.Voiture;
import com.bnpp.epita.Hibernate.sansSpring.infrastructure.DaoFactory;
import com.bnpp.epita.Hibernate.sansSpring.infrastructure.IVoitureDao;

import java.util.List;

public class VoitureServiceImpl implements IVoitureService {
    @Override
    public void create(Voiture v) {
        //faire appel aux méthodes de ma couche infra
        IVoitureDao dao = DaoFactory.instanciateImplementationVoitureDao();
        dao.create(v);
    }

    @Override
    public Voiture findById(long id) {
        IVoitureDao dao = DaoFactory.instanciateImplementationVoitureDao();
        return dao.findById(id);
    }

    @Override
    public List<Voiture> findAll() {
        IVoitureDao dao = DaoFactory.instanciateImplementationVoitureDao();
        return dao.findAll();

    }

    @Override
    public List<Voiture> findByModele(String modele) {
        IVoitureDao dao = DaoFactory.instanciateImplementationVoitureDao();
        return dao.findByModele(modele);

    }
}
