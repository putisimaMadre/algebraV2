package org.example.utilerias;

import org.example.models.Polinomio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilerias {

    private List<Character> guardarValoresEnLista(String polinomio){
        List<Character> valoresPolinomios = new ArrayList<>();
        for (int i = 0; i < polinomio.length(); i++) {
            valoresPolinomios.add(polinomio.charAt(i));
        }
        return valoresPolinomios;
    }

    private Polinomio getValuesPolinomio(String polinomioString){
        List<Character>polinomioList = guardarValoresEnLista(polinomioString);
        Polinomio polinomio = new Polinomio();
        boolean bandera = false;
        int numeroMonomios = 0;
        int index=0;
        List<Integer> posicionExponente = new ArrayList<>();
        List<Character> exponente = new ArrayList<>();
        List<Character> base = new ArrayList<>();

        for (char p: polinomioList
        ) {
            if (p == '^'){
                bandera = true;
            }
            if (bandera){
                exponente.add(p);
                if (p == ')'){
                    bandera = false;
                    posicionExponente.add(numeroMonomios);
                }
            }else{
                if (p == '+' || p == '-' && index != 0){
                    numeroMonomios++;
                }
                base.add(p);
            }
            index++;
        }//for
        polinomio.setExponente(exponente);
        polinomio.setBase(base);
        polinomio.setPosicionExponente(posicionExponente);
        return polinomio;
    }

    public Map<List<Integer>, String[]> getExponente(String polinomio){
        Map<List<Integer>, String []> resultado = new HashMap<>();
        List<Character> exponentesOrigen = getValuesPolinomio(polinomio).getExponente();
        List<Integer> posicionExponente = getValuesPolinomio(polinomio).getPosicionExponente();
        String [] exponentes = new String[posicionExponente.size()];
        int noBinomio = 0;
        int index = 0;
        exponentes[0] = "";
        for (Character e: exponentesOrigen
             ) {
            if (e == '^' && index != 0){
                noBinomio++;
                exponentes[noBinomio] = "";
            }else if(e != '(' && e != ')' && e != '^'){
                exponentes[noBinomio] = exponentes[noBinomio] + e;
            }
            index++;
        }
        resultado.put(posicionExponente, exponentes);
        return resultado;
    }

    //public Map<List<Integer>, String[]> getBase(String polinomio){
    public void getBase(String polinomio){
        List<Character> base = getValuesPolinomio(polinomio).getBase();
        List<Integer> posicionExponente = getValuesPolinomio(polinomio).getPosicionExponente();
        //Map<List<Integer>, String []> resultado = new HashMap<>();
        System.out.println(base);
    }
}
