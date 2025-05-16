package org.example.figuras_geometricas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void testGetLado() {
        Quadrado q = new Quadrado(5);
        assertEquals(5, q.getLado(), 0.0001);
    }

    @Test
    public void testSetLado() {
        Quadrado q = new Quadrado(5);
        q.setLado(10);
        assertEquals(10, q.getLado(), 0.0001);
    }

    @Test
    public void testGetArea() {
        Quadrado q = new Quadrado(4);
        assertEquals(16, q.getArea(), 0.0001);
    }

    @Test
    public void testGetPerimetro() {
        Quadrado q = new Quadrado(3);
        assertEquals(12, q.getPerimetro(), 0.0001);
    }
}
