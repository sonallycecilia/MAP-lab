package org.example.classes.figuras;

import org.example.classes.FiguraVisitorIF;

public class Retangulo implements FiguraIF {
    public double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void accept(FiguraVisitorIF visitor) {
        visitor.visit(this);
    }
}
