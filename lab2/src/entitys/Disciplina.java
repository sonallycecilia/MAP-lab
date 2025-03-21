package entitys;

import java.util.ArrayList;
import java.util.HashMap;

import entitys.*;
import entitys.utils.*;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private HashMap<Dias, Horas> horario;
    
    public Disciplina(String nome, Professor professor, HashMap<Dias, Horas> horario) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();     
        this.horario = horario;   
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
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

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int qtdDeAlunos(){
        return alunos.size();
    }
}
