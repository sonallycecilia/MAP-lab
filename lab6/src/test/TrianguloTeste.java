public class TrianguloTeste {
}
package figuras_geometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testEhTrianguloValido() {
        assertTrue(Triangulo.ehTriangulo(3, 4, 5));
        assertTrue(Triangulo.ehTriangulo(5, 5, 5));
        assertTrue(Triangulo.ehTriangulo(5, 5, 8));
    }

    @Test
    public void testNaoEhTriangulo() {
        assertFalse(Triangulo.ehTriangulo(1, 2, 3)); // soma 1+2 == 3, não é triângulo
        assertFalse(Triangulo.ehTriangulo(0, 4, 5)); // lado zero
        assertFalse(Triangulo.ehTriangulo(-1, 4, 5)); // lado negativo
    }

    @Test
    public void testEhIsosceles() {
        assertTrue(Triangulo.ehIsosceles(5, 5, 8));
        assertTrue(Triangulo.ehIsosceles(8, 5, 5));
        assertTrue(Triangulo.ehIsosceles(5, 8, 5));
        assertFalse(Triangulo.ehIsosceles(5, 6, 7));
        assertFalse(Triangulo.ehIsosceles(5, 5, 5)); // equilátero não é considerado isósceles aqui
    }

    @Test
    public void testEhEquilatero() {
        assertTrue(Triangulo.ehEquilatero(5, 5, 5));
        assertFalse(Triangulo.ehEquilatero(5, 5, 6));
    }

    @Test
    public void testEhRetangulo() {
        assertTrue(Triangulo.ehRetangulo(3, 4, 5));
        assertTrue(Triangulo.ehRetangulo(5, 12, 13));
        assertFalse(Triangulo.ehRetangulo(5, 5, 5));
    }

}
