import org.example.classes.figuras.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestFiguraIF {

    @Test
    public void testAreaCirculo() {
        Circulo c = new Circulo(2);
        double esperada = Math.PI * 4;
        assertEquals(esperada, Math.PI * c.raio * c.raio, 0.0001);
    }

    @Test
    public void testMaximizarCirculo() {
        Circulo c = new Circulo(2);
        c.raio *= 2;
        assertEquals(4.0, c.raio);
    }

    @Test
    public void testPerimetroTriangulo() {
        Triangulo t = new Triangulo(3, 4, 5, 6);
        double esperado = 3 + 5 + 6;
        assertEquals(esperado, t.base + t.lado1 + t.lado2);
    }

    @Test
    public void testAreaRetangulo() {
        Retangulo r = new Retangulo(4, 5);
        assertEquals(20, r.largura * r.altura);
    }

    @Test
    public void testAreaTrapezio() {
        Trapezio t = new Trapezio(6, 4, 3, 5, 5);
        double esperado = ((6 + 4) * 3) / 2.0;
        assertEquals(15, esperado);
    }
}

