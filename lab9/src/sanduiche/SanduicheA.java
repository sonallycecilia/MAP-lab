package sanduiche;

import elementos_sanduiche.ovo.Ovo;
import elementos_sanduiche.ovo.OvoCapoeira;
import elementos_sanduiche.pao.Pao;
import elementos_sanduiche.pao.PaoBola;
import elementos_sanduiche.presunto.Presunto;
import elementos_sanduiche.presunto.PresuntoFrango;
import elementos_sanduiche.queijo.Queijo;
import elementos_sanduiche.queijo.QueijoCheddar;
import elementos_sanduiche.queijo.QueijoPrato;

public class SanduicheA extends Sanduiche{
    public SanduicheA() {
        super();
    }

    @Override
    public Pao adicionarPao(){
        return new PaoBola();
    }

    @Override
    public Queijo adicionarQueijo(){
        return new QueijoCheddar();
    }

    @Override
    public Presunto adicionarPresunto(){
        return new PresuntoFrango();
    }

    @Override
    public Ovo adicionarOvo(){
        return new OvoCapoeira();
    }
}
