public class Cliente {

	public static void main(String[] args) {
		MapParaList<String, Integer> mapLista = new MapParaList<>();
		ListaParaMap<Integer, String> listaMap = new ListaParaMap<>();
		
		// MapParaList - Map disfarçado de List
		
		mapLista.put("Julia", 20);
		mapLista.put("Maria", 10);
        mapLista.put("João", 25);
        mapLista.put("Marcos", 30);

        System.out.println("Tamanho do 'List' (via Map): " + mapLista.size());
        System.out.println("Contém a chave 'Julia'? " + mapLista.containsKey("Julia"));
        System.out.println("Contém o valor 25? " + mapLista.containsValue(25));
        System.out.println("Valor da chave 'Marcos': " + mapLista.get("Marcos"));
        System.out.println("Removendo a chave 'Maria': " + mapLista.remove("Maria"));
        System.out.println("Tamanho após remoção: " + mapLista.size());
        System.out.println("Valores no 'List' (via Map): " + mapLista.values());
        System.out.println("Chaves no 'List' (via Map): " + mapLista.keySet());
        System.out.println("Está vazio? " + mapLista.isEmpty());
        mapLista.clear();
        System.out.println("Após clear, está vazio? " + mapLista.isEmpty());
        System.out.println();

        // ListaParaMap - List disfarçado de Map
        listaMap.add("maçã");
        listaMap.add("banana");
        listaMap.add("laranja");

        System.out.println("Tamanho do 'Map' (via List): " + listaMap.size());
        System.out.println("Contém 'manga'? " + listaMap.contains("manga"));
        System.out.println("Elemento no índice 1: " + listaMap.get(1));
        System.out.println("Índice de 'laranja': " + listaMap.indexOf("laranja"));
        System.out.println("Removendo 'banana': " + listaMap.remove("banana"));
        System.out.println("Tamanho após remoção: " + listaMap.size());
        System.out.println("Conteúdo do 'Map' (via List):");
        for (int i = 0; i < listaMap.size(); i++) {
            System.out.println("Índice " + i + ": " + listaMap.get(i));
        }
        System.out.println("Está vazio? " + listaMap.isEmpty());
        listaMap.clear();
        System.out.println("Após clear, está vazio? " + listaMap.isEmpty());
    }
	
	}
