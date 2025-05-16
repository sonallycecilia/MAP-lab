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

    

    private static boolean ehTriangulo(double lado1, double lado2, double lado3){
        return (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);
    }

    private static boolean ehIsosceles(double lado1, double lado2, double lado3){
        return ehTriangulo(lado1, lado2, lado3) &&
                (lado1 == lado2 || lado1 == lado3 || lado2 == lado3);
    }

    private static boolean ehEquilatero(double lado1, double lado2, double lado3){
        return ehTriangulo(lado1, lado2, lado3) &&
                (lado1 == lado2 && lado2 == lado3);
    }

    private static boolean ehRetangulo(double lado1, double lado2, double lado3){
        return ehTriangulo(lado1, lado2, lado3) &&
               (
                (Math.pow(lado1, 2) + Math.pow(lado2, 2)) == Math.pow(lado3, 2) ||
                (Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2)) ||
                (Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2))
               );
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

    private void setLado1(double lado1) throws IllegalArgumentException {
        if(ehTriangulo(lado1, this.lado2, this.lado3)) {
            this.lado1 = lado1;
        } else
            throw new IllegalArgumentException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido\n".formatted(lado1, lado2, lado3));
    }

    private void setLado2(double lado2) throws IllegalArgumentException {
        if(ehTriangulo(this.lado1, lado2, this.lado3)) {
            this.lado2 = lado2;
        } else
            throw new IllegalArgumentException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido\n".formatted(lado1, lado2, lado3));
    }

    private void setLado3(double lado3) throws IllegalArgumentException {
        if(ehTriangulo(this.lado1, lado2, lado3)) {
            this.lado3 = lado3;
        } else
            throw new IllegalArgumentException("O triangulo de lados %.2f, %.2f e %.2f nao eh valido".formatted(lado1, lado2, lado3));
    }
}
