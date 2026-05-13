package hashMap;

public class Entry<K, V> {
    
    private K kay;
    private V value;
    private Entry<K, V> next;
    
    public Entry(K kay, V value) {
        this.kay = kay;
        this.value = value;
        this.next = null;
    }
    
    public K getKay() {
        return kay;
    }
    
    public Entry<K, V> getNext() {
        return next;
    }
    
    public V getValue() {
        return value;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
    
    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
    
    public void setKay(K kay) {
        this.kay = kay;
    }
}
