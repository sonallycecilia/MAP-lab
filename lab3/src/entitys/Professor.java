package entitys;

public class Professor {
    private String nome;
    private String departamento;
    private int matricula;

    // construtores
    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getDeparatamento() {
        return departamento;
    }


    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setDeparatamento(String deparatamento) {
        this.departamento = deparatamento;
    }
}