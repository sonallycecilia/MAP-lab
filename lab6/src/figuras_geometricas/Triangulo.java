package figuras_geometricas;

public class Triangulo {
    private static Triangulo isosceles = null;
    private static Triangulo equilatero = null;
    private static Triangulo retangulo = null;

    private double lado1;
    private double lado2;
    private double lado3;

    private Triangulo() {

    }

    private Triangulo(double lado1,double lado2,double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo getIsosceles(){
       if (isosceles == null){
           isosceles = new Triangulo();
       }
       return isosceles;
    }

    public Triangulo getEquilatero(){
        if (equilatero == null){
            equilatero = new Triangulo();
        }
        return equilatero;
    }

    public Triangulo getRetangulo(){
        if (retangulo == null){
            retangulo = new Triangulo();
        }
        return retangulo;
    }

    private static boolean ehTriangulo(double lado1, double lado2, double lado3){
        boolean resultado = false;
        if((lado1 + lado2 > lado3) &&
           (lado1 + lado3 > lado2) &&
           (lado2 + lado3 > lado1)) {
            resultado = true;
        }
        return resultado;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) throws FiguraException {
        if(ehTriangulo(lado1, this.lado2, this.lado3)) {
            this.lado1 = lado1;
        } else
            throw new FiguraException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido\n".formatted(lado1, lado2, lado3));
    }

    public void setLado2(double lado2) throws FiguraException {
        if(ehTriangulo(this.lado1, lado2, this.lado3)) {
            this.lado2 = lado2;
        } else
            throw new FiguraException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido\n".formatted(lado1, lado2, lado3));
    }

    public void setLado3(double lado3) throws FiguraException {
        if(ehTriangulo(this.lado1, lado2, lado3)) {
            this.lado3 = lado3;
        } else
            throw new FiguraException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido".formatted(lado1, lado2, lado3));
    }
}
