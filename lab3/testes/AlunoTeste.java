import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import entitys.*;


public class AlunoTeste {
    @Test
    public void cadastrarAluno(){
        ControleAcademico uepb = new ControleAcademico("UEPB", "Rua Barauna");
        Aluno alunoTeste = uepb.cadastrarAluno("Sonally", 123321);
        assertEquals(uepb.getAlunoPorMatricula(123321), alunoTeste);
        uepb.getAlunoPorMatricula(123321);
    }

    @Test
    public void cadastrarAlunoQueJaExiste(){
        ControleAcademico uepb = new ControleAcademico("UEPB", "Rua Barauna");
        Aluno alunoTeste = uepb.cadastrarAluno("Sonally", 123321);
        assertThrows(ControleAcademicoException.class, () -> uepb.cadastrarAluno("Sonally", 123321));
    }
}
