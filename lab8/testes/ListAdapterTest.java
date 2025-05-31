import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.AbstractMap.SimpleEntry; // Necessário para Map.Entry para equals/hashCode

import static org.junit.jupiter.api.Assertions.*;

public class ListAdapterTest {

    private ListAdapter<String, Integer> mapLista;

    @BeforeEach
    void setUp() {
        mapLista = new ListAdapter<>();
        mapLista.put("Julia", 20);
        mapLista.put("Maria", 10);
        mapLista.put("João", 25);
        mapLista.put("Marcos", 30);
    }

    @Test
    @DisplayName("Testar size")
    void testSize() {
        assertEquals(4, mapLista.size());

        mapLista.clear();
        assertEquals(0, mapLista.size());
    }

    @Test
    @DisplayName("Testar isEmpty")
    void testIsEmpty() {
        assertFalse(mapLista.isEmpty());
        mapLista.clear();
        assertTrue(mapLista.isEmpty());
    }

    @Test
    @DisplayName("Testar put: adicionar novo")
    void testPutAdicionarNovo() {
        assertNull(mapLista.put("Ana", 35));
        assertEquals(5, mapLista.size());
        assertTrue(mapLista.containsKey("Ana"));
        assertEquals(35, mapLista.get("Ana"));
    }

    @Test
    @DisplayName("Testar put: substituir existente")
    void testPutAdicionarExistente() {
        mapLista.put("Julia", 22);
        assertEquals(4, mapLista.size());
        assertEquals(22, mapLista.get("Julia"));
    }

    @Test
    @DisplayName("Testar get: chave existente")
    void testGetChaveExistente() {
        assertEquals(20, mapLista.get("Julia"));
        assertEquals(10, mapLista.get("Maria"));
    }

    @Test
    @DisplayName("Testar get: chave inexistente")
    void testGetChaveInexistente() {
        assertNull(mapLista.get("Carlos"));
    }

    @Test
    @DisplayName("Testar remove por chave com chave existente")
    void testRemoveChaveExistente() {
        Integer removedValue = mapLista.remove("Maria");
        assertEquals(10, removedValue);
        assertEquals(3, mapLista.size());
        assertFalse(mapLista.containsKey("Maria"));
        assertNull(mapLista.get("Maria"));

    }

    @Test
    @DisplayName("Testar remove por chave com chave inexistente")
    void testRemoveChaveInexistente() {
        assertNull(mapLista.remove("Pedro"));
        assertEquals(4, mapLista.size());
    }

    @Test
    @DisplayName("Testar containsKey e containsValue")
    void testContains() {
        assertTrue(mapLista.containsKey("João"));
        assertFalse(mapLista.containsKey("José"));

        assertTrue(mapLista.containsValue(30));
        assertFalse(mapLista.containsValue(99));
    }

    @Test
    @DisplayName("Testar clear")
    void testClear() {
        assertFalse(mapLista.isEmpty());
        mapLista.clear();
        assertTrue(mapLista.isEmpty());
        assertEquals(0, mapLista.size());
    }

    @Test
    @DisplayName("Testar values")
    void testValues() {
        Collection<Integer> values = mapLista.values();
        assertEquals(4, values.size());
        assertTrue(values.contains(10));
        assertTrue(values.contains(20));
        assertTrue(values.contains(25));
        assertTrue(values.contains(30));
        assertFalse(values.contains(5));
    }

    @Test
    @DisplayName("Testar keySet")
    void testKeySet() {
        Set<String> keys = mapLista.keySet();
        assertEquals(4, keys.size());
        assertTrue(keys.contains("Julia"));
        assertTrue(keys.contains("Maria"));
        assertTrue(keys.contains("João"));
        assertTrue(keys.contains("Marcos"));
        assertFalse(keys.contains("Carlos"));
    }

    @Test
    @DisplayName("Testar entrySet")
    void testEntrySet() {
        Set<Map.Entry<String, Integer>> entries = mapLista.entrySet();
        assertEquals(4, entries.size());
        assertTrue(entries.contains(new SimpleEntry<>("Julia", 20)));
        assertTrue(entries.contains(new SimpleEntry<>("Marcos", 30)));
        assertFalse(entries.contains(new SimpleEntry<>("João", 99))); // Valor errado
    }

    @Test
    @DisplayName("Testar putAll")
    void testPutAll() {
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Lucas", 40);
        newMap.put("Maria", 12); // Substitui existente
        mapLista.putAll(newMap);

        assertEquals(5, mapLista.size());
        assertTrue(mapLista.containsKey("Lucas"));
        assertEquals(12, mapLista.get("Maria"));
    }

}