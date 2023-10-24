package com.bnpp.epita.Hibernate.sansSpring.application;

public class VoitureServiceFactory {

    public static IVoitureService instanciateImplVoitureService(){
        return new VoitureServiceImpl();
    }
}
