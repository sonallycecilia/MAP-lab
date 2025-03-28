package entitys;

import utils.Boletim;
import utils.Horario;

import java.util.ArrayList;
import java.util.Map;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private Horario horario;
    private String periodo;
    private ArrayList<Aluno> alunosMatriculados;
    private Map<Aluno, Boletim> medias;

    // A classe Horario deve ser instanciada ao criar uma turma? Ou deve ser definido posteriormente?
    //acho que na propria turma
    public Turma(Disciplina disciplina, Professor professor, Horario horario, String periodo) {
        this.disciplina = disciplina;
        this.professor = professor;
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
    // Essa responsabilidade deve ser da Turma ou de ControleAcademico?
    //controle academico, mas deve ter em turno
    public Boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }
    public Boolean matricularAluno(Aluno aluno){
        return this.alunosMatriculados.add(aluno);
    }
}
