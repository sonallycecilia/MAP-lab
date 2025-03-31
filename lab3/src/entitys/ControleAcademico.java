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

    public ControleAcademico(String nome, String endereco) {
        this.nomeInstituicao = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    //setters
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

    //metodos
    public Aluno cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
        return aluno;
    }

    public Professor cadastrarProfessor(String nome, int matricula) {
        Professor professor = new Professor(nome, matricula);
        professores.add(professor);
        return professor;
    }

    public Disciplina cadastrarDisciplina(String nome, int cargaHoraria, int id) {
        Disciplina disciplina = new Disciplina(nome, cargaHoraria, id);
        disciplinas.add(disciplina);
        return disciplina;
    }

    public Turma criarTurma(Disciplina disciplina, Professor professor, Horario horario, String periodo, int id) {
        Turma turma = new Turma(disciplina, professor, horario, periodo, id);
        turmas.add(turma);
        return turma;
    }

    //metodos de horario
    public ArrayList<Horario> getHorariosProfessor(int matricula) {
        ArrayList<Horario> horarios = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getProfessor().getMatricula() == matricula) {
                horarios.add(turma.getHorario());
            }
        }
        if (horarios.isEmpty()) {
            throw new ControleAcademicoExceptions("Professor com matrícula " + matricula + " não leciona em nenhuma turma.");
        }
        return horarios;
    }
    public ArrayList<Horario> getHorariosAluno(int matricula) {
        ArrayList<Horario> horarios = new ArrayList<>();
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunosMatriculados()) {
                if (aluno.getMatricula() == matricula) {
                    horarios.add(turma.getHorario());
                }
            }
        }
        if (horarios.isEmpty()) {
            throw new ControleAcademicoExceptions("Aluno com matrícula " + matricula + " não está matriculado em nenhuma turma.");
        }
        return horarios;
    }
    public ArrayList<Disciplina> getDisciplinasProfessor(int matricula) {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (Turma turma : turmas) {
            if (turma.getProfessor().getMatricula() == matricula) {
                disciplinas.add(turma.getDisciplina());
            }
        }
        if (disciplinas.isEmpty()) {
            throw new ControleAcademicoExceptions("Professor com matrícula " + matricula + " não leciona nenhuma disciplina.");
        }
        return disciplinas;
    }

    public ArrayList<Disciplina> getDisciplinasAluno(int matricula) {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (Turma turma : turmas) {
            for (Aluno aluno : turma.getAlunosMatriculados()) {
                if (aluno.getMatricula() == matricula) {
                    disciplinas.add(turma.getDisciplina());
                }
            }
        }
        if (disciplinas.isEmpty()) {
            throw new ControleAcademicoExceptions("Professor com matrícula " + matricula + " não leciona nenhuma disciplina.");
        }
        return disciplinas;
    }



    //metodos de filtro
    public Disciplina getDisciplinaPorID(int id) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId() == id) {
                return disciplina;
            }
        }
        throw new ControleAcademicoExceptions("Disciplina não encontrada: " + id);
    }

    public Professor getProfessorPorMatricula(Integer matricula) {
        for (Professor professor : professores) {
            if (professor.getMatricula() == matricula) {
                return professor;
            }
        }
        throw new ControleAcademicoExceptions("Matricula de Profess: " + matricula);
    }

    public Aluno getAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        throw new ControleAcademicoExceptions("Matricula de Aluno não encontrada: " + matricula);
    }

    public Turma getTurmaPorId(int id){
        for (Turma turma : turmas) {
            if (turma.getId() == id) {
                return turma;
            }
        }
        throw new ControleAcademicoExceptions("Id de turma não encontrada: " + id);

    }
}

