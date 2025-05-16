package figuras_geometricas;

public class Circulo {

    private static Circulo circulo = null;
    private double raio;

    private Circulo() {

    }

    private Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo getInstance(){
        if(circulo == null){
            circulo = new Circulo();
        }
        return circulo;
    }
    //TODO: permitir instanciar circulo com o raio

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws IllegalArgumentException {
        if (raio > 0) {
            this.raio = raio;
        } else
            throw new IllegalArgumentException("O raio deve ser maior que 0");

    }

    public double getArea() {
        return Math.PI*(raio * raio);
    }

    public double getPerimetro() {
        return 2*Math.PI*raio;
    }
}