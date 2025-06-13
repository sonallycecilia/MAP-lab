package org.example.models;

import java.util.List;

public interface Observer {
    void atualizar(List<Assento> assentos);
}