import java.util.ArrayList;

import entitys.*;
import utils.*;
import utils.enums.Dia;

public class ControleAcademico {
    public static void main(String[] args) throws Exception {
        String disciplinasOfertadas[] = {"Matematica", "Portugues", "Ciencias", "Historia", "Filosofia"};

        Professor professor1 = new Professor("Marta", 12285122);
        Professor professor2 = new Professor("Joao", 12285123);
        Professor professor3 = new Professor("Joao", 12285123);

        Disciplina disciplina1 = new Disciplina(disciplinasOfertadas[0], 
                                                professor1, 
                                                new Horario(Dia.QUINTA, "11:00"));
        professor1.vincularProfessor(disciplina1);

        System.out.println(professor1.getDisciplinas().toString());
    }
}
