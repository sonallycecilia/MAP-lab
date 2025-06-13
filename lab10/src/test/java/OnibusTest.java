import org.example.models.*;
import org.example.control.Guiche;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    private Onibus onibus;
    private TestObserver observer;

    @BeforeEach
    void setup() {
        onibus = new Onibus(5);
        observer = new TestObserver();
        onibus.adicionarObservador(observer);
    }

    @Test
    void testReservaAssentoAtualizaObserver() {
        onibus.reservarAssento(1);

        assertEquals(1, observer.chamadas);
        assertEquals(StatusAssento.RESERVADO, observer.ultimoEstado.get(0).getStatus());
    }

    @Test
    void testVendaAssentoAtualizaObserver() {
        onibus.venderAssento(2);

        assertEquals(1, observer.chamadas);
        assertEquals(StatusAssento.INDISPONIVEL, observer.ultimoEstado.get(1).getStatus());
    }

    @Test
    void testMultiplosObservadoresSaoNotificados() {
        TestObserver outroObserver = new TestObserver();
        onibus.adicionarObservador(outroObserver);

        onibus.venderAssento(3);

        assertEquals(1, observer.chamadas);
        assertEquals(1, outroObserver.chamadas);
    }

    // Classe de apoio para simular um observador
    private static class TestObserver implements Observer {
        int chamadas = 0;
        List<Assento> ultimoEstado;

        @Override
        public void atualizar(List<Assento> assentos) {
            chamadas++;
            // Cópia simples da lista (shallow copy para simplificar)
            ultimoEstado = new ArrayList<>(assentos);
        }
    }
}
