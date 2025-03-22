import entitys.*;
import utils.*;
import utils.enums.*;

public class ControleAcademico {
    public static void main(String[] args) throws Exception {
        String disciplinasOfertadas[] = {"Matematica", "Portugues", "Ciencias", "Historia", "Filosofia"};

        Professor professor1 = new Professor("Marta", 12285122);
    
        Aluno aluno1 = new Aluno("Ana", 462656565);
        Aluno aluno2 = new Aluno("Enzo", 462656566);
        Aluno aluno3 = new Aluno("Maria", 462656567);

        Disciplina disciplina1 = new Disciplina(disciplinasOfertadas[0],
                                                professor1, 
                                                new Horario(Dia.QUINTA, HoraAula._07_09));
        professor1.vincularDisciplina(disciplina1);
        Disciplina disciplina2 = new Disciplina(disciplinasOfertadas[3],
                                                professor1, 
                                                new Horario(Dia.SEGUNDA, HoraAula._11_13));
        professor1.vincularDisciplina(disciplina2);
        
        disciplina1.matricularAluno(aluno1);
        aluno1.vincularDisciplina(disciplina1);
        disciplina1.matricularAluno(aluno2);
        aluno2.vincularDisciplina(disciplina1);
        disciplina1.matricularAluno(aluno3);
        aluno3.vincularDisciplina(disciplina1);

    
        // respostas
        System.out.println("\nQuais disciplinas um professor esta ministrando?");
        professor1.printarDisciplinas();

        System.out.println("\nQual o horário de um professor?");
        professor1.printarHorarios();

        System.out.println("\nQuais os alunos de uma dada disciplina?");
        disciplina1.printarAlunosMatriculados();
        
        System.out.println("\nQuais as disciplinas de um aluno?");
        aluno1.printarDisciplinas();

        System.out.println("\nQual o horario de um aluno?");
        aluno1.printarHorario();

        System.out.println("\nQual o número de alunos de uma disciplina?");
        System.out.println("Total de alunos da disciplina " + disciplina1.getNome() + " -> " + disciplina1.qtdDeAlunos());
    }
}