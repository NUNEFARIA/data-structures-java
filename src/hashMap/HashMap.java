package hashMap;

public class HashMap<K, T> {

    private Bucket<K, T>[] buckets;
    
    public HashMap() {
        this.buckets = new Bucket[10];
    }
}
