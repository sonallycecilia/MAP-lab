package org.example.figurasGeometricas;

public class Quadrado {
    private double lado;
    private double area;
    private double perimetro;

    public Quadrado(double lado) {
        if (lado <= 0){
            throw new IllegalArgumentException("Dados negativos e/ou menor que 0!");
        }
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

    //metodos
    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return lado * 4;
    }
}
