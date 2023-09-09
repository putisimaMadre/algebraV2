package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Polinomio {
    public List<Integer> posicionExponente = new ArrayList<>();
    public List<Character> exponente = new ArrayList<>();
    public List<Character> base = new ArrayList<>();

    List<Character> baseExactaDeExponente = new ArrayList<>();

    public Polinomio() {
    }

    public List<Integer> getPosicionExponente() {
        return posicionExponente;
    }

    public void setPosicionExponente(List<Integer> posicionExponente) {
        this.posicionExponente = posicionExponente;
    }

    public List<Character> getExponente() {
        return exponente;
    }

    public void setExponente(List<Character> exponente) {
        this.exponente = exponente;
    }

    public List<Character> getBase() {
        return base;
    }

    public void setBase(List<Character> base) {
        this.base = base;
    }

    public List<Character> getBaseExactaDeExponente() {
        return baseExactaDeExponente;
    }

    public void setBaseExactaDeExponente(List<Character> baseExactaDeExponente) {
        this.baseExactaDeExponente = baseExactaDeExponente;
    }
}
