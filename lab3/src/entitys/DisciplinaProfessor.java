//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entitys;

import java.util.ArrayList;
import utils.Horario;

public class DisciplinaProfessor {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Horario horario;

    public DisciplinaProfessor(String nome, Horario horario) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList();
    }

    public DisciplinaProfessor(String nome, Professor professor, Horario horario) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList();
    }

    public String getNome() {
        return this.nome;
    }

    public Horario getHorario() {
        return this.horario;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int qtdDeAlunos() {
        return this.alunos.size();
    }

    public void printarAlunosMatriculados() {
        System.out.print("Alunos matriculados em " + this.nome + ":\n");

        for(Aluno aluno : this.alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
