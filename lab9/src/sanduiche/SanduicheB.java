package sanduiche;

import elementos_sanduiche.ovo.Ovo;
import elementos_sanduiche.ovo.OvoCapoeira;
import elementos_sanduiche.ovo.OvoGranja;
import elementos_sanduiche.pao.Pao;
import elementos_sanduiche.pao.PaoBola;
import elementos_sanduiche.pao.PaoFrances;
import elementos_sanduiche.presunto.Presunto;
import elementos_sanduiche.presunto.PresuntoFrango;
import elementos_sanduiche.presunto.PresuntoPeru;
import elementos_sanduiche.queijo.Queijo;
import elementos_sanduiche.queijo.QueijoCheddar;
import elementos_sanduiche.queijo.QueijoMussarela;

public class SanduicheB extends Sanduiche{
    public SanduicheB(){
        super();
    }

    @Override
    public Pao adicionarPao(){
        return new PaoFrances();
    }

    @Override
    public Queijo adicionarQueijo(){
        return new QueijoMussarela();
    }

    @Override
    public Presunto adicionarPresunto(){
        return new PresuntoPeru();
    }

    @Override
    public Ovo adicionarOvo(){
        return new OvoGranja();
    }
}
