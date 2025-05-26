package org.example.classes.figuras;

import org.example.classes.FiguraVisitorIF;

public class Triangulo implements FiguraIF {
    public double base, altura, lado1, lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void accept(FiguraVisitorIF visitor) {
        visitor.visit(this);
    }
}
