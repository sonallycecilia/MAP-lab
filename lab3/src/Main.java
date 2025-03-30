import entitys.ControleAcademico;
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
        uepb.criarTurma(
                uepb.getDisciplinaPorID(10),
                uepb.getProfessorPorMatricula(540),
                h1, "2025.1"
        );
        uepb.criarTurma(
                uepb.getDisciplinaPorID(11),
                uepb.getProfessorPorMatricula(541),
                h3, "2025.1"
        );
        uepb.criarTurma(
                uepb.getDisciplinaPorID(12),
                uepb.getProfessorPorMatricula(541),
                h2, "2025.1"
        );

        //matriculando alunos
    }
}