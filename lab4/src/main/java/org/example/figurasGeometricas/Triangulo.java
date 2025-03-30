package org.example.figurasGeometricas;

import org.example.figurasGeometricas.exceptions.FiguraGeometricaException;

public class Triangulo implements FiguraGeometricaIF{
    private String nome;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double area;
    private double perimetro;
    private double semiperimetro;
    private double altura;
    private String tipo;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        if(ladoA <= 0 || ladoB <= 0 || ladoC <= 0){
            throw new FiguraGeometricaException("Não existe lado negativo!");
        }
        if (!validarTriangulo()) {
            throw new FiguraGeometricaException("Os lados fornecidos não formam um triângulo válido!");
        }

        this.nome = "Triangulo";
        this.semiperimetro = calcularSemiPerimetro();
        this.perimetro = calcularPerimetro();
        this.area = calcularArea();
        this.altura = calcularAltura();
        this.tipo = definirTipo();
    }

    //getters
    public double getLadoA() {
        return ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public String getTipo() {
        return tipo;
    }
    public double getAltura() {
        return altura;
    }
    public double getSemiperimetro() {
        return semiperimetro;
    }
    public String getNome() {
        return nome;
    }

    //setters
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setSemiperimetro(double semiperimetro) {
        this.semiperimetro = semiperimetro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos
    public double calcularArea(){
        return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
    }

    public double calcularSemiPerimetro(){
        return (ladoA + ladoB + ladoC) / 2.0;
    }

    public double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }

    public double calcularAltura(){
        return (2 * this.area)/ladoB;
    }

    public String definirTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilatero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    public boolean validarTriangulo(){
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    @Override
    public String toString() {
        return "A figura é um " + nome +
                " com laterais " + ladoA + ", " + ladoC +
                " e base " + ladoB +
                " do tipo " + tipo +
                ", area " + area +
                ", perimetro " + perimetro;
    }
}
