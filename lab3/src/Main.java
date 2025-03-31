import entitys.ControleAcademico;
import utils.Boletim;
import utils.Horario;
import utils.enums.Dia;
import utils.enums.HoraAula;
import utils.enums.Turno;

public class Main {
    public static void main(String[] args) {
        ControleAcademico uepb = new ControleAcademico(
                "Universidade Estadual da Paraiba",
                "Rua Baraunas"
        );

        //cadastro de professores
        uepb.cadastrarProfessor("Sabrina", 540);
        uepb.cadastrarProfessor("Janderson", 541);

        //cadastro de alunos
        uepb.cadastrarAluno("Sonally", 640);
        uepb.cadastrarAluno("Thales", 641);
        uepb.cadastrarAluno("Julia", 642);

        //cadastro de disciplinas
        uepb.cadastrarDisciplina("Metodos Avançados de Programação", 60, 10);
        uepb.cadastrarDisciplina("Paradigmas de Programação", 60, 11);
        uepb.cadastrarDisciplina("Linguagem de Programação 2", 60, 12);

        //criando horarios
        Horario h1 = new Horario(Dia.SEGUNDA, HoraAula._07_09, Turno.MANHA);
        Horario h2 = new Horario(Dia.SEGUNDA, HoraAula._14_16, Turno.TARDE);
        Horario h3 = new Horario(Dia.QUARTA, HoraAula._09_11, Turno.MANHA);

        //criando turmas
        //map
        uepb.criarTurma(
                uepb.getDisciplinaPorID(10),
                uepb.getProfessorPorMatricula(540),
                h1, "2025.1", 100
        );
        //pp
        uepb.criarTurma(
                uepb.getDisciplinaPorID(11),
                uepb.getProfessorPorMatricula(541),
                h3, "2025.1", 101
        ); //p2
        uepb.criarTurma(
                uepb.getDisciplinaPorID(12),
                uepb.getProfessorPorMatricula(541),
                h2, "2025.1", 102
        );

        //matriculando alunos em map
        uepb.getTurmaPorId(100).matricularAluno(uepb.getAlunoPorMatricula(640));
        uepb.getTurmaPorId(100).matricularAluno(uepb.getAlunoPorMatricula(641));
        uepb.getTurmaPorId(100).matricularAluno(uepb.getAlunoPorMatricula(642));

        //matriculando alunos em p2
        uepb.getTurmaPorId(102).matricularAluno(uepb.getAlunoPorMatricula(642));

        //matriculando alunos em pp
        uepb.getTurmaPorId(101).matricularAluno(uepb.getAlunoPorMatricula(640));
        uepb.getTurmaPorId(101).matricularAluno(uepb.getAlunoPorMatricula(641));

        //cadastrando notas de alunos em turma
        uepb.getTurmaPorId(100).registrarNotas(uepb.getAlunoPorMatricula(640), 7.5, 8, 9, 7);
        uepb.getTurmaPorId(100).registrarNotas(uepb.getAlunoPorMatricula(641), 7.5, 8, 9, 7);
        uepb.getTurmaPorId(100).registrarNotas(uepb.getAlunoPorMatricula(642), 7.5, 8, 9, 7);

        //respondendo perguntas
        System.out.println("Quais disciplinas um professor esta ministrando?");
        System.out.print(uepb.getProfessorPorMatricula(541).getNome() +
                " " + uepb.getDisciplinasProfessor(541));

        System.out.println("\n\nQual o horário de um professor?");
        System.out.print(uepb.getProfessorPorMatricula(541).getNome() +
                " " + uepb.getHorariosProfessor(541));

        System.out.println("\n\nQuais os alunos de uma dada disciplina?");
        System.out.print(uepb.getTurmaPorId(100).getAlunosMatriculados());

        System.out.println("\n\nQual o horário de um aluno?");
        System.out.print(uepb.getAlunoPorMatricula(642).getNome() +
                " " + uepb.getHorariosAluno(642));

        System.out.println("\n\nQuais a disciplina de um aluno?");
        System.out.print(uepb.getAlunoPorMatricula(641).getNome() +
                " " + uepb.getDisciplinasAluno(641));

        System.out.println("\n\nQual o número de alunos de uma disciplina?");
        System.out.print(uepb.getTurmaPorId(100).getDisciplina().getNome() + " total de: " +
                uepb.getTurmaPorId(100).getAlunosMatriculados().size() + " alunos");

    }
}