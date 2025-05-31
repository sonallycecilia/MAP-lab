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
        listaMap.add("Thales");
        listaMap.add("Sonally");
        listaMap.add("Julia");
    }

    @Test
    @DisplayName("Testar size")
    void testSize() {
        assertEquals(3, listaMap.size());
    }

    @Test
    @DisplayName("Testar isEmpty: False para lista não vazia")
    void testIsNotEmpty() {
        assertFalse(listaMap.isEmpty());
    }

    @Test
    @DisplayName("Testar isEmpty: True para lista vazia")
    void testIsEmptyAfterClear() {
        listaMap.clear();
        assertTrue(listaMap.isEmpty());
    }

    @Test
    @DisplayName("Testar add")
    void testAddElement() {
        assertTrue(listaMap.add("Sabrina"));
        assertEquals(4, listaMap.size());
        assertEquals("Sabrina", listaMap.get(3));
    }

    @Test
    @DisplayName("Testar get: Indice Valido")
    void testGetValidIndex() {
        assertEquals("Thales", listaMap.get(0));
        assertEquals("Sonally", listaMap.get(1));
        assertEquals("Julia", listaMap.get(2));
    }

    @Test
    @DisplayName("Testar get: Indice invalido superior")
    void testGetNull() {
        assertNull(listaMap.get(99));
    }


    @Test
    @DisplayName("Testar set: Substituir elemento")
    void testSetValidIndex() {
        String oldValue = listaMap.set(1, "Pedro");
        assertEquals("Sonally", oldValue);
        assertEquals(3, listaMap.size());
        assertEquals("Pedro", listaMap.get(1));
    }

    @Test
    @DisplayName("Testar remove(Object): Remove objeto existente com reindexacao")
    void testRemoveObjectExisting() {
        assertTrue(listaMap.remove("Sonally"));
        assertEquals(2, listaMap.size());
        assertFalse(listaMap.contains("Sonally"));
        assertEquals("Julia", listaMap.get(1));
    }

    @Test
    @DisplayName("Testar remove(Object): Objeto inexistente")
    void testRemoveObjectNonExisting() {
        assertFalse(listaMap.remove("Cecilia"));
        assertEquals(3, listaMap.size());
    }

    @Test
    @DisplayName("Testar remove(int): Remove objeto existente com reindexacao")
    void testRemoveIndexExisting() {
        String removedValue = listaMap.remove(0);
        assertEquals("Thales", removedValue);
        assertEquals(2, listaMap.size());
        assertFalse(listaMap.contains("Thales"));
        assertEquals("Sonally", listaMap.get(0));
        assertEquals("Julia", listaMap.get(1));
    }

    @Test
    @DisplayName("Testar remove(int): Invalido, Remove fora do limite superior")
    void testRemoveIndexOutOfBoundsUpper() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.remove(99));
    }

    @Test
    @DisplayName("Testar remove(int): Invalido, Remove fora do limite inferior")
    void testRemoveIndexOutOfBoundsNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> listaMap.remove(-1));
    }

    @Test
    @DisplayName("Testar contains: Elemento existente")
    void testContainsExisting() {
        assertTrue(listaMap.contains("Thales"));
    }

    @Test
    @DisplayName("Testar contains: Elemento inexistente")
    void testContainsNonExisting() {
        assertFalse(listaMap.contains("Cecilia"));
    }

    @Test
    @DisplayName("Testar indexOf: Indice da primeira ocorrência")
    void testIndexOf() {
        listaMap.add("Thales");
        assertEquals(0, listaMap.indexOf("Thales"));
        assertEquals(1, listaMap.indexOf("Sonally"));
        assertEquals(-1, listaMap.indexOf("Lucas"));
    }

    @Test
    @DisplayName("Testar lastIndexOf: Indice da última ocorrência")
    void testLastIndexOf() {
        listaMap.add("Thales");
        assertEquals(3, listaMap.lastIndexOf("Thales"));
        assertEquals(1, listaMap.lastIndexOf("Sonally"));
        assertEquals(-1, listaMap.lastIndexOf("Lucas"));
    }

    @Test
    @DisplayName("Testar clear")
    void testClear() {
        assertFalse(listaMap.isEmpty());
        listaMap.clear();
        assertTrue(listaMap.isEmpty());
        assertEquals(0, listaMap.size());
    }

    @Test
    @DisplayName("Testar toArray(): Array com todos os elementos")
    void testToArray() {
        Object[] array = listaMap.toArray();
        assertEquals(3, array.length);
        assertEquals("Thales", array[0]);
        assertEquals("Sonally", array[1]);
        assertEquals("Julia", array[2]);
    }

    @Test
    @DisplayName("Testar toArray(T[] a): Array do tipo especificado")
    void testToArrayWithType() {
        String[] stringArray = listaMap.toArray(new String[0]);
        assertEquals(3, stringArray.length);
        assertEquals("Thales", stringArray[0]);
        assertEquals("Sonally", stringArray[1]);
        assertEquals("Julia", stringArray[2]);
    }


    @Test
    @DisplayName("Testar containsAll: Contem todos os elementos")
    void testContainsAllTrue() {
        List<String> subList = Arrays.asList("Thales", "Julia");
        assertTrue(listaMap.containsAll(subList));
    }

    @Test
    @DisplayName("Testar containsAll: Nao contem todos os elementos")
    void testContainsAllFalse() {
        List<String> subListInexistente = Arrays.asList("Thales", "Cecilia");
        assertFalse(listaMap.containsAll(subListInexistente));
    }

    @Test
    @DisplayName("Testar addAll(Collection): Adiciona todos os elementos")
    void testAddAllCollection() {
        List<String> newFruits = Arrays.asList("Sabrina", "Janderson");
        assertTrue(listaMap.addAll(newFruits));
        assertEquals(5, listaMap.size());
        assertTrue(listaMap.contains("Sabrina"));
        assertTrue(listaMap.contains("Janderson"));
    }

    @Test
    @DisplayName("Testar addAll(index, Collection): Operacao Invalida")
    void testAddAllIndexCollectionUnsupported() {
        List<String> newFruits = List.of("Sabrina");
        assertThrows(UnsupportedOperationException.class, () -> listaMap.addAll(0, newFruits));
    }

    @Test
    @DisplayName("Testar add(index, E): Operacao Invalida")
    void testAddIndexUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.add(0, "Lucas"));
    }

    @Test
    @DisplayName("Testar removeAll: Todos os elementos")
    void testRemoveAll() {
        List<String> itemsToRemove = Arrays.asList("Thales", "Julia", "Joao");
        assertTrue(listaMap.removeAll(itemsToRemove));
        assertEquals(1, listaMap.size());
        assertFalse(listaMap.contains("Thales"));
        assertFalse(listaMap.contains("Julia"));
        assertTrue(listaMap.contains("Sonally"));
    }

    @Test
    @DisplayName("Testar retainAll")
    void testRetainAll() {
        List<String> itemsToRetain = Arrays.asList("Sonally", "Joao");
        assertTrue(listaMap.retainAll(itemsToRetain));
        assertEquals(1, listaMap.size());
        assertTrue(listaMap.contains("Sonally"));
        assertFalse(listaMap.contains("Thales"));
        assertFalse(listaMap.contains("Julia"));
    }

    @Test
    @DisplayName("Testar equals: Objetos iguais")
    void testEqualsTrue() {
        MapAdapter<Integer, String> anotherAdapter = new MapAdapter<>();
        anotherAdapter.add("Thales");
        anotherAdapter.add("Sonally");
        anotherAdapter.add("Julia");
        assertEquals(listaMap, anotherAdapter);
    }

    @Test
    @DisplayName("Testar equals: Objetos diferentes")
    void testEqualsFalse() {
        MapAdapter<Integer, String> anotherAdapter = new MapAdapter<>();
        anotherAdapter.add("Thales");
        anotherAdapter.add("Sonally");
        anotherAdapter.add("Julia");
        anotherAdapter.add("Sabrina");
        assertNotEquals(listaMap, anotherAdapter);
    }

    @Test
    @DisplayName("Testar ValueIterator: Toos os elementos")
    void testValueIteratorIteration() {
        Iterator<String> iterator = listaMap.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Thales", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Sonally", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("Julia", iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    @DisplayName("Testar ValueIterator: Operacao Invalida")
    void testValueIteratorRemoveUnsupported() {
        Iterator<String> iterator = listaMap.iterator();
        iterator.next();
        assertThrows(UnsupportedOperationException.class, iterator::remove);
    }

    @Test
    @DisplayName("Testar listIterator(): Operacao Invalida")
    void testListIteratorUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.listIterator());
    }

    @Test
    @DisplayName("Testar listIterator(int index): Operacao Invalida")
    void testListIteratorIndexUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.listIterator(0));
    }

    @Test
    @DisplayName("Testar subList(): Operacao Invalida")
    void testSubListUnsupported() {
        assertThrows(UnsupportedOperationException.class, () -> listaMap.subList(0, 1));
    }
}