package entitys;
import utils.Horario;
<<<<<<< HEAD

=======
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Turma {
<<<<<<< HEAD
    private Disciplina disciplina;
    private Professor professor;
    private Horario horario;
    private String periodo;
    private ArrayList<Aluno> alunosMatriculados;

    public Turma(Disciplina disciplina, Professor professor, Horario horario, String periodo) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.alunosMatriculados = new ArrayList<>();
        this.horario = horario;
    }

    //getters
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public Horario getHorario() {
        return horario;
    }
    public String getPeriodo() {
        return periodo;
    }

    //setters
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // metodos
    public boolean desvincularAluno(Aluno aluno) {
        return this.alunosMatriculados.remove(aluno);
    }
    public boolean matricularAluno(Aluno aluno){
        return this.alunosMatriculados.add(aluno);
    }
}
=======
    private Map<String, DisciplinaProfessor> disciplinasProfessores;
    private Map<String, ArrayList<DisciplinaAluno>> disciplinasAlunos;

    public Turma() {
        this.disciplinasProfessores = new HashMap<>();
        this.disciplinasAlunos = new HashMap<>();
    }

    // Método para criar uma nova disciplina 
    
    public DisciplinaProfessor criarDisciplina(String nome, Professor professor, Horario horario) {
        DisciplinaProfessor novaDisciplina = new DisciplinaProfessor(nome, professor, horario);
        disciplinasProfessores.put(nome, novaDisciplina);
        professor.vincularDisciplina(novaDisciplina);
        return novaDisciplina;
    }

    // Matricular aluno em uma disciplina
    public void matricularAluno(String nomeDisciplina, Aluno aluno) {
        if (!disciplinasProfessores.containsKey(nomeDisciplina)) {
            throw new IllegalArgumentException("Disciplina não encontrada: " + nomeDisciplina);
        }

        DisciplinaProfessor disciplinaProf = disciplinasProfessores.get(nomeDisciplina);
        DisciplinaAluno disciplinaAluno = new DisciplinaAluno(
            disciplinaProf.getNome(),
            disciplinaProf.getProfessor(),
            disciplinaProf.getHorario()
        );

        // Adiciona à lista de alunos da disciplina (versão professor)
        disciplinaProf.matricularAluno(aluno);
        
        // Adiciona à lista de disciplinas do aluno
        aluno.vincularDisciplina(disciplinaAluno);
        
        // Mantém registro na turma
        disciplinasAlunos.get(nomeDisciplina).add(disciplinaAluno);
    }

    // Obter disciplina (versão professor)
    public DisciplinaProfessor getDisciplinaProfessor(String nome) {
        return disciplinasProfessores.get(nome);
    }

    // Obter lista de alunos de uma disciplina
    public ArrayList<DisciplinaAluno> getAlunosDaDisciplina(String nomeDisciplina) {
        return disciplinasAlunos.getOrDefault(nomeDisciplina, new ArrayList<>());
    }

    // Listar todas as disciplinas
    public void listarDisciplinas() {
        System.out.println("Disciplinas cadastradas:");
        for (String nome : disciplinasProfessores.keySet()) {
            DisciplinaProfessor dp = disciplinasProfessores.get(nome);
            System.out.printf("%s - Professor: %s - Horário: %s - Alunos: %d%n",
                nome,
                dp.getProfessor().getNome(),
                dp.getHorario().toString(),
                dp.qtdDeAlunos());
        }
    }

    // Verificar horário de um aluno
    public void verificarHorarioAluno(Aluno aluno) {
        System.out.println("Horário do aluno " + aluno.getNome() + ":");
        for (DisciplinaAluno da : aluno.getDisciplinas()) {
            System.out.printf("%s - %s (Prof. %s)%n",
                da.getNome(),
                da.getHorario().toString(),
                da.getProfessor().getNome());
        }
    }

    // Verificar horário de um professor
    public void verificarHorarioProfessor(Professor professor) {
        System.out.println("Horário do professor " + professor.getNome() + ":");
        for (DisciplinaProfessor dp : professor.getDisciplinas()) {
            System.out.printf("%s - %s (%d alunos)%n",
                dp.getNome(),
                dp.getHorario().toString(),
                dp.qtdDeAlunos());
        }
    }
}
>>>>>>> 29166147e31fc93949bb79e13f43b0d94e8f9e39
