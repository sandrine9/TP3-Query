package com.bnpp.epita.Hibernate.sansSpring;

import com.bnpp.epita.Hibernate.sansSpring.application.IVoitureService;
import com.bnpp.epita.Hibernate.sansSpring.application.VoitureServiceFactory;
import com.bnpp.epita.Hibernate.sansSpring.domaine.Voiture;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        IVoitureService service = VoitureServiceFactory.instanciateImplVoitureService();

        //Voiture voiture1 = new Voiture("clio","blue");
        //Voiture voiture2 = new Voiture("twingo","rouge");

        //service.create(voiture1);
        //service.create(voiture2);

        List<Voiture> liste1 = service.findAll();
        System.out.println("-------findAll-------");
        for (Voiture voiture : liste1) {
            System.out.println("couleur: " + voiture.getCouleur() + " |modele: " + voiture.getModele());
        }

        Voiture result = service.findById(2L);
        System.out.println("-------findById-------");
        System.out.println("couleur: " + result.getCouleur() + " |modele: " + result.getModele());

        List<Voiture> voituresModeles = service.findByModele("Mustang");
        System.out.println("-------findByModele-------");
        for (Voiture v: voituresModeles) {
            System.out.println("couleur: " + v.getCouleur() + " |modele: " + v.getModele());

        }

    }
}