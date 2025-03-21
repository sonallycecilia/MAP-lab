package entitys;

import java.util.ArrayList;

import entitys.*;
import utils.*;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Horario horario;
    
    public Disciplina(String nome, Professor professor, Horario horario) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<Aluno>();
            
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorario(Horario horario){
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int qtdDeAlunos(){
        return alunos.size();
    }
}
