package org.example.view;

import org.example.models.Assento;
import org.example.models.Observer;

import java.util.List;

public class Quiosque implements Observer {
    private final String identificador;

    public Quiosque(String id) {
        this.identificador = id;
    }

    @Override
    public void atualizar(List<Assento> assentos) {
        System.out.println("Quiosque " + identificador + ":");
        for (Assento a : assentos) {
            System.out.printf("Assento %d - %s\n", a.getNumero(), a.getStatus());
        }
        System.out.println("-------------------------");
    }
}