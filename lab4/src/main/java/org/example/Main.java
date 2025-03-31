package org.example;
import org.example.figurasGeometricas.*;

//TODO: adicionar o try_catch
public class Main {
    public static void main(String[] args) {

        FiguraGeometricaIF figura;
        try {
            figura = new Quadrado(5);
            System.out.println(figura.toString());

            figura = new Retangulo(5, 6);
            System.out.println(figura.toString());

            figura = new Triangulo(5, 6, 5);
            System.out.println(figura.toString());

            figura = new Circulo(5);
            System.out.println(figura.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}