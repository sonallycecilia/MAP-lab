package entitys;

import utils.Boletim;
import utils.Horario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private Horario horario;
    private String periodo;
    private ArrayList<Aluno> alunosMatriculados;

    public Turma(Disciplina disciplina, Professor professor, Horario horario, String periodo) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.alunosMatriculados = new ArrayList<>();
        this.horario = horario;
    }

    //getters
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public Horario getHorario() {
        return horario;
    }
    public String getPeriodo() {
        return periodo;
    }

    //setters
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // metodos
    public boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }
    public boolean matricularAluno(Aluno aluno){
        return this.alunosMatriculados.add(aluno);
    }
}
