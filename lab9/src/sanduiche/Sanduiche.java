package sanduiche;

import elementos_sanduiche.ElementoSanduiche;
import elementos_sanduiche.Tomate;
import elementos_sanduiche.ovo.Ovo;
import elementos_sanduiche.pao.Pao;
import elementos_sanduiche.presunto.Presunto;
import elementos_sanduiche.queijo.Queijo;


public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Ovo ovo;
    private Tomate tomate;

    public Sanduiche() {
        this.pao = adicionarPao();
        this.queijo = adicionarQueijo();
        this.presunto = adicionarPresunto();
        this.ovo = adicionarOvo();
        this.tomate = adicionarTomate();
    }

    public Pao adicionarPao(){
        return new Pao();
    }

    public Queijo adicionarQueijo(){
        return new Queijo();
    }

    public Presunto adicionarPresunto(){
        return new Presunto();
    }

    public Ovo adicionarOvo(){
        return new Ovo();
    }

    public Tomate adicionarTomate(){
        return new Tomate();
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao=" + pao +
                ", queijo=" + queijo +
                ", presunto=" + presunto +
                ", ovo=" + ovo +
                ", tomate=" + tomate +
                '}';
    }
}

