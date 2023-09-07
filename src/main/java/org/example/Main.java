package org.example;

import org.example.models.Polinomio;
import org.example.utilerias.Utilerias;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Utilerias utilerias = new Utilerias();
        Polinomio polinomioF = new Polinomio();
        //String polinomio = "2x^(2-x)+3x";
        //String polinomio = "-2x^(x+1)+3x+5x+4x^(x+4)";
        String polinomio = "-2x+3x^(x+1)+5x^(x+2)+4x";

        //=====PROBAR getExponente=====
        /*utilerias.getExponente(polinomio).forEach((k,v) -> {
            System.out.println("Key: " + k);
            for (String s:v
                 ) {
                System.out.println(s);
            }
        });*/
        utilerias.getBase(polinomio);

    }
}