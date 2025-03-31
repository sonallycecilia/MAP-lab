import entitys.Aluno;
import entitys.ControleAcademico;
import entitys.Professor;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTeste {
    @Test
    public void cadastraProfessor() {
        ControleAcademico uepb = new ControleAcademico("UEPB", "Rua Barauna");
        Professor professorTeste = uepb.cadastrarProfessor("Sonally", 123321);
        assertEquals(uepb.getProfessorPorMatricula(123321), professorTeste);
    }
}
