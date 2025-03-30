package main;
import entitys.*;
import utils.*;
import utils.enums.*;

public class ControleAcademico {
    public static void main(String[] args) {
        Turma turma = new Turma();
        String[] disciplinasOfertadas = {"Matematica", "Portugues", "Ciencias", "Historia", "Filosofia"};

        Professor professor1 = new Professor("Marta", 12285122);
        Aluno aluno1 = new Aluno("Ana", 462656565);
        Aluno aluno2 = new Aluno("Enzo", 462656566);
        Aluno aluno3 = new Aluno("Maria", 462656567);

        // Criando disciplinas
        DisciplinaProfessor matematica = turma.criarDisciplina(
            disciplinasOfertadas[0], 
            professor1, 
            new Horario(Dia.QUINTA, HoraAula._07_09)
        );
        
        DisciplinaProfessor historia = turma.criarDisciplina(
            disciplinasOfertadas[3], 
            professor1, 
            new Horario(Dia.SEGUNDA, HoraAula._11_13)
        );

        // Matriculando alunos
        try {
            turma.matricularAluno("Matematica", aluno1);
            turma.matricularAluno("Matematica", aluno2);
            turma.matricularAluno("Matematica", aluno3);
            turma.matricularAluno("Historia", aluno1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Saídas
        System.out.println("\nDisciplinas do professor:");
        professor1.printarDisciplinas();

        System.out.println("\nHorário do professor:");
        professor1.printarHorarios();

        System.out.println("\nAlunos matriculados em Matemática:");
        matematica.printarAlunosMatriculados();
        
        System.out.println("\nDisciplinas do aluno Ana:");
        aluno1.printarDisciplinas();

        System.out.println("\nHorário do aluno Ana:");
        aluno1.printarHorario();

        System.out.println("\nTotal de alunos em Matemática: " + matematica.qtdDeAlunos());
    }
}