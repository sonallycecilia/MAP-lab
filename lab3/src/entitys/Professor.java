package entitys;

public class Professor {
    private String nome;
    private int matricula;
    private ArrayList<DisciplinaProfessor> disciplinas;

    // construtores
    public Professor(String nome, int matricula) {
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

    public ArrayList<DisciplinaProfessor> getDisciplinas() {
        return disciplinas;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

<<<<<<< HEAD
=======
    // metodos
    public void vincularDisciplina(DisciplinaProfessor disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void printarDisciplinas() {
        System.out.print("Disciplinas de professor(a) " + this.nome + ":\n");
        for(DisciplinaProfessor disciplina : this.disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    public void printarHorarios() {
        System.out.print("Horários de professor(a) " + this.nome + ":\n");
        for(DisciplinaProfessor disciplina : this.disciplinas) {
            System.out.print(disciplina.getNome() + " -> " + disciplina.getHorario().toString() + "\n");
        }
    }
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
}