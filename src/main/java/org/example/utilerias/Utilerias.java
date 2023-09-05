package org.example.utilerias;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilerias {

    public List<Character> guardarValoresEnLista(String polinomio){
        List<Character> valoresPolinomios = new ArrayList<>();
        for (int i = 0; i < polinomio.length(); i++) {
            valoresPolinomios.add(polinomio.charAt(i));
        }
        return valoresPolinomios;
    }

    public Map<String, List<Character>> exponente(List<Character> polinomioLista){
        boolean bandera = false;
        int numeroMonomios = 0;
        int index=0;
        List<Integer> posicionExponente = new ArrayList<>();
        List<Character> exponente = new ArrayList<>();
        List<Character> base = new ArrayList<>();
        Map<String, List<Character>> respuesta = new HashMap<String, List<Character>>();

        for (char p: polinomioLista
        ) {
            if (p == '^'){
                bandera = true;
            }

            if (bandera){
                exponente.add(p);
                if (p == ')'){
                    bandera = false;
                    posicionExponente.add(numeroMonomios);
                    //System.out.println("Posicion exp"+posicionExponente);
                }
            }else{
                if (p == '+' || p == '-' && index != 0){
                    numeroMonomios++;
                }
                //System.out.println("num: "+numeroMonomios);
                base.add(p);
            }
            index++;
        }//for
        respuesta.put("exponente", exponente);
        respuesta.put("base", base);
        System.out.println("Posicion exponenete: "+posicionExponente);

        //respuesta.put("posicionExp", posicionExponente);
        return respuesta;
    }

    public int cuentaMonomios(List<Character> polinomioLista){
        int numeroMonomios=0;
        List<Character> base = new ArrayList<>();
        for (char p: polinomioLista
        ) {
            if (p == '+' || p == '-'){
                numeroMonomios++;
            }
        }//for
        return numeroMonomios;
    }

    public List<Character> base(Map<List<Character>, Boolean> exponente, List<Character> polinomioLista){
        Boolean tieneExponente = false;
        List<Character> base = new ArrayList<>();

        for (Map.Entry<List<Character>, Boolean> entry : exponente.entrySet()) {
            List<Character> k = entry.getKey();
            tieneExponente = entry.getValue();
        }
        System.out.println(tieneExponente);

        for (int i = 0; i < polinomioLista.size(); i++) {
            //"2x^(2-x)+3x"

            if (tieneExponente){
                base.add(polinomioLista.get(i));
            }

        }
        //System.out.println(base);

        return base;
    }//Base

}
