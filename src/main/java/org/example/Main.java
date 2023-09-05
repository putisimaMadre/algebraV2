package org.example;

import org.example.models.Polinomio;
import org.example.utilerias.Utilerias;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Utilerias utilerias = new Utilerias();
        Polinomio polinomioF = new Polinomio();
        //String polinomio = "2x^(2-x)+3x";
        String polinomio = "-2x^(x+1)+3x+5x+4x^(x+4)";
        List<Character> polinomioLista = utilerias.guardarValoresEnLista(polinomio);
        polinomioF = utilerias.getValuesPolinomio(polinomioLista);

        System.out.println("======Exponente======");
        for (Character c: polinomioF.getExponente()
             ) {
            System.out.println(c);
        }
        System.out.println("======Base======");
        for (Character c: polinomioF.getBase()
        ) {
            System.out.println(c);
        }
        System.out.println("======Posicion Exponente======");
        for (Integer i: polinomioF.getPosicionExponente()
        ) {
            System.out.println(i);
        }







        /*int numeroDeMonomios = utilerias.cuentaMonomios(polinomio);
        String [] monomios = new String [numeroDeMonomios];
        int j=0;*/

        /*List<String> elementos = new ArrayList<>();
        for (int i = 0; i < polinomio.length(); i++) {
            elementos.add(String.valueOf(polinomio.charAt(i)));
            if (String.valueOf(polinomio.charAt(i)).equals("+") || String.valueOf(polinomio.charAt(i)).equals("-")){
                monomios[j] = elementos.toString();
                System.out.println(monomios[j]);
                System.out.println("---------------------");
                j++;
            }
            System.out.println(polinomio.charAt(i));
        }*/
    }
}