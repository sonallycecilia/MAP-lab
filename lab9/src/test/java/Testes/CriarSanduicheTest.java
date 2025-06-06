package Testes;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import elementos_sanduiche.Tomate;
import elementos_sanduiche.ovo.OvoCapoeira;
import elementos_sanduiche.ovo.OvoGranja;
import elementos_sanduiche.pao.PaoBola;
import elementos_sanduiche.pao.PaoFrances;
import elementos_sanduiche.pao.PaoIntegral;
import elementos_sanduiche.presunto.PresuntoFrango;
import elementos_sanduiche.presunto.PresuntoPeru;
import elementos_sanduiche.queijo.QueijoCheddar;
import elementos_sanduiche.queijo.QueijoMussarela;
import elementos_sanduiche.queijo.QueijoPrato;
import sanduiche.SanduicheA;
import sanduiche.SanduicheB;
import sanduiche.SanduicheC;

public class CriarSanduicheTest {

    @Before
    public void setUp() {
        System.out.println("Iniciando teste de criação de Sanduíche...");
    }

    @Test
    public void testSanduicheAIngredientsAndComposition() {
        System.out.println("Testando a criação do SanduícheA...");
        SanduicheA sanduicheA = new SanduicheA(); 

        assertTrue("Pão de SanduicheA deve ser PaoBola", sanduicheA.getPao() instanceof PaoBola);
        assertTrue("Queijo de SanduicheA deve ser QueijoCheddar", sanduicheA.getQueijo() instanceof QueijoCheddar);
        assertTrue("Presunto de SanduicheA deve ser PresuntoFrango", sanduicheA.getPresunto() instanceof PresuntoFrango);
        assertTrue("Ovo de SanduicheA deve ser OvoCapoeira", sanduicheA.getOvo() instanceof OvoCapoeira);
        assertTrue("Tomate de SanduicheA deve ser Tomate", sanduicheA.getTomate() instanceof Tomate);

        String expectedString = "Sanduiche {pao = PaoBola, queijo = QueijoCheddar, presunto = PresuntoFrango, ovo = OvoCapoeira, tomate = Tomate}";
        assertEquals("toString do SanduícheA deve ser o esperado", expectedString, sanduicheA.toString());
        System.out.println("Resultado: " + sanduicheA.toString());
    }

    @Test
    public void testSanduicheBIngredientsAndComposition() {
        System.out.println("Testando a criação do SanduícheB...");
        SanduicheB sanduicheB = new SanduicheB(); 

        assertTrue("Pão de SanduicheB deve ser PaoFrances", sanduicheB.getPao() instanceof PaoFrances);
        assertTrue("Queijo de SanduicheB deve ser QueijoMussarela", sanduicheB.getQueijo() instanceof QueijoMussarela);
        assertTrue("Presunto de SanduicheB deve ser PresuntoPeru", sanduicheB.getPresunto() instanceof PresuntoPeru);
        assertTrue("Ovo de SanduicheB deve ser OvoGranja", sanduicheB.getOvo() instanceof OvoGranja);
        assertTrue("Tomate de SanduicheB deve ser Tomate", sanduicheB.getTomate() instanceof Tomate);

        String expectedString = "Sanduiche {pao = PaoFrances, queijo = QueijoMussarela, presunto = PresuntoPeru, ovo = OvoGranja, tomate = Tomate}";
        assertEquals("toString do SanduícheB deve ser o esperado", expectedString, sanduicheB.toString());
        System.out.println("Resultado: " + sanduicheB.toString());
    }

    @Test
    public void testSanduicheCIngredientsAndComposition() {
        System.out.println("Testando a criação do SanduícheC...");
        SanduicheC sanduicheC = new SanduicheC(); 

        assertTrue("Pão de SanduicheC deve ser PaoIntegral", sanduicheC.getPao() instanceof PaoIntegral);
        assertTrue("Queijo de SanduicheC deve ser QueijoPrato", sanduicheC.getQueijo() instanceof QueijoPrato);
        assertTrue("Presunto de SanduicheC deve ser PresuntoFrango", sanduicheC.getPresunto() instanceof PresuntoFrango);
        assertTrue("Ovo de SanduicheC deve ser OvoCapoeira", sanduicheC.getOvo() instanceof OvoGranja);

        String expectedString = "Sanduiche {pao = PaoIntegral, queijo = QueijoPrato, presunto = PresuntoFrango, ovo = OvoGranja, tomate = N/A}";
        assertEquals("toString do SanduícheC deve ser o esperado", expectedString, sanduicheC.toString());
        System.out.println("Resultado: " + sanduicheC.toString());
    }
    
    @After
    public void tearDown() {
        System.out.println("Finalizando teste de criação de Sanduíche...\n");
    }
}