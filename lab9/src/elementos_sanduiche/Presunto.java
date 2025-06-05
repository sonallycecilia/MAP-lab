package elementos_sanduiche;

public class Presunto implements ElementoSanduiche{
    private String tipo ;

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
