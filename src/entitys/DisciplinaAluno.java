package entitys;

import utils.Horario;

public class DisciplinaAluno {
    private String nome;
    private Horario horario;
    private Professor professor;

    public DisciplinaAluno(String nome, Professor professor, Horario horario) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public Horario getHorario() {
        return horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}