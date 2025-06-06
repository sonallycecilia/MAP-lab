package sanduiche;

import elementos_sanduiche.Tomate;
import elementos_sanduiche.ovo.Ovo;
import elementos_sanduiche.ovo.OvoGranja;
import elementos_sanduiche.pao.Pao;
import elementos_sanduiche.pao.PaoIntegral;
import elementos_sanduiche.presunto.Presunto;
import elementos_sanduiche.presunto.PresuntoFrango;
import elementos_sanduiche.queijo.Queijo;
import elementos_sanduiche.queijo.QueijoPrato;

public class SanduicheC extends Sanduiche{
    public SanduicheC() {
        super();
    }

    @Override
    public Pao adicionarPao(){
        return new PaoIntegral();
    }

    @Override
    public Queijo adicionarQueijo(){
        return new QueijoPrato();
    }

    @Override
    public Presunto adicionarPresunto(){
        return new PresuntoFrango();
    }

    @Override
    public Ovo adicionarOvo(){
        return new OvoGranja();
    }

    @Override
    public Tomate adicionarTomate(){
        return null;
    }

}
