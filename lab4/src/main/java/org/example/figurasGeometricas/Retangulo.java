package org.example.figurasGeometricas;

import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;

public class Retangulo implements FiguraGeometricaIF{
    private String nome;
    private double largura;
    private double comprimento;
    private double area;
    private double perimetro;

    public Retangulo(double largura, double comprimento) throws FiguraGeometricaException{
        if (comprimento <= 0 || largura <= 0){
            throw new FiguraGeometricaException("Dados negativos ou iguais a 0!");
        }
        if (comprimento == largura){
            throw new FiguraGeometricaException("Voce deveria instanciar um quadrado!");
        }
        this.nome = "Retangulo";
        this.largura = Math.min(largura, comprimento);
        this.comprimento = Math.max(comprimento, largura);
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

    //getters
    public double getLargura() {
        return largura;
    }
    public double getComprimento() {
        return comprimento;
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
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
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
        return comprimento * largura;
    }
    public double calcularPerimetro(){
        return (comprimento + largura)*2;
    }

    @Override
    public String toString() {
        return "A figura é um " + nome +
                " com comprimento " + comprimento +
                ", largura " + largura +
                ", area " + area +
                ", perimetro " + perimetro;
    }

}
