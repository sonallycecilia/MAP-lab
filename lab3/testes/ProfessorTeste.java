import entitys.Aluno;
import entitys.ControleAcademico;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTeste {
    @Test
    public void criarAluno(){
        ControleAcademico uepb = new ControleAcademico("UEPB", "Rua Barauna");
        Aluno alunoTeste = uepb.cadastrarAluno("Sonally", 123321);
        assertEquals(uepb.getAlunoPorMatricula(123321), alunoTeste);
        uepb.getAlunoPorMatricula(123321);
    }
}
