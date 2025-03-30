import org.example.figurasGeometricas.Triangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangulo {
    @Test
    public void testCalcularArea() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double areaEsperada = 6.0;
        assertEquals(areaEsperada, triangulo.getArea(), 0.0001);
    }

    @Test
    public void testTrianguloInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(1, 1, 5);
        });
        assertEquals("Os lados fornecidos não formam um triângulo válido!", exception.getMessage());
    }

    @Test
    public void testTipoTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo(3, 3, 3);
        assertEquals("Equilatero", triangulo.getTipo());
    }

    @Test
    public void testTipoTrianguloIsosceles() {
        Triangulo triangulo = new Triangulo(3, 3, 4);
        assertEquals("Isosceles", triangulo.getTipo());
    }

    @Test
    public void testTipoTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals("Escaleno", triangulo.getTipo());
    }

    @Test
    public void testCalcularAltura() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double alturaEsperada = 3.0;
        assertEquals(alturaEsperada, triangulo.getAltura(), 0.0001);
    }

    @Test
    public void testCalcularSemiPerimetro() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double semiPerimetroEsperado = 6.0;
        assertEquals(semiPerimetroEsperado, triangulo.getSemiperimetro(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double perimetroEsperado = 12.0;
        assertEquals(perimetroEsperado, triangulo.getPerimetro(), 0.0001);
    }
}
