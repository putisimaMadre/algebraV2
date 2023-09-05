package org.example;

import org.example.utilerias.Utilerias;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Utilerias utilerias = new Utilerias();
        Map<String, List<Character>> exponente = new HashMap();
        //String polinomio = "2x^(2-x)+3x";
        String polinomio = "-2x^(x+1)+3x+5x+4x^(x+4)";
        List<Character> polinomioLista = utilerias.guardarValoresEnLista(polinomio);
        exponente = utilerias.exponente(polinomioLista);
        //utilerias.base(exponente, polinomioLista);
        // Entramos al Map y se recorre el list dentro de este Map

        exponente.forEach((k,v) -> {
            System.out.println(k);
            for (Character c: v
                 ) {
                System.out.println(c);
            }
        });







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