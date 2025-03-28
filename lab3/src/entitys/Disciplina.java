package entitys;

public class Disciplina {
    private String nome;
    private String ementa;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
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

}