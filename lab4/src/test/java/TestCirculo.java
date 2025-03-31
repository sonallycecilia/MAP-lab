import org.example.figurasGeometricas.Circulo;
import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCirculo {

    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        double areaEsperada = Math.PI * 25;
        assertEquals(areaEsperada, circulo.getArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo circulo = new Circulo(5);
        double perimetroEsperado = 2 * Math.PI * 5;
        assertEquals(perimetroEsperado, circulo.getPerimetro(), 0.0001);
    }

    @Test
    public void testCirculoInvalido() {
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Circulo(-1);
        });
        assertEquals("Dados negativos e/ou menor que 0!", exception.getMessage());
    }
}