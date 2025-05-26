package org.example;
import org.example.classes.AreaVisitor;
import org.example.classes.DesenhoVisitor;
import org.example.classes.FiguraVisitorIF;
import org.example.classes.PerimetroVisitor;
import org.example.classes.figuras.*;

public class Main {
    public static void main(String[] args) {
        FiguraIF[] figuras = new FiguraIF[0];

        FiguraVisitorIF desenhador = new DesenhoVisitor();
        FiguraVisitorIF area = new AreaVisitor();
        FiguraVisitorIF perimetro = new PerimetroVisitor();

        System.out.println("== Desenhar ==");
        for (FiguraIF f : figuras) f.accept(desenhador);

        System.out.println("\n== Área ==");
        for (FiguraIF f : figuras) f.accept(area);

        System.out.println("\n== Perímetro ==");
        for (FiguraIF f : figuras) f.accept(perimetro);

        System.out.println("\n== Nova Área Após Maximizar ==");
        for (FiguraIF f : figuras) f.accept(area);
    }
}
