package entitys;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private int cra;
    private ArrayList<Disciplina> disciplinas;

    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getCra() {
        return cra;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCra(int cra) {
        this.cra = cra;
    }

    public void vincularDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void printarDisciplinas(){
        System.out.print("Disciplinas do(a) aluno(a) " + this.nome + ":\n");
        for(Disciplina disciplina : this.disciplinas){
            System.out.println(disciplina.getNome());
        }
    }

    public void printarHorario(){
        System.out.print("Horario do(a) aluno(a) " + this.nome + ":\n");
        for(Disciplina disciplina : this.disciplinas){
            System.out.println(disciplina.getHorario().toString());
        }
    }
}
