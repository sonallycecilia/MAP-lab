package org.example.classes;

import org.example.classes.figuras.Circulo;
import org.example.classes.figuras.Retangulo;
import org.example.classes.figuras.Trapezio;
import org.example.classes.figuras.Triangulo;

public class PerimetroVisitor implements FiguraVisitorIF {
    public void visit(Circulo c) {
        double perimetro = 2 * Math.PI * c.raio;
        System.out.println("Perímetro do Círculo: " + perimetro);
    }
    public void visit(Triangulo t) {
        double perimetro = t.base + t.lado1 + t.lado2;
        System.out.println("Perímetro do Triângulo: " + perimetro);
    }
    public void visit(Retangulo r) {
        double perimetro = 2 * (r.largura + r.altura);
        System.out.println("Perímetro do Retângulo: " + perimetro);
    }
    public void visit(Trapezio t) {
        double perimetro = t.baseMaior + t.baseMenor + t.lado1 + t.lado2;
        System.out.println("Perímetro do Trapézio: " + perimetro);
    }
}