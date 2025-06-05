package elementos_sanduiche;

public class Queijo implements ElementoSanduiche{
    private String tipo;

    public Queijo(String tipo) {
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
