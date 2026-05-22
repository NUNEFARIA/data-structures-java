package heap;

import java.util.Arrays;
import java.util.StringJoiner;

public class MaxHeap<T extends Comparable<T>> {
    
    private T[] maxHeap;
    
    public MaxHeap(int size) {
        this.maxHeap = (T[]) new Comparable[size];
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
        
        for (int i = 0; i < maxHeap.length; i++) {
            builder.append("[");
            builder.append(maxHeap[i]);
            builder.append("] ");
        }
        
        return builder.toString();
    }
}
