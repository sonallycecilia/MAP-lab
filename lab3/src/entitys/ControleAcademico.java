package entitys;

import utils.Boletim;
import utils.Horario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControleAcademico {
    private String nomeInstituicao;
    private String endereco;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;
    private Map<Aluno, Map<Disciplina, Boletim>> boletims;

    public ControleAcademico(String nome, String endereco) {
        this.nomeInstituicao = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.boletims = new HashMap<>();
    }

    //getters
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }
    public String getEndereco() {
        return endereco;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public Map<Aluno, Map<Disciplina, Boletim>> getBoletims() {
        return boletims;
    }
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    //setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    public void setBoletims(Map<Aluno, Map<Disciplina, Boletim>> boletims) {
        this.boletims = boletims;
    }

    //metodos
    public boolean criarAluno(String nome, int matricula) {
        return alunos.add(new Aluno(nome, matricula));
    }

    public boolean criarProfessor(String nome, int matricula) {
        return professores.add(new Professor(nome, matricula));
    }

    public boolean criarTurma(Disciplina disciplina, Professor professor, Horario horario, String periodo) {
        return turmas.add(new Turma(disciplina, professor, horario, periodo));
    }

    public boolean matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        return turma.matricularAluno(aluno);
    }
    public boolean removerAlunoEmTurma(Aluno aluno, Turma turma) {
        return turma.desvincularAluno(aluno);
    }

    public boolean adicionarNotas(Aluno aluno, Disciplina disciplina, Boletim boletim){
        boolean controle = false;
        if (!boletims.containsKey(aluno)) {
            boletims.put(aluno, new HashMap<>());
        }
        if(!controle){
            boletims.get(aluno).put(disciplina, boletim);
            controle = true;
        }
        return controle;
    }

}
