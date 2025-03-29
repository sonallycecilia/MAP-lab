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

        uepb.cadastrarProfessor("Sabrina", 1213235);
        uepb.cadastrarProfessor("Janderson", 1213236);

        uepb.cadastrarAluno("Sonally", 1246233);
        uepb.cadastrarAluno("Thales", 1246234);
        uepb.cadastrarAluno("Julia", 1246236);

        uepb.criarDisciplina("MAP", 60);

        Horario h1 = new Horario(Dia.SEGUNDA, HoraAula._07_09, Turno.MANHA);
        uepb.criarTurma(
                uepb.getDisciplinas().get(0),
                uepb.getProfessores().get(0),
                h1,
                "2025.1");

        uepb.matricularAlunoEmTurma(uepb.getAlunos().get(0), uepb.getTurmas().get(0));
        uepb.matricularAlunoEmTurma(uepb.getAlunos().get(1), uepb.getTurmas().get(0));
        uepb.matricularAlunoEmTurma(uepb.getAlunos().get(2), uepb.getTurmas().get(0));

        Boletim boletim = new Boletim(8.0, 7.0, 7.5, 7.3);
        uepb.adicionarNotas(
                uepb.getAlunos().get(0),
                uepb.getDisciplinas().get(0),
                boletim
        );
    }
}