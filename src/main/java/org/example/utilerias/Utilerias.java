package org.example.utilerias;

import org.example.models.Base;
import org.example.models.Exponente;
import org.example.models.Polinomio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilerias {

    //Convierte el String del polinomio en una Lista de caracteres
    private List<Character> guardarValoresEnLista(String polinomio){
        List<Character> valoresPolinomios = new ArrayList<>();
        for (int i = 0; i < polinomio.length(); i++) {
            valoresPolinomios.add(polinomio.charAt(i));
        }
        return valoresPolinomios;
    }

    //AQUI BASICAMENTE SE HACE LA DIVISION DE BASE Y EXPONENTE
    //Se hace la division de la base y los exponentes
    //Se obtiene el exponente
    //Se obtiene la posicion exponente
    //Se obtiene la literal exacta del exponente
    public Polinomio getValuesPolinomio(String polinomioString){
        List<Character>polinomioList = guardarValoresEnLista(polinomioString);
        Polinomio polinomio = new Polinomio();
        boolean bandera = false;
        int numeroMonomios = 0;
        int index=0;
        List<Integer> posicionExponente = new ArrayList<>();
        List<Character> exponente = new ArrayList<>();
        List<Character> base = new ArrayList<>();
        List<Character> baseExactaDeExponente = new ArrayList<>();

        for (char p: polinomioList
        ) {
            if (p == '^'){
                bandera = true;
                baseExactaDeExponente.add(polinomioList.get(index-1));
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
        polinomio.setBaseExactaDeExponente(baseExactaDeExponente);
        return polinomio;
    }

    //UTILIZANDO getValuesPolinomio SE OBTIENE TODOS LOS DATOS DEL EXPONENTE
    //Se obtiene el numero de la posicion del monomio en el que se encuentra el exponente y
    //los valores de los exponentes
    //Se obtiene la literal exacta del exponente
    public Exponente getExponente(String polinomio){
        Exponente exponente = new Exponente();
        exponente.setPosicionExponente(getValuesPolinomio(polinomio).getPosicionExponente());
        exponente.setBaseExactaDeExponente(getValuesPolinomio(polinomio).getBaseExactaDeExponente());
        String [] exponentes = new String[exponente.getPosicionExponente().size()];
        int noBinomio = 0;
        int index = 0;
        exponentes[0] = "";
        for (Character e: getValuesPolinomio(polinomio).getExponente()
             ) {
            if (e == '^' && index != 0){
                noBinomio++;
                exponentes[noBinomio] = "";
            }else if(e != '(' && e != ')' && e != '^'){
                exponentes[noBinomio] = exponentes[noBinomio] + e;
            }
            index++;
        }
        exponente.setExponentes(exponentes);
        return exponente;
    }

    //SE OBTIENE TODOS LOS VALORES ACERCA DE LA BASE OSEA DE CADA MONOMIO
    //Se obtiene el numero de la posicion del monomio en el que se encuentra el exponente
    //Se obtiene los signos de cada monomio
    //Se obtiene los coeficientes de cada monomio
    //Se obtiene las literales de cada monomio
    public Base getBase(String polinomio){
        List<Character> base = getValuesPolinomio(polinomio).getBase();
        List<Integer> posicionExponente = getValuesPolinomio(polinomio).getPosicionExponente();
        Map<Integer, Character> signos = new HashMap<>();
        Map<Integer, String> coeficientes = new HashMap<>();
        Map<Integer, String> incognita = new HashMap<>();
        Base resultado = new Base();
        String coeficientesStr = "";
        String incognitaStr = "";
        int index = 0;

        for (Character b:base
             ) {
            if (b == '+' || b == '-'){
                if (!coeficientesStr.equals("") || !incognitaStr.equals("")) {
                    if (coeficientesStr.equals("")){
                        coeficientesStr = "1";
                    }
                    coeficientes.put(index, coeficientesStr);
                    coeficientesStr = "";
                    incognita.put(index, incognitaStr);
                    incognitaStr = "";
                    if (signos.isEmpty()){
                        signos.put(index, '+');
                    }
                    index++;
                }
                signos.put(index, b);
            }
            if (Character.isDigit(b)){
                coeficientesStr = coeficientesStr+b;
            } else if (Character.isLetter(b)) {
                incognitaStr = incognitaStr+b;
            }
        }
        //Para cuando sea la ultima iteracion
        if (!incognitaStr.equals("") || !coeficientesStr.equals("")){
            if (coeficientesStr.equals("")){
                coeficientesStr = "1";
            }
            coeficientes.put(index, coeficientesStr);
            incognita.put(index, incognitaStr);
        }
        resultado.setCoeficientes(coeficientes);
        resultado.setIncognita(incognita);
        resultado.setPosicionExponente(posicionExponente);
        resultado.setSignos(signos);
        return resultado;
    }
}
