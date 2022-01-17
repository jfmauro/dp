package com.example.dp.structural.flyweight.builder;

import com.example.dp.structural.flyweight.entity.Chemical;
import com.example.dp.structural.flyweight.entity.Substance;

import java.util.HashMap;
import java.util.Map;

public class ChemicalBuilder {
    private Map<String, Chemical> items;

    public ChemicalBuilder(){
        items = new HashMap<>();
    }


    public Substance getSubstance (String name, Double atomicweight, String symbol, Double grams){
        Substance substance;
        Chemical chemical;
        if (name == null || name.equals(""))
            throw new RuntimeException("Key cannot be null or empty");
        if (name.equalsIgnoreCase(symbol))
            throw new RuntimeException("name & symbol cannot have the same value");
        if (items.containsKey(name)){
            chemical = items.get(name);
        }else{
            chemical = new Chemical(name, symbol, atomicweight);
            items.put(name, chemical);
        }

        return new Substance(grams, chemical);
    }

}
