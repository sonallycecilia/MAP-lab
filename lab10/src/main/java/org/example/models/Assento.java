package org.example.models;

public class Assento {
    private int numero;
    private StatusAssento status;

    public Assento(int numero, StatusAssento status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public StatusAssento getStatus() {
        return status;
    }

    public void setStatus(StatusAssento status) {
        this.status = status;
    }
}