import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entitys.Disciplina;
import entitys.utils.Dias;
import entitys.utils.Horas;

public class ControleAcademico {
    public static void main(String[] args) throws Exception {
        Professor professor1 = Professor();
        Map<Dias, Horas> horario = new HashMap<>();
        horario.put(Dias.SEGUNDA, Horas._07_09);
        horario.put(Dias.TERÇA, Horas._09_11);
        Disciplina disc1 = new Disciplina("matemática", professor1, horario);
    }
}
