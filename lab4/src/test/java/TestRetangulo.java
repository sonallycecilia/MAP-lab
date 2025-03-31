import org.example.figurasGeometricas.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRetangulo {

    @Test
    public void testArea() {
        Retangulo retangulo = new Retangulo(4, 5);
        double areaEsperada = 20.0;
        assertEquals(areaEsperada, retangulo.getArea(), 0.0001);
    }

    @Test
    public void testPerimetro() {
        Retangulo retangulo = new Retangulo(4, 5);
        double perimetroEsperado = 18.0;
        assertEquals(perimetroEsperado, retangulo.getPerimetro(), 0.0001);
    }

    @Test
    public void testCriarRetanguloValido() {
        Retangulo retangulo = new Retangulo(4, 5);
        assertNotNull(retangulo, "O retângulo não deve ser nulo.");
    }

    @Test
    public void testCriarRetanguloLadosIguais() {
        Retangulo retangulo = new Retangulo(5, 5);
        double ladoEsperado = 5;
        assertEquals(ladoEsperado, retangulo.getLargura());
        assertEquals(ladoEsperado, retangulo.getComprimento());
    }
}
