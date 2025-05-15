package figuras_geometricas;

public class Circulo {

    private static Circulo circulo = null;
    private double raio;

    private Circulo() {
        
    }
    
    public Circulo getInstance(){
        if(circulo == null){
            circulo = new Circulo();
        }
        return circulo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI*(raio * raio);
    }

    public double getPerimetro() {
        return 2*Math.PI*raio;
    }
}
