package org.example.models;

import java.util.List;

public class Exponente {
    List<Integer> posicionExponente;
    List<Character> baseExactaDeExponente;
    String [] exponentes;

    public Exponente() {
    }

    public List<Integer> getPosicionExponente() {
        return posicionExponente;
    }

    public void setPosicionExponente(List<Integer> posicionExponente) {
        this.posicionExponente = posicionExponente;
    }

    public List<Character> getBaseExactaDeExponente() {
        return baseExactaDeExponente;
    }

    public void setBaseExactaDeExponente(List<Character> baseExactaDeExponente) {
        this.baseExactaDeExponente = baseExactaDeExponente;
    }

    public String[] getExponentes() {
        return exponentes;
    }

    public void setExponentes(String[] exponentes) {
        this.exponentes = exponentes;
    }
}
