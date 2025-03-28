package entitys;

import utils.Boletim;

import java.util.Map;

public class Aluno {
    private String nome;
    private int matricula;
    private double cra;

    // construtores
    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.cra = 0;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getCra() {
        return cra;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCra(double cra) {
        this.cra = cra;
    }

}