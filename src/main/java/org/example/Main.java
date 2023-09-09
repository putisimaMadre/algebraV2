package org.example;

import org.example.models.Exponente;
import org.example.models.Polinomio;
import org.example.utilerias.Utilerias;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Utilerias utilerias = new Utilerias();
        //String polinomio = "xy-2x^(2-x)z";
        //String polinomio = "-2x^(x+1)+3y+5w+4z^(x+4)";
        //String polinomio = "xy-3xz^(x+1)+51xwy^(x+2)-4";
        String polinomio = "xy-3x^(w)z^(x+1)+51xw^(x+2)y-4";

        //=====PROBAR getExponente=====
        /*utilerias.getExponente(polinomio).forEach((k,v) -> {
            System.out.println("Key: " + k);
            for (String s:v
                 ) {
                System.out.println(s);
            }
        });*/

        /*for (Character c:utilerias.getBase(polinomio)
             ) {
            System.out.println(c);
        }*/

        /*Map<Integer, String> incognita = new HashMap<>();
        Map<Integer, String> coeficiente = new HashMap<>();
        Map<Integer, Character> signo = new HashMap<>();
        List<Integer> posExp = new ArrayList<>();

        Map<List<Integer>, String[]> exp = new HashMap<>();

        incognita = utilerias.getBase(polinomio).getIncognita();
        coeficiente = utilerias.getBase(polinomio).getCoeficientes();
        signo = utilerias.getBase(polinomio).getSignos();
        posExp = utilerias.getBase(polinomio).getPosicionExponente();

        exp = utilerias.getExponente(polinomio);
        System.out.println("incognita");
        incognita.forEach((k,v)-> System.out.println("Key: "+k + " Value: "+v));
        System.out.println("coeficiente");
        coeficiente.forEach((k,v)-> System.out.println("Key: "+k + " Value: "+v));
        System.out.println("signo");
        signo.forEach((k,v)-> System.out.println("Key: "+k + " Value: "+v));
        for (Integer i:posExp
             ) {
            System.out.println("Posicion exp: "+i);
        }
        System.out.println("Exponente");
        exp.forEach((k,v)-> {
            System.out.println("Key: " + k);
            for (String valorExp:v
                 ) {
                System.out.println(valorExp);
            }
        });*/
//modificar lo que da el exponente, crear un objeto para identificar la
        //posicion interna y que devuelva un true o un false
    }
}