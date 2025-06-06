package sanduiche;

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
         StringBuilder sb = new StringBuilder("Sanduiche {");
        sb.append("pao = ").append(pao != null ? pao.toString() : "N/A");
        sb.append(", queijo = ").append(queijo != null ? queijo.toString() : "N/A");
        sb.append(", presunto = ").append(presunto != null ? presunto.toString() : "N/A");
        sb.append(", ovo = ").append(ovo != null ? ovo.toString() : "N/A");
        sb.append(", tomate = ").append(tomate != null ? tomate.toString() : "N/A"); // Lida com tomate nulo
        sb.append('}');
    return sb.toString();
    }

    public Pao getPao() {
        return pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

    public Ovo getOvo() {
        return ovo;
    }

    public Tomate getTomate() {
        return tomate;
    }
}

