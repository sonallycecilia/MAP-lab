package sanduiche;

import elementos_sanduiche.ElementoSanduiche;
import java.util.List;

public interface SanduicheIF {
    public SanduicheIF montarSanduiche();
    public List<ElementoSanduiche> getElementosSanduiche();
}
