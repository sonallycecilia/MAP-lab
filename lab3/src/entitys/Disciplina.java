package entitys;

public class Disciplina {
    private String nome;
    private String ementa;
    private int id;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria, int id) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.id = id;
    }

    //getters
    public String getEmenta() {
        return ementa;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }

    //setters
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }
}