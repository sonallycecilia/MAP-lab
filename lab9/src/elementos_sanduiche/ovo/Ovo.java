package elementos_sanduiche.ovo;

import elementos_sanduiche.ElementoSanduiche;

public class Ovo implements ElementoSanduiche {
    private String tipo;

    public Ovo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
