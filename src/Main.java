import hashMap.HashMap;
import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        
        HashMap<Integer, String> hashMap = new HashMap<>(10);
        
        hashMap.put(22, "gustavo");
        hashMap.put(345, "mateus");
        
        System.out.println(hashMap);
        
    }
}