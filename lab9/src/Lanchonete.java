import sanduiche.Sanduiche;
import sanduiche.SanduicheA;
import sanduiche.SanduicheB;
import sanduiche.SanduicheC;

public class Lanchonete {
    public static void main(String[] args) {
        Sanduiche sanduiche = new Sanduiche();
        System.out.println(sanduiche.toString());

        sanduiche = new SanduicheA();
        System.out.println(sanduiche.toString());

        sanduiche = new SanduicheB();
        System.out.println(sanduiche.toString());

        sanduiche = new SanduicheC();
        System.out.println(sanduiche.toString());
    }
}
