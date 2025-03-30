package org.example.figurasGeometricas;

import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;

public class Circulo implements FiguraGeometricaIF{
    private String nome;
    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio){
        if(raio <= 0){
            throw new FiguraGeometricaException("Dados negativos e/ou menor que 0!");
        }
        this.raio = raio;
        this.nome = "Circulo";
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    //getters
    public double getRaio() {
        return raio;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public String getNome(){
        return nome;
    }

    //setters
    public void setRaio(double raio) {
        this.raio = raio;
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
        return Math.PI * Math.pow(raio, 2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
    @Override
    public String toString() {
        return String.format(
                "A figura é um %s com raio %.2f, área %.2f, perímetro %.2f",
                nome, raio, area, perimetro
        );
    }
}
