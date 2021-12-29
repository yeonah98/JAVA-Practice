import java.util.LinkedList;

class HashTable {
    LinkedList<Node>[] data;
    
    public HashTable(int size) {
        this.data = new LinkedList[size];
    }
    
    int getHashCode(String key) {
        int hashCode = 0;
        for(char c : key.toCharArray()) {
            
            hashCode += c;
        }
        
        return hashCode;
    }
    
    int convertToIndex(int hashCode) {
        
        return hashCode % data.length;
    }
    
    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;
        
        for(Node node : list) {
            if(node.key.equals(key)) {
                
                return node;
            }
        }
        
        return null;
    }
    
    void put(String key, int value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        
        LinkedList<Node> list = data[index];
        
        if(list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        
        Node node = searchKey(list, key);
        
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }
    
    public void get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        
        if (node == null) {
        	System.out.println("Not found");
        }
        else {
        	System.out.println(node.getValue());
        }
    }
    
    class Node {
        String key;
        int value;
        
        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
        
        public int getValue() {
            
            return this.value;
        }
        
        public void setValue(int value) {
            
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable map = new HashTable(4);
        map.put("one", 1);
        map.put("two", 12);
        map.put("three", 23);
        map.put("four", 34);
        
        map.get("one");
        map.get("two");
        map.get("three");
        map.get("four");
        map.get("five");
    }
}
