package elementos_sanduiche.presunto;

import elementos_sanduiche.ElementoSanduiche;

public class Presunto implements ElementoSanduiche {
    private String tipo ;

    public Presunto(String tipo) {
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
