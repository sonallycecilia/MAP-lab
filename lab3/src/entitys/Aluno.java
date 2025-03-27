package entitys;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private int cra;

    // construtores
    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getCra() {
        return cra;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCra(int cra) {
        this.cra = cra;
    }

    // metodos

}