import org.example.figurasGeometricas.Circulo;
import org.example.figurasGeometricas.Quadrado;
import org.example.figurasGeometricas.Retangulo;
import org.example.figurasGeometricas.Triangulo;
import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFIguraGeometricaException {
    @Test
    public void testCirculoInvalido() {
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Circulo(-1);
        });
        assertEquals("Dados negativos e/ou menor que 0!", exception.getMessage());
    }
    @Test
    public void testCriarRetanguloInvalidoNegativo() {
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Retangulo(-4, 5); // Largura negativa
        });
        assertEquals("Dados negativos!", exception.getMessage());
    }

    @Test
    public void testTrianguloInvalido() {
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Triangulo(1, 1, 5);
        });
        assertEquals("Os lados fornecidos não formam um triângulo válido!", exception.getMessage());
    }
    @Test
    public void testQuadradoInvalido(){
        Exception exception = assertThrows(FiguraGeometricaException.class, () -> {
            new Quadrado(-1);
        });
        assertEquals("Dados negativos e/ou menor que 0!", exception.getMessage());
    }
}
