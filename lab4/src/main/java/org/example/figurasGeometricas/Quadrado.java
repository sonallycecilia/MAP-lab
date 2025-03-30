package org.example.figurasGeometricas;

import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;

public class Quadrado implements FiguraGeometricaIF{
    private String nome;
    private double lado;
    private double area;
    private double perimetro;

    public Quadrado(double lado) {
        if (lado <= 0){
            throw new FiguraGeometricaException("Dados negativos e/ou menor que 0!");
        }
        this.nome = "Quadrado";
        this.lado = lado;
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    //getters
    public double getLado() {
        return lado;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public String getNome() {
        return nome;
    }

    //setters
    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos
    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return lado * 4;
    }

    @Override
    public String toString() {
        return "A figura é um " + nome +
                " com lado " + lado +
                ", area " + area +
                ", perimetro " + perimetro;
    }
}
