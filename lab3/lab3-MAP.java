import static org.junit.jupiter.api.Assertions.*;
import entitys.*;
import org.junit.jupiter.api.Test;
import utils.*;
import utils.enums.Dia;
import utils.enums.HoraAula;


public class AlunoTeste {
        @Test
        void testVincularDisciplina() {
            Aluno aluno = new Aluno("Sonally", 123);
            Disciplina disciplina = new Disciplina("Metodos Avancados de Programacao", new Horario(Dia.SEGUNDA, HoraAula._07_09));

            aluno.vincularDisciplina(disciplina);
            assertEquals(1, aluno.getDisciplinas().size());
            assertEquals("Metodos Avancados de Programacao", aluno.getDisciplinas().get(0).getNome());
        }
}
