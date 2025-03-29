import entitys.*;
import org.junit.Test;
import utils.Horario;
import utils.enums.Dia;
import utils.enums.HoraAula;

import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTeste {
    @Test
    public void testMatricularAluno() {
        Disciplina disciplina = new Disciplina("Metodos Avancado de Programacao", new Horario(Dia.TERCA, HoraAula._09_11));
        Aluno aluno = new Aluno("Thales", 456);

        disciplina.matricularAluno(aluno);
        assertEquals("Thales", disciplina.getAlunos().get(0).getNome());
    }

    @Test
    public void testQtdDeAlunosVazia() {
        Disciplina disciplina = new Disciplina("Metodos Avancado de Programacao", new Horario(Dia.TERCA, HoraAula._09_11));
        assertEquals(0, disciplina.qtdDeAlunos());
    }

    @Test
    public void testQtdDeAlunos() {
        Disciplina disciplina = new Disciplina("Metodos Avancado de Programacao", new Horario(Dia.TERCA, HoraAula._09_11));

        disciplina.matricularAluno(new Aluno("Julia", 789));
        disciplina.matricularAluno(new Aluno("Thales", 456));
        disciplina.matricularAluno(new Aluno("Sonally", 111));
        assertEquals(3, disciplina.qtdDeAlunos());
        assertEquals("Julia", disciplina.getAlunos().get(0).getNome());
        assertEquals("Thales", disciplina.getAlunos().get(1).getNome());
        assertEquals("Sonally", disciplina.getAlunos().get(2).getNome());
    }
}

