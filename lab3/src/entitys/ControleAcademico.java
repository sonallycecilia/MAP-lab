package entitys;

import utils.Boletim;
import utils.Horario;

import java.util.ArrayList;

public class ControleAcademico {
    private String nomeInstituicao;
    private String endereco;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public ControleAcademico() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        turmas = new ArrayList<>();
    }

    public void criarAluno(String nome, int matricula) {
        alunos.add(new Aluno(nome, matricula));
    }

    public void criarProfessor(String nome, int matricula) {
        professores.add(new Professor(nome, matricula));
    }

    public void criarTurma(Disciplina disciplina, Professor professor, Horario horario, String periodo) {
        turmas.add(new Turma(disciplina, professor, horario, periodo));
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.matricularAluno(aluno);
    }
    public void removerAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.desvincularAluno(aluno);
    }

    public void adicionarNotas(Turma turma, Aluno aluno, double nota1, double nota2, double nota3, double nota4){
        turma.registrarNotas(aluno, new Boletim(nota1, nota2, nota3, nota4));
    }
}
