package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private List<Assento> assentos;
    private List<Observer> observadores;

    public Onibus(int totalAssentos) {
        assentos = new ArrayList<>();
        observadores = new ArrayList<>();
        for (int i = 1; i <= totalAssentos; i++) {
            assentos.add(new Assento(i, StatusAssento.DISPONIVEL));
        }
    }

    public void adicionarObservador(Observer obs) {
        observadores.add(obs);
    }

    private void notificar() {
        for (Observer obs : observadores) {
            obs.atualizar(assentos);
        }
    }

    public void reservarAssento(int numero) {
        Assento a = assentos.get(numero - 1);
        a.setStatus(StatusAssento.RESERVADO);
        notificar();
    }

    public void venderAssento(int numero) {
        Assento a = assentos.get(numero - 1);
        a.setStatus(StatusAssento.INDISPONIVEL);
        notificar();
    }

    public List<Assento> getAssentos() {
        return assentos;
    }
}
