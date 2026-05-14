package hashMap;

public class Bucket<K, V> {
    
    private Entry<K, V> firstEntry;
    
    public Bucket() {
        this.firstEntry = null;
    }
    
    public void put(K key, V value) {
        
        Entry<K,V> newEntry = new Entry<>(key,value);
        
        if (this.firstEntry == null) {
            this.firstEntry = newEntry;
            return;
        }
        
        Entry<K,V> tempEntry = this.firstEntry;
        
        while (true) {
            
            if (tempEntry.getNext() == null) {
                tempEntry.setNext(newEntry);
                return;
            }
            
            if (tempEntry.getKey() == newEntry.getKey()) {
                tempEntry.setValue(value);
                return;
            }
            
            tempEntry = tempEntry.getNext();
        }
    }
}
