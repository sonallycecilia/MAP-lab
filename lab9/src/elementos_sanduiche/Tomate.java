package elementos_sanduiche;

public class Tomate implements ElementoSanduiche{
    private String tipo;

    public Tomate(String tipo) {
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
