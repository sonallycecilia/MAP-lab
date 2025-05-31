import java.util.*;

public class MapAdapterList<J, P> implements List<P> {
    private final Map<Integer, P> internalMap; // índice = chave, para simular a List

    public MapAdapterList() {
        this.internalMap = new HashMap<>();
    }
    
    public boolean add(P p) {
        internalMap.put(internalMap.size(), p);
        return true;
    }
    
    public void clear() {
        internalMap.clear();
    }
    
    public boolean contains(Object o) {
        return internalMap.containsValue(o);
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List<?> that = (List<?>) o;
        if (size() != that.size()) return false;
        try {
            for (int i = 0; i < size(); i++) {
                P thisElement = get(i);
                Object thatElement = that.get(i);
                if (!Objects.equals(thisElement, thatElement)) {
                    return false;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
    
    public P get(int index) {
        return internalMap.get(index);
    }

    public boolean isEmpty() {
        return internalMap.isEmpty();
    }

    public Iterator<P> iterator() {
        return new ValueIterator();
    }
    
    public boolean remove(Object o) {
        for (Map.Entry<Integer, P> entry : internalMap.entrySet()) {
            if (Objects.equals(entry.getValue(), o)) {
                internalMap.remove(entry.getKey());
                return true;
            }
        }
        return false;
    }

    public int size() {
        return internalMap.size();
    }

    public Object[] toArray() {
        Collection<P> values = internalMap.values();
        return values.toArray();
    }

	@Override
	public <T> T[] toArray(T[] a) {
		Collection<P> values = internalMap.values();
        return values.toArray(a);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return internalMap.values().containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends P> c) {
		boolean changed = false;
        for (P item : c) {
            add(item);
            changed = true;
        }
        return changed;
	}

	@Override
	public boolean addAll(int index, Collection<? extends P> c) {
		 throw new UnsupportedOperationException("addAll(index, Collection) não faz sentido para esta adaptação de Map para List.");
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return internalMap.values().removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
        return internalMap.values().retainAll(c);
	}

	@Override
	public P set(int index, P element) {
		return internalMap.put(index, element);
	}

	@Override
	public void add(int index, P element) {
		throw new UnsupportedOperationException("add(index, E) não faz sentido para esta adaptação direta de Map para List.");
		
	}

	@Override
	public P remove(int index) {
		P removedValue = internalMap.remove(index);
        return removedValue;
	}

	@Override
	public int indexOf(Object o) {
		 int index = -1;
	        for (Map.Entry<Integer, P> entry : internalMap.entrySet()) {
	            if (Objects.equals(entry.getValue(), o)) {
	                index = entry.getKey();
	                break;
	            }
	        }
	        return index;
	}

	@Override
	public int lastIndexOf(Object o) {
		int lastIndex = -1;
        for (Map.Entry<Integer, P> entry : internalMap.entrySet()) {
            if (Objects.equals(entry.getValue(), o)) {
                lastIndex = entry.getKey();
            }
        }
        return lastIndex;
	}

	@Override
	public ListIterator<P> listIterator() {
		throw new UnsupportedOperationException("listIterator() não faz sentido para esta adaptação direta de Map para List.");
	}

	@Override
	public ListIterator<P> listIterator(int index) {
		throw new UnsupportedOperationException("listIterator() não faz sentido para esta adaptação direta de Map para List.");
	}

	@Override
	public List<P> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException("listIterator() não faz sentido para esta adaptação direta de Map para List.");
	}
	
	 private class ValueIterator implements Iterator<P> {
	        private final Iterator<P> valueIterator = internalMap.values().iterator();

	        @Override
	        public boolean hasNext() {
	            return valueIterator.hasNext();
	        }

	        @Override
	        public P next() {
	            return valueIterator.next();
	        }

	        @Override
	        public void remove() {
	            throw new UnsupportedOperationException("remove() não suportado para este iterador.");
	        }
	    }
}