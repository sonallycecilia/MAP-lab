import java.util.ArrayList;

import entitys.*;
import utils.*;
import utils.enums.Dias;

public class ControleAcademico {
    public static void main(String[] args) throws Exception {
        String disciplinasOfertadas[] = {"Matematica", "Portugues", "Ciencias", "Historia", "Filosofia"};

        Professor professor1 = new Professor("Marta", 12285122);
    
        Aluno aluno1 = new Aluno("Ana", 462656565);
        Aluno aluno2 = new Aluno("Enzo", 462656566);
        Aluno aluno3 = new Aluno("Maria", 462656567);

        Disciplina disciplina1 = new Disciplina(disciplinasOfertadas[0],
                                                professor1, 
                                                new Horario(Dias.QUINTA, "11:00"));
        professor1.vincularDisciplina(disciplina1);
        
        disciplina1.matricularAluno(aluno1);
        aluno1.vincularDisciplina(disciplina1);


        professor1.printarDisciplinas();
        professor1.printarHorarios();
        disciplina1.printarAlunosMatriculados();
        aluno1.printarDisciplinas();
        aluno1.printarHorario();
        System.out.println("Total de alunos da disciplina " + disciplina1.getNome() + " -> " + disciplina1.qtdDeAlunos());
    }
}
