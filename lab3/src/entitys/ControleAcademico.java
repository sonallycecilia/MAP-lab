package entitys;

import utils.Horario;

import java.util.ArrayList;


public class ControleAcademico {
    private String nomeInstituicao;
    private String endereco;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    // construtor
    public ControleAcademico(String nome, String endereco) {
        this.nomeInstituicao = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    // getters
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
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    // setters
    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }
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

    // métodos cadastro
    public Aluno cadastrarAluno(String nome, int matricula) throws ControleAcademicoException {
        Aluno aluno = null;
        if(getAlunoPorMatricula(matricula) == null){
            aluno = new Aluno(nome, matricula);
            alunos.add(aluno);
        } else{
            throw new ControleAcademicoException("O Aluno "+nome+" com Matricula "+matricula+" ja esta cadastrado");
        }
        return aluno;
    }

    public Professor cadastrarProfessor(String nome, int matricula) throws ControleAcademicoException{
        Professor professor = null;
        if(getProfessorPorMatricula(matricula) == null){
            professor = new Professor(nome, matricula);
            professores.add(professor);
        } else {
            throw new ControleAcademicoException("O Professor "+nome+" com Matricula "+matricula+" ja esta cadastrado");
        }

        return professor;
    }

    public Disciplina cadastrarDisciplina(String nome, int cargaHoraria, int id) throws ControleAcademicoException{
        Disciplina disciplina = null;
        if(getDisciplinaPorID(id) == null){
            disciplina = new Disciplina(nome, cargaHoraria, id);
            disciplinas.add(disciplina);
        } else {
            throw new ControleAcademicoException("A Disciplina "+nome+" com Id"+id+" ja esta cadastrada");
        }
        return disciplina;
    }

    public Turma cadastrarTurma(Disciplina disciplina, Professor professor, Horario horario, String periodo, int id) throws ControleAcademicoException{
        Turma turma = null;
        if(getTurmaPorId(id) == null){
            turma = new Turma(disciplina, professor, horario, periodo, id);
            turmas.add(turma);
        } else{
            throw new ControleAcademicoException("A Turma de "+disciplina.getNome()+" com Id"+id+" ja esta cadastrada");
        }


        return turma;
    }

    // métodos de horário
    // métodos de get não deveriam lanças exceções
    public ArrayList<Horario> getHorariosProfessor(int matricula) throws ControleAcademicoException {
        ArrayList<Horario> horarios = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getProfessor().getMatricula() == matricula) {
                horarios.add(turma.getHorario());
            }
        }
        if (horarios.isEmpty()) {
            throw new ControleAcademicoException("Professor com matrícula " + matricula + " não leciona em nenhuma turma.");
        }
        return horarios;
    }

    // Não retorna a disciplina que ele tem aula naquele horário
    public ArrayList<Horario> getHorariosAluno(int matricula) throws ControleAcademicoException {
        ArrayList<Horario> horarios = new ArrayList<>();
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunosMatriculados()) {
                if (aluno.getMatricula() == matricula) {
                    horarios.add(turma.getHorario());
                }
            }
        }
        if (horarios.isEmpty()) {
            throw new ControleAcademicoException("Aluno com matrícula " + matricula + " não está matriculado em nenhuma turma.");
        }
        return horarios;
    }

    public ArrayList<Disciplina> getDisciplinasProfessor(int matricula) throws ControleAcademicoException {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getProfessor().getMatricula() == matricula) {
                disciplinas.add(turma.getDisciplina());
            }
        }
        if (disciplinas.isEmpty()) {
            throw new ControleAcademicoException("Professor com matrícula " + matricula + " não leciona nenhuma disciplina.");
        }
        return disciplinas;
    }

    public ArrayList<Disciplina> getDisciplinasAluno(int matricula) throws ControleAcademicoException {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunosMatriculados()) {
                if (aluno.getMatricula() == matricula) {
                    disciplinas.add(turma.getDisciplina());
                }
            }
        }
        if (disciplinas.isEmpty()) {
            throw new ControleAcademicoException("Professor com matrícula " + matricula + " não leciona nenhuma disciplina.");
        }
        return disciplinas;
    }

    // métodos de filtro
    // Removido o lançamento da exceção
    public Disciplina getDisciplinaPorID(int id)  {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId() == id) {
                return disciplina;
            }
        }
        return null;
    }

    public Turma getTurmaPorId(int id) {
        for (Turma turma : turmas) {
            if (turma.getId() == id) {
                return turma;
            }
        }
        return null;
    }

    // Removido o lançamento da exceção
    public Professor getProfessorPorMatricula(Integer matricula) {
        for (Professor professor : professores) {
            if (professor.getMatricula() == matricula) {
                return professor;
            }
        }
        return null;
    }

    // Removido o lançamento da exceção
    public Aluno getAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
}

