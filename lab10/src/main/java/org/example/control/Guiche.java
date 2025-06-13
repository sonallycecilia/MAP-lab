package org.example.control;

import org.example.models.Onibus;

public class Guiche {
    private final Onibus onibus;

    public Guiche(Onibus o) {
        this.onibus = o;
    }

    public void reservar(int numero) {
        onibus.reservarAssento(numero);
    }

    public void vender(int numero) {
        onibus.venderAssento(numero);
    }
}
