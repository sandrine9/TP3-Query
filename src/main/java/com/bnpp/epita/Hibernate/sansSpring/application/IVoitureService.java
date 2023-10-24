package com.bnpp.epita.Hibernate.sansSpring.application;

import com.bnpp.epita.Hibernate.sansSpring.domaine.Voiture;

import java.util.List;

public interface IVoitureService {
    void create(Voiture v);

    Voiture findById(long id);

    List<Voiture> findAll();

    List<Voiture> findByModele(String modele);
}
