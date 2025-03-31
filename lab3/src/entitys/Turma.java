package entitys;

import utils.Boletim;
import utils.Horario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turma {
    private int id;
    private Disciplina disciplina;
    private Professor professor;
    private Horario horario;
    private String periodo;
    private ArrayList<Aluno> alunosMatriculados;
    private Map<Aluno, Boletim> notas;

    public Turma(Disciplina disciplina, Professor professor, Horario horario, String periodo, int id) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.alunosMatriculados = new ArrayList<>();
        this.notas = new HashMap<>();
        this.horario = horario;
        this.id = id;
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
    public Map<Aluno, Boletim> getBoletim(){
        return notas;
    }
    public int getId() {
        return id;
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
    public void setBoletim(Map<Aluno, Boletim> boletim) {
        this.notas = boletim;
    }
    public void setId(int id) {
        this.id = id;
    }

    // metodos
    //TODO: Adicionar as veificações, se o aluno já existe
    public boolean matricularAluno(Aluno aluno){
        return this.alunosMatriculados.add(aluno);
    }
    public boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }
    public Boletim registrarNotas(Aluno aluno, double nota1, double nota2, double nota3, double nota4){
        Boletim boletim = new Boletim(nota1, nota2, nota3, nota4);
        this.notas.put(aluno, boletim);
        return boletim;
    }
    public Boletim consultarNotas(Aluno aluno){
        if(!this.notas.containsKey(aluno)){
            throw new ControleAcademicoException("Aluno não esta matriculado!");
        }
        return this.notas.get(aluno);
    }
    public void listarAlunos(){
        for(Aluno aluno : this.alunosMatriculados){
            System.out.println(aluno.toString());
        }
    }
}
