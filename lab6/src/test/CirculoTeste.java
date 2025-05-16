package figuras_geometricas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    public void testSingletonInstance() {
        Circulo c1 = Circulo.getInstance();
        Circulo c2 = Circulo.getInstance();
        assertSame(c1, c2, "getInstance deve retornar a mesma instância (singleton)");
    }

    @Test
    public void testSetAndGetRaioValido() {
        Circulo c = Circulo.getInstance();
        c.setRaio(5.0);
        assertEquals(5.0, c.getRaio(), 0.0001);
    }

    @Test
    public void testSetRaioInvalido() {
        Circulo c = Circulo.getInstance();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            c.setRaio(-1);
        });
        assertEquals("O raio deve ser maior que 0", thrown.getMessage());
    }

    @Test
    public void testCalculoArea() {
        Circulo c = Circulo.getInstance();
        c.setRaio(3);
        double expectedArea = Math.PI * 3 * 3;
        assertEquals(expectedArea, c.getArea(), 0.0001);
    }

    @Test
    public void testCalculoPerimetro() {
        Circulo c = Circulo.getInstance();
        c.setRaio(4);
        double expectedPerimetro = 2 * Math.PI * 4;
        assertEquals(expectedPerimetro, c.getPerimetro(), 0.0001);
    }
}
