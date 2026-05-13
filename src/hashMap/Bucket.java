package hashMap;

public class Bucket<K, V> {
    
    private Entry<K, V> entry;
    
    public Bucket() {
        this.entry = null;
    }
    
    public Entry<K, V> getEntry() {
        return entry;
    }
    
    public void setEntry(Entry<K, V> entry) {
        this.entry = entry;
    }
}
