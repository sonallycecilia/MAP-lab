package org.example.figurasGeometricas;

public class Retangulo {
    private double largura;
    private double comprimento;
    private double area;
    private double perimetro;

    public Retangulo(double largura, double comprimento){
        if (comprimento < 0 || largura < 0){
            throw new IllegalArgumentException("Dados negativos!");
        }
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

    //metodos
    public double calcularArea(){
        return comprimento * largura;
    }
    public double calcularPerimetro(){
        return (comprimento + largura)*2;
    }
    @Override
    public String toString() {
        return "O Retângulo possui comprimento " +
                comprimento + " largura " + largura +
                " e area " + area;
    }

}
