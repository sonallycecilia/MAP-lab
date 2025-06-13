package org.example;

import org.example.control.Guiche;
import org.example.models.Onibus;
import org.example.view.PainelCentral;
import org.example.view.Quiosque;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(10);

        PainelCentral painel = new PainelCentral();
        Quiosque q1 = new Quiosque("Q1");
        Quiosque q2 = new Quiosque("Q2");

        onibus.adicionarObservador(painel);
        onibus.adicionarObservador(q1);
        onibus.adicionarObservador(q2);

        Guiche guiche = new Guiche(onibus);

        guiche.reservar(3);
        guiche.vender(3);
        guiche.vender(5);
    }
}