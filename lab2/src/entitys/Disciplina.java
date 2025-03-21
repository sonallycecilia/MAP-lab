package entitys;

import java.util.ArrayList;

import utils.*;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Horario horario;
    
    // construtores
    public Disciplina(String nome, Horario horario) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList<Aluno>();
    } 

    public Disciplina(String nome, Professor professor, Horario horario) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<Aluno>();
    }     

    // getters
    public String getNome() {
        return nome;
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

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorario(Horario horario){
        this.horario = horario;
    }
    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // metodos
    public int qtdDeAlunos(){
        return alunos.size();
    }
    public void printarAlunosMatriculados(){
        System.out.print("Os alunos matriculados da disciplina " + this.nome + " sao:\n");
        for(Aluno aluno : this.alunos){
            System.out.println(aluno.getNome());
        }
    }

}
