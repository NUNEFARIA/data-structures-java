package heap;

import java.util.Arrays;
import java.util.StringJoiner;

public class MaxHeap<T extends Comparable<T>> {
    
    private T[] maxHeap;
    private int capacity;
    private int size;
    
    public MaxHeap(int capacity) {
        
        this.maxHeap = (T[]) new Comparable[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    
    public T[] getMaxHeap() {
        return maxHeap;
    }
    
    public void setMaxHeap(T[] maxHeap) {
        this.maxHeap = maxHeap;
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < size; i++) {
            
            builder.append("[");
            builder.append(maxHeap[i]);
            builder.append("] ");
            
        }
        
        return builder.toString();
    }
}
