package entitys;

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

    public void criarTurma(Disciplina disciplina, Professor professor, String periodo, String turno) {
        turmas.add(new Turma(disciplina, professor, , periodo, , turno));
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.matricularAluno(aluno);
    }
}
