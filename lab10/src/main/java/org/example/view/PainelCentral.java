package org.example.view;

import org.example.models.Assento;
import org.example.models.Observer;

import java.util.List;

public class PainelCentral implements Observer {
    @Override
    public void atualizar(List<Assento> assentos) {
        System.out.println("Painel Central:");
        for (Assento a : assentos) {
            String cor = switch (a.getStatus()) {
                case DISPONIVEL -> "Verde";
                case RESERVADO -> "Amarelo";
                case INDISPONIVEL -> "Vermelho";
            };
            System.out.printf("[%d:%s] ", a.getNumero(), cor);
        }
        System.out.println("\n-------------------------");
    }
}