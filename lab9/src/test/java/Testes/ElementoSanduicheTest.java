package Testes;

import org.junit.After;
import static org.junit.Assert.assertEquals;
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

public class ElementoSanduicheTest {

    @Before
    public void setUp() {
        System.out.println("Configurando para teste de ElementoSanduiche...");
    }

    @Test
    public void testOvoCapoeiraToString() {
        OvoCapoeira ovo = new OvoCapoeira();
        assertEquals("OvoCapoeira", ovo.toString());
        System.out.println("Testado: " + ovo.toString());
    }

    @Test
    public void testOvoGranjaToString() {
        OvoGranja ovo = new OvoGranja();
        assertEquals("OvoGranja", ovo.toString());
        System.out.println("Testado: " + ovo.toString());
    }

    @Test
    public void testPaoBolaToString() {
        PaoBola pao = new PaoBola();
        assertEquals("PaoBola", pao.toString());
        System.out.println("Testado: " + pao.toString());
    }

    @Test
    public void testPaoFrancesToString() {
        PaoFrances pao = new PaoFrances();
        assertEquals("PaoFrances", pao.toString());
        System.out.println("Testado: " + pao.toString());
    }

    @Test
    public void testPaoIntegralToString() {
        PaoIntegral pao = new PaoIntegral();
        assertEquals("PaoIntegral", pao.toString());
        System.out.println("Testado: " + pao.toString());
    }

    @Test
    public void testPresuntoFrangoToString() {
        PresuntoFrango presunto = new PresuntoFrango();
        assertEquals("PresuntoFrango", presunto.toString());
        System.out.println("Testado: " + presunto.toString());
    }

    @Test
    public void testPresuntoPeruToString() {
        PresuntoPeru presunto = new PresuntoPeru();
        assertEquals("PresuntoPeru", presunto.toString());
        System.out.println("Testado: " + presunto.toString());
    }

    @Test
    public void testQueijoCheddarToString() {
        QueijoCheddar queijo = new QueijoCheddar();
        assertEquals("QueijoCheddar", queijo.toString());
        System.out.println("Testado: " + queijo.toString());
    }

    @Test
    public void testQueijoMussarelaToString() {
        QueijoMussarela queijo = new QueijoMussarela();
        assertEquals("QueijoMussarela", queijo.toString());
        System.out.println("Testado: " + queijo.toString());
    }

    @Test
    public void testQueijoPratoToString() {
        QueijoPrato queijo = new QueijoPrato();
        assertEquals("QueijoPrato", queijo.toString());
        System.out.println("Testado: " + queijo.toString());
    }

    @Test
    public void testTomateToString() {
        Tomate tomate = new Tomate();
        assertEquals("Tomate", tomate.toString());
        System.out.println("Testado: " + tomate.toString());
    }

     @After
    public void tearDown() {
        System.out.println("Desmontando para teste de ElementoSanduiche...");
    }
}