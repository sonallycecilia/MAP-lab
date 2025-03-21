package entitys;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private int matricula;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void vincularProfessor(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}
