import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.ArrayList;


import lab5.*;

public class Testes {

    private Diretor diretor;
    private Roteirista roteirista;
    private Ator ator;
    private Cinegrafista cinegrafista;
    private Camera camera;
    private Filme filme;
    private AcessoFuncionarios acesso;

    @BeforeEach
    public void setUp() {
        diretor = new Diretor("Sonally", "sonally@gmail.com", 001);
        roteirista = new Roteirista("Thales", "thales@gmail.com", 002);
        ator = new Ator("Julia", "julia@gmail.com", 003);
        cinegrafista = new Cinegrafista("Sabrina", "sabrina@gmail.com", 005);
        camera = new Camera("joao", "joao@gmail.com", 006);
        filme = new Filme("V de Vinganca",2005, null, null);
    }

    @Test
    public void testCadastroFilme() {
        filme.setDiretor(diretor);
        filme.setRoteirista(roteirista);
        filme.adicionarAtor(ator);

        assertEquals(diretor, filme.getDiretor());
        assertEquals(filme.getRoteirista(), roteirista);
        assertEquals(filme.getElenco().getFirst(), ator);
    }

    @Test
    public void testCadastroFilmeVazio() {
        assertNull(filme.getDiretor());
        assertNull(filme.getRoteirista());
        assertEquals(new ArrayList<>(), filme.getElenco());
    }

    @Test
    public void testInformarFilmografia() {
        filme.setDiretor(diretor);
        filme.setRoteirista(roteirista);
        filme.adicionarAtor(ator);
        ator.atribuirFuncaoNoFilme(filme, "Ator");
        acesso = new AcessoFuncionarios(ator, filme, "Ator");
        assertEquals("V de Vingaca", acesso.getFilme().getNome());
        assertEquals("Ator", acesso.getFuncaoEspecifica());
    }

    @Test
    public void testInformarFilmografiaVazia() {
        filme.setDiretor(diretor);
        filme.setRoteirista(roteirista);
        filme.adicionarAtor(ator);
        acesso = new AcessoFuncionarios(ator, null, null);

        assertNull(acesso.getFilme());
        assertNull(acesso.getFuncaoEspecifica());
    }

    @Test
    public void testInformarCaracteristicasFilme() {
        filme.setDiretor(diretor);
        filme.setRoteirista(roteirista);
        filme.adicionarAtor(ator);

        assertEquals("--- Informações do Filme ---\n" +
                              "Nome: V de Vinganca\n" +
                              "Ano: 2005\n" +
                              "Diretor: Sonally\n" +
                              "Roteirista: Thales\n" +
                              "Elenco:\n" +
                              "- Julia\n" +
                              "Trilha Sonora:\n" +
                              "Nenhuma música cadastrada.\n" +
                              "----------------------------", filme.toString());
    }
}

