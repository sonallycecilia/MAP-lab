package entitys;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private int cra;
    private ArrayList<DisciplinaAluno> disciplinas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCra() {
        return cra;
    }

    public ArrayList<DisciplinaAluno> getDisciplinas() {
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

    public void vincularDisciplina(DisciplinaAluno disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void printarDisciplinas() {
        System.out.print("Disciplinas de " + this.nome);   		
    }
    
    public void printarHorario() {
        System.out.print("Horário do(a) aluno(a) " + this.nome + ":\n");
        for(DisciplinaAluno disciplina : this.disciplinas) {
            System.out.println(disciplina.getHorario().toString());
        }
    }
    }    		
        		
        		
        		
        		
        		
        		