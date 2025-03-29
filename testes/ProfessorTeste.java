import entitys.*;
import org.junit.Test;
import utils.Horario;
import utils.enums.Dia;
import utils.enums.HoraAula;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTeste {

    @Test
    public void testVincularDisciplina() {
        Professor professor = new Professor("Sabrina", 789);
        Disciplina disciplina = new Disciplina("Metodos Avancados de Programacao", professor, new Horario(Dia.QUARTA, HoraAula._11_13));

        professor.vincularDisciplina(disciplina);
        assertEquals(1, professor.getDisciplinas().size());
        assertEquals("Metodos Avancados de Programacao", professor.getDisciplinas().get(0).getNome());
    }

}