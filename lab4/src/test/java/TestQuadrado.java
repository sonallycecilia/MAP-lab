import org.example.figurasGeometricas.Quadrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestQuadrado {

    @Test
    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(4);
        double areaEsperada = 16.0;
        assertEquals(areaEsperada, quadrado.getArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(4);
        double perimetroEsperado = 16.0;
        assertEquals(perimetroEsperado, quadrado.getPerimetro(), 0.0001);
    }
}
