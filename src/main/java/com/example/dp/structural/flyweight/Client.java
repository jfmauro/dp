package com.example.dp.structural.flyweight;

import com.example.dp.structural.flyweight.entity.Substance;
import com.example.dp.structural.flyweight.factory.ChemicalFactory;

public class Client {
    public static void main(String[] args) {
        ChemicalFactory chemicalFactory = ChemicalFactory.getInstance();

        Substance sodium11 = chemicalFactory.getSubstance("sodium", 11.00, "Na", 11.00);

        Substance cuivre29 = chemicalFactory.getSubstance("cuivre", 29.00, "Cu", 29.00);

        Substance sodium66 = chemicalFactory.getSubstance("sodium", 11.00, "Na", 66.00);

        if (sodium11.getChemical() == sodium66.getChemical()){
            System.out.println("is Flyweight");
        }




    }
}
