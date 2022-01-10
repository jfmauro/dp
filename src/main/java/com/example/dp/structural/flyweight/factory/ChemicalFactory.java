package com.example.dp.structural.flyweight.factory;

import com.example.dp.structural.flyweight.builder.ChemicalBuilder;
import com.example.dp.structural.flyweight.entity.Substance;

public class ChemicalFactory {
    private ChemicalBuilder builder;
    private static ChemicalFactory chemicalFactory;

    public ChemicalFactory(){
        builder = new ChemicalBuilder();
    }

    public static ChemicalFactory getInstance(){
        if (chemicalFactory == null){
            chemicalFactory = new ChemicalFactory();
        }
        return chemicalFactory;
    }

    public Substance getSubstance(String name, Double atomicweight, String symbol, Double grams){
        return builder.getSubstance(name, atomicweight, symbol, grams);
    }
}
