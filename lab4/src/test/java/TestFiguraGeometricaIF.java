import org.example.figurasGeometricas.FiguraGeometricaIF;
import org.example.figurasGeometricas.Quadrado;
import org.example.figurasGeometricas.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFiguraGeometricaIF {
    @Test
    public void testMudancaFiguraGeometrica() {
        FiguraGeometricaIF fg = new Quadrado(5);
        double areaEsperada = 25;
        assertEquals(areaEsperada, fg.calcularArea(), 0.1);
        fg = null;

        fg = new Retangulo(5, 5);
        assertEquals(areaEsperada, fg.calcularArea(), 0.1);
    }
}
