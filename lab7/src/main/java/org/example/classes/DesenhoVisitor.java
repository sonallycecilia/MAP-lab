package org.example.classes;

import org.example.classes.figuras.Circulo;
import org.example.classes.figuras.Retangulo;
import org.example.classes.figuras.Trapezio;
import org.example.classes.figuras.Triangulo;

public class DesenhoVisitor implements FiguraVisitorIF {
    public void visit(Circulo c) {
        System.out.println("Desenhando Círculo com raio " + c.raio);
    }
    public void visit(Triangulo t) {
        System.out.println("Desenhando Triângulo com base " + t.base + " e altura " + t.altura);
    }
    public void visit(Retangulo r) {
        System.out.println("Desenhando Retângulo de " + r.largura + "x" + r.altura);
    }
    public void visit(Trapezio t) {
        System.out.println("Desenhando Trapézio com bases " + t.baseMaior + " e " + t.baseMenor);
    }
}

