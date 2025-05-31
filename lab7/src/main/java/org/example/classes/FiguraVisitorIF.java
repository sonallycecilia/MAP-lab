package org.example.classes;

import org.example.classes.figuras.Circulo;
import org.example.classes.figuras.Retangulo;
import org.example.classes.figuras.Trapezio;
import org.example.classes.figuras.Triangulo;

public interface FiguraVisitorIF {
    double visit(Circulo circulo);
    double visit(Triangulo triangulo);
    double visit(Trapezio trapezio);
    double visit(Retangulo trapezio);
}
