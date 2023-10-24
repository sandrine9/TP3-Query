package com.bnpp.epita.Hibernate.sansSpring.infrastructure;

import com.bnpp.epita.Hibernate.sansSpring.domaine.Voiture;

import java.util.List;

public interface IVoitureDao {

    void create(Voiture v);

    Voiture findById(long id);

    List<Voiture> findAll();

    List<Voiture> findByModele(String modele);
}
