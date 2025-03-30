package org.example;
import org.example.figurasGeometricas.*;

public class Main {
    public static void main(String[] args) {
        FiguraGeometricaIF figura;

        figura = new Quadrado(5);
        System.out.println(figura.toString());

        figura = new Retangulo(5, 6);
        System.out.println(figura.toString());

        figura = new Triangulo(5, 6, 5);
        System.out.println(figura.toString());

        figura = new Circulo(5);
        System.out.println(figura.toString());
    }
}