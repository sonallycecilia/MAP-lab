package entitys;

import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados;
    private String periodo;
    private String turno;

    public Turma(Disciplina disciplina, Professor professor, String periodo, String turno) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.turno = turno;
        this.alunosMatriculados = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    //metodos
    public Boolean matricularAluno(Aluno aluno) {
        return this.alunosMatriculados.add(aluno);
    }

    public Boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }
}
