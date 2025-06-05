package sanduiche;

import elementos_sanduiche.ElementoSanduiche;

public class Sanduiche {
    private String nome;

    public Sanduiche(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.nome;
    }

    public void setTipo(String nome) {
        this.nome = nome;
    }
}
