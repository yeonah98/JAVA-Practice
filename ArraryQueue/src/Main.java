
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<String> queue = new ArrayQueue<String>();
		queue.add("apple");
		queue.add("orange");
		queue.add("cherry");
		queue.add("pear");
		
		queue.peek();
		queue.print();
		
		queue.add("grape");
		
		queue.peek();
		queue.print();
		
		queue.remove();
		
		queue.peek();
		queue.print();
	}
}
