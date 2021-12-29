
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<String> queue = new ListQueue<String>();
		
		queue.add("apple");
		queue.peek();
		queue.add("orange");
		queue.add("pear");
		queue.add("grape");
		
		queue.print();
		queue.peek();
		
		queue.remove();
		queue.print();
		queue.peek();
	}

}
