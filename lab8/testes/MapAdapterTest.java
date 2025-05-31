import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapAdapterTest {

    private MapAdapter<Integer, String> listaMap;

    @BeforeEach
    void setUp() {
        listaMap = new MapAdapter<>();
        listaMap.add("maçã");     // Índice 0
        listaMap.add("banana");   // Índice 1
        listaMap.add("laranja");  // Índice 2
    }

    // --- Testes para size() e isEmpty() ---
    @Test
    @DisplayName("Testar size: Deve retornar o tamanho correto da lista")
    void testSize() {
        assertEquals(3, listaMap.size());
    }

    @Test
    @DisplayName("Testar isEmpty: Deve retornar false para lista não vazia")
    void testIsNotEmpty() {
        assertFalse(listaMap.isEmpty());
    }

    @Test
    @DisplayName("Testar isEmpty: Deve retornar true para lista vazia após clear")
    void testIsEmptyAfterClear() {
        listaMap.clear();
        assertTrue(listaMap.isEmpty());
    }

    // --- Testes para add() e get() ---
    @Test
    @DisplayName("Testar add: Deve adicionar elemento no final e aumentar o tamanho")
    void testAddElement() {
        assertTrue(listaMap.add("uva"));
        assertEquals(4, listaMap.size());
        assertEquals("uva", listaMap.get(3));
    }

    @Test
    @DisplayName("Testar get: Deve retornar o elemento no índice válido")
    void testGetValidIndex() {
        assertEquals("maçã", listaMap.get(0));
        assertEquals("banana", listaMap.get(1));
        assertEquals("laranja", listaMap.get(2));
    }

    @Test
    @DisplayName("Testar get: Deve lançar IndexOutOfBoundsException para índice fora do limite superior")
    void testGetOutOfBoundsUpper() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.get(99));
    }

    @Test
    @DisplayName("Testar get: Deve lançar IndexOutOfBoundsException para índice negativo")
    void testGetOutOfBoundsNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.get(-1));
    }

    // --- Testes para set() ---
    @Test
    @DisplayName("Testar set: Deve substituir elemento em índice válido e retornar o antigo")
    void testSetValidIndex() {
        String oldValue = listaMap.set(1, "morango");
        assertEquals("banana", oldValue);
        assertEquals(3, listaMap.size());
        assertEquals("morango", listaMap.get(1));
    }

    @Test
    @DisplayName("Testar set: Deve lançar IndexOutOfBoundsException para índice fora do limite superior")
    void testSetOutOfBoundsUpper() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.set(99, "kiwi"));
    }

    @Test
    @DisplayName("Testar set: Deve lançar IndexOutOfBoundsException para índice negativo")
    void testSetOutOfBoundsNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.set(-1, "kiwi"));
    }

    // --- Testes para remove() ---
    @Test
    @DisplayName("Testar remove(Object): Deve remover objeto existente e reindexar")
    void testRemoveObjectExisting() {
        assertTrue(listaMap.remove("banana"));
        assertEquals(2, listaMap.size());
        assertFalse(listaMap.contains("banana"));
        assertEquals("laranja", listaMap.get(1)); // Reindexação
    }

    @Test
    @DisplayName("Testar remove(Object): Não deve remover objeto inexistente")
    void testRemoveObjectNonExisting() {
        assertFalse(listaMap.remove("manga"));
        assertEquals(3, listaMap.size()); // Tamanho não deve mudar
    }

    @Test
    @DisplayName("Testar remove(int): Deve remover elemento por índice e reindexar")
    void testRemoveIndexExisting() {
        String removedValue = listaMap.remove(0); // Remove "maçã"
        assertEquals("maçã", removedValue);
        assertEquals(2, listaMap.size());
        assertFalse(listaMap.contains("maçã"));
        assertEquals("banana", listaMap.get(0)); // Reindexação
        assertEquals("laranja", listaMap.get(1)); // Reindexação
    }

    @Test
    @DisplayName("Testar remove(int): Deve lançar IndexOutOfBoundsException para índice fora do limite superior")
    void testRemoveIndexOutOfBoundsUpper() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.remove(99));
    }

    @Test
    @DisplayName("Testar remove(int): Deve lançar IndexOutOfBoundsException para índice negativo")
    void testRemoveIndexOutOfBoundsNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.remove(-1));
    }

    // --- Testes para contains() ---
    @Test
    @DisplayName("Testar contains: Deve retornar true para elemento existente")
    void testContainsExisting() {
        assertTrue(listaMap.contains("maçã"));
    }

    @Test
    @DisplayName("Testar contains: Deve retornar false para elemento inexistente")
    void testContainsNonExisting() {
        assertFalse(listaMap.contains("manga"));
    }

    // --- Testes para indexOf() e lastIndexOf() ---
    @Test
    @DisplayName("Testar indexOf: Deve retornar o índice da primeira ocorrência")
    void testIndexOf() {
        listaMap.add("maçã"); // Adiciona uma duplicata para testar lastIndexOf
        assertEquals(0, listaMap.indexOf("maçã"));
        assertEquals(1, listaMap.indexOf("banana"));
        assertEquals(-1, listaMap.indexOf("abacaxi"));
    }

    @Test
    @DisplayName("Testar lastIndexOf: Deve retornar o índice da última ocorrência")
    void testLastIndexOf() {
        listaMap.add("maçã"); // Adiciona uma duplicata
        assertEquals(3, listaMap.lastIndexOf("maçã"));
        assertEquals(1, listaMap.lastIndexOf("banana"));
        assertEquals(-1, listaMap.lastIndexOf("abacaxi"));
    }

    // --- Testes para clear() ---
    @Test
    @DisplayName("Testar clear: Deve esvaziar a lista")
    void testClear() {
        assertFalse(listaMap.isEmpty());
        listaMap.clear();
        assertTrue(listaMap.isEmpty());
        assertEquals(0, listaMap.size());
    }

    // --- Testes para toArray() ---
    @Test
    @DisplayName("Testar toArray(): Deve retornar um array com todos os elementos")
    void testToArray() {
        Object[] array = listaMap.toArray();
        assertEquals(3, array.length);
        assertEquals("maçã", array[0]);
        assertEquals("banana", array[1]);
        assertEquals("laranja", array[2]);
    }

    @Test
    @DisplayName("Testar toArray(T[] a): Deve retornar um array do tipo especificado")
    void testToArrayWithType() {
        String[] stringArray = listaMap.toArray(new String[0]);
        assertEquals(3, stringArray.length);
        assertEquals("maçã", stringArray[0]);
        assertEquals("banana", stringArray[1]);
        assertEquals("laranja", stringArray[2]);
    }

    // --- Testes para containsAll() ---
    @Test
    @DisplayName("Testar containsAll: Deve retornar true se contiver todos os elementos da coleção")
    void testContainsAllTrue() {
        List<String> subList = Arrays.asList("maçã", "laranja");
        assertTrue(listaMap.containsAll(subList));
    }

    @Test
    @DisplayName("Testar containsAll: Deve retornar false se não contiver todos os elementos da coleção")
    void testContainsAllFalse() {
        List<String> subListInexistente = Arrays.asList("maçã", "manga");
        assertFalse(listaMap.containsAll(subListInexistente));
    }

    // --- Testes para addAll() ---
    @Test
    @DisplayName("Testar addAll(Collection): Deve adicionar todos os elementos da coleção")
    void testAddAllCollection() {
        List<String> newFruits = Arrays.asList("uva", "pera");
        assertTrue(listaMap.addAll(newFruits));
        assertEquals(5, listaMap.size());
        assertTrue(listaMap.contains("uva"));
        assertTrue(listaMap.contains("pera"));
    }

    @Test
    @DisplayName("Testar addAll(index, Collection): Deve lançar UnsupportedOperationException")
    void testAddAllIndexCollectionUnsupported() {
        List<String> newFruits = Arrays.asList("uva");
        assertThrows(UnsupportedOperationException.class, () -> listaMap.addAll(0, newFruits));
    }

    // --- Testes para add(index, E) ---
    @Test
    @DisplayName("Testar add(index, E): Deve lançar UnsupportedOperationException")
    void testAddIndexUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.add(0, "abacaxi"));
    }

    // --- Testes para removeAll() ---
    @Test
    @DisplayName("Testar removeAll: Deve remover todos os elementos da coleção")
    void testRemoveAll() {
        List<String> itemsToRemove = Arrays.asList("maçã", "laranja", "kiwi");
        assertTrue(listaMap.removeAll(itemsToRemove));
        assertEquals(1, listaMap.size()); // Restou apenas "banana"
        assertFalse(listaMap.contains("maçã"));
        assertFalse(listaMap.contains("laranja"));
        assertTrue(listaMap.contains("banana"));
    }

    // --- Testes para retainAll() ---
    @Test
    @DisplayName("Testar retainAll: Deve reter apenas os elementos da coleção")
    void testRetainAll() {
        List<String> itemsToRetain = Arrays.asList("banana", "kiwi");
        assertTrue(listaMap.retainAll(itemsToRetain));
        assertEquals(1, listaMap.size()); // Restou apenas "banana"
        assertTrue(listaMap.contains("banana"));
        assertFalse(listaMap.contains("maçã"));
        assertFalse(listaMap.contains("laranja"));
    }

    // --- Testes para equals() e hashCode() ---
    @Test
    @DisplayName("Testar equals: Deve retornar true para objetos iguais")
    void testEqualsTrue() {
        MapAdapter<Integer, String> anotherAdapter = new MapAdapter<>();
        anotherAdapter.add("maçã");
        anotherAdapter.add("banana");
        anotherAdapter.add("laranja");
        assertEquals(listaMap, anotherAdapter);
    }

    @Test
    @DisplayName("Testar equals: Deve retornar false para objetos diferentes")
    void testEqualsFalse() {
        MapAdapter<Integer, String> anotherAdapter = new MapAdapter<>();
        anotherAdapter.add("maçã");
        anotherAdapter.add("banana");
        anotherAdapter.add("laranja");
        anotherAdapter.add("uva");
        assertNotEquals(listaMap, anotherAdapter);
    }

    @Test
    @DisplayName("Testar hashCode: Deve retornar o mesmo hashCode para objetos iguais")
    void testHashCode() {
        MapAdapter<Integer, String> anotherAdapter = new MapAdapter<>();
        anotherAdapter.add("maçã");
        anotherAdapter.add("banana");
        anotherAdapter.add("laranja");
        assertEquals(listaMap.hashCode(), anotherAdapter.hashCode());
    }

    // --- Testes para ValueIterator ---
    @Test
    @DisplayName("Testar ValueIterator: Deve iterar sobre os elementos corretamente")
    void testValueIteratorIteration() {
        Iterator<String> iterator = listaMap.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("maçã", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("banana", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("laranja", iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    @DisplayName("Testar ValueIterator: Deve lançar UnsupportedOperationException para remove()")
    void testValueIteratorRemoveUnsupported() {
        Iterator<String> iterator = listaMap.iterator();
        iterator.next(); // Avança para um elemento
        assertThrows(UnsupportedOperationException.class, iterator::remove);
    }

    // --- Testes para métodos não suportados da List ---
    @Test
    @DisplayName("Testar listIterator(): Deve lançar UnsupportedOperationException")
    void testListIteratorUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.listIterator());
    }

    @Test
    @DisplayName("Testar listIterator(int index): Deve lançar UnsupportedOperationException")
    void testListIteratorIndexUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.listIterator(0));
    }

    @Test
    @DisplayName("Testar subList(): Deve lançar UnsupportedOperationException")
    void testSubListUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.subList(0, 1));
    }
}