package entitys;

public class Aluno {
    private String nome;
    private int matricula;
<<<<<<< HEAD
    private double cra;
=======
    private int cra;
    private ArrayList<DisciplinaAluno> disciplinas;
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
<<<<<<< HEAD
        this.cra = 0;
=======
        this.disciplinas = new ArrayList<>();
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
<<<<<<< HEAD
    public double getCra() {
=======

    public int getCra() {
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
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
<<<<<<< HEAD
    public void setCra(double cra) {
        this.cra = cra;
    }

}
=======

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
        		
        		
        		
        		
        		
        		
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
