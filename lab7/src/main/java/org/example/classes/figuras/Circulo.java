package org.example.classes.figuras;

import org.example.classes.FiguraVisitorIF;

public class Circulo implements FiguraIF {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void accept(FiguraVisitorIF visitor) {
        visitor.visit(this);
    }
}
