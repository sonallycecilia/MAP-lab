import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import entitys.*;
import org.testng.annotations.BeforeTest;

public class AlunoTeste {
    @Test
    public void criarAluno(){
        ControleAcademico uepb = new ControleAcademico("UEPB", "Rua Barauna");
        Aluno alunoTeste = uepb.cadastrarAluno("Sonally", 123321);
        assertEquals(uepb.getAlunoPorMatricula(123321), alunoTeste);
        uepb.getAlunoPorMatricula(123321);
    }
}
