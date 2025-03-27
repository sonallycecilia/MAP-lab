package entitys;

import utils.Horario;
import utils.enums.Dia;
import utils.enums.HoraAula;

import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados;
    private Horario horario;

    // A classe Horario deve ser instanciada ao criar uma turma? Ou deve ser definido posteriormente?
    public Turma(Disciplina disciplina, Professor professor, Dia dia, HoraAula horaAula) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
        this.horario = new Horario(dia, horaAula);
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

    // metodos

    // Essa responsabilidade deve ser da Turma ou de ControleAcademico?
    public Boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
