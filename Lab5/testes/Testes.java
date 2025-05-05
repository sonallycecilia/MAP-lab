import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

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
        filme = new Filme("V de Vingaca",2005, null, null);
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
}

