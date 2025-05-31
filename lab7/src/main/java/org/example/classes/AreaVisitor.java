package org.example.classes;

import org.example.classes.figuras.Circulo;
import org.example.classes.figuras.Retangulo;
import org.example.classes.figuras.Trapezio;
import org.example.classes.figuras.Triangulo;

public class AreaVisitor implements FiguraVisitorIF {
    public double visit(Circulo c) {
        double area = Math.PI * c.raio * c.raio;
        System.out.println("Área do Círculo: " + area);
    }
    public double visit(Triangulo t) {
        double area = (t.base * t.altura) / 2;
        System.out.println("Área do Triângulo: " + area);
        return area;
    }
    public double visit(Retangulo r) {
        double area = r.largura * r.altura;
        System.out.println("Área do Retângulo: " + area);
        return area;
    }
    public double visit(Trapezio t) {
        double area = ((t.baseMaior + t.baseMenor) * t.altura) / 2;
        System.out.println("Área do Trapézio: " + area);
        return area;
    }
}
