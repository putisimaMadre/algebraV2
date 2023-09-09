package org.example.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Base {
    List<Integer> posicionExponente = new ArrayList<>();
    Map<Integer, Character> signos = new HashMap<>();
    Map<Integer, String> coeficientes = new HashMap<>();
    Map<Integer, String> incognita = new HashMap<>();

    public Base() {
    }

    public List<Integer> getPosicionExponente() {
        return posicionExponente;
    }

    public void setPosicionExponente(List<Integer> posicionExponente) {
        this.posicionExponente = posicionExponente;
    }

    public Map<Integer, Character> getSignos() {
        return signos;
    }

    public void setSignos(Map<Integer, Character> signos) {
        this.signos = signos;
    }

    public Map<Integer, String> getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(Map<Integer, String> coeficientes) {
        this.coeficientes = coeficientes;
    }

    public Map<Integer, String> getIncognita() {
        return incognita;
    }

    public void setIncognita(Map<Integer, String> incognita) {
        this.incognita = incognita;
    }
}
