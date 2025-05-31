import java.util.*;

public class ListAdapter<j, p> implements Map<j, p>{
	// j= Keys; p=Values
	private final List<p> list;
	private final List<Pair<j, p>> listaInterna;
	
	public ListAdapter() {
		this.list = new ArrayList<>();
		this.listaInterna = new ArrayList<>();
	}
	
	public void clear() {
		listaInterna.clear();
	}
	
	public boolean containsKey(Object key) {
		for (Pair<j, p> pair : listaInterna) {
			if (pair.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(Object value) {
		for (Pair<j, p> pair : listaInterna) {
            if (pair.getValue().equals(value)) {
                return true;
            }
        }
        return false;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true; // mesma instancia
        if (!(o instanceof Map)) return false; // confere se eh map
        Map<?, ?> that = (Map<?, ?>) o;
        if (size() != that.size()) return false; // se tamanhos diferentes
        try {
            for (Entry<j, p> entry : entrySet()) {
                j key = entry.getKey();
                p value = entry.getValue();
                if (value == null) {
                    if (!(that.get(key) == null && that.containsKey(key)))
                        return false;
                } else {
                    if (!value.equals(that.get(key)))
                        return false;
                }
            }
        } catch (ClassCastException | NullPointerException e) {
            return false; // se é de tipos diferentes
        }
        return true;
    }
	
	public p get(Object key) {
		for (Pair<j, p> pair :listaInterna) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
	}
	
	public boolean isEmpty() {
		return listaInterna.isEmpty();
	}

	public p put(j key, p value) {
		p oldValue = null;

		Iterator<Pair<j, p>> iterator = listaInterna.iterator();
		while (iterator.hasNext() && oldValue == null) {
			Pair<j, p> pair = iterator.next();
			if (pair.getKey().equals(key)) {
				oldValue = pair.getValue();
				iterator.remove();
				break;
			}
		}

		listaInterna.add(new Pair<>(key, value));

		// Como List não retorna o valor antigo associado à chave, retornamos null
		return null;
	}
	
	public p remove(Object key) {
		Iterator<Pair<j, p>> iterator = listaInterna.iterator();
        while (iterator.hasNext()) {
            Pair<j, p> pair = iterator.next();
            if (pair.getKey().equals(key)) {
                p value = pair.getValue();
                iterator.remove();
                return value;
            }
        }
        return null;
	}
	
	public int size() {
		return listaInterna.size();
	}
	
	public Collection<p> values() {
		 List<p> values = new ArrayList<>();
	        for (Pair<j, p> pair : listaInterna) {
	            values.add(pair.getValue());
	        }
	        return values;
	}
	
	// Classe auxiliar Pair para combinar chave (j) e valor (p):
	private static class Pair<j, p> {
        private final j key;
        private final p value;

        public Pair(j key, p value) {
            this.key = key;
            this.value = value;
        }

        public j getKey() {
            return key;
        }

        public p getValue() {
            return value;}
        }
	
	public void putAll(Map<? extends j, ? extends p> m) {
		 for (Entry<? extends j, ? extends p> entry : m.entrySet()) {
	            put(entry.getKey(), entry.getValue());
	        }
		
	}
	
	public Set<j> keySet() {
		 Set<j> keys = new HashSet<>();
	        for (Pair<j, p> pair : listaInterna) {
	            keys.add(pair.getKey());
	        }
	        return keys;
	}

	public Set<Entry<j, p>> entrySet() {
		Set<Entry<j, p>> entries = new HashSet<>();
       for (Pair<j, p> pair : listaInterna) {
           entries.add(new AbstractMap.SimpleEntry<>(pair.getKey(), pair.getValue()));
       }
       return entries;
	}
}
