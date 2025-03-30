package utils;

public class Boletim {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double media1;
    private double media2;

    private double mediaGeral;

    public Boletim(double nota1, double nota2, double nota3, double nota4) {
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
        calcularMedia1();
        calcularMedia2();
        calcularMediaGeral();
    }
    //getters
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public double getNota4() {
        return nota4;
    }

    //setters
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    //metodos
    public double calcularMedia1(){
        return this.media1 = nota1 + nota2;
    }
    public double calcularMedia2(){
        return this.media2 = nota3 + nota4;
    }
    public double calcularMediaGeral(){
        return mediaGeral = media1 + media2;
    }

    public void setTodasAsNotas(double nota1, double nota2, double nota3, double nota4){
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    @Override
    public String toString() {
        return "Primeira nota: " + nota1 +
                " | Segunda nota: " + nota2 +
                " | Terceira nota: " + nota3 +
                " | Quarta nota: " + nota4 +
                " Media Geral -> " + mediaGeral;
    }
}
