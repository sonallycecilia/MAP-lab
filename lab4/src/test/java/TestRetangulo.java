import org.example.figurasGeometricas.Retangulo;
import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;
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
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> new Retangulo(5, 5));
        assertEquals("Voce deveria instanciar um quadrado!", exception.getMessage());
    }

    @Test
    public void testCriarRetanguloInvalidoNegativo() {
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Retangulo(-4, 5); // Largura negativa
        });
        assertEquals("Dados negativos ou iguais a 0!", exception.getMessage());
    }
}
