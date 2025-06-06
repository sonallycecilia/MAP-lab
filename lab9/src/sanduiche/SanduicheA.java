package sanduiche;

public class SanduicheA {
    private String nome;

    public SanduicheA(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.nome;
    }

    public void setTipo(String nome) {
        this.nome = nome;
    }
}
