class DQNode{
	char item;
	DQNode rlink;
	DQNode llink;
}

class Deque{
	DQNode front;
	DQNode rear;
	
	public Deque() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char newItem) {
		DQNode newNode = new DQNode();
		newNode.item = newItem;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		}
		else {
			front.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			front = newNode;
		}
		System.out.println("Front Inserted Item: "+ newItem);
	}
	
	public void insertRear(char newItem) {
		DQNode newNode = new DQNode();
		newNode.item = newItem;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		}
		else {
			rear.rlink = newNode;
			newNode.rlink = null;
			newNode.llink = rear;
			rear = newNode;
		}
		System.out.println("Rear Inserted Item: "+ newItem);
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
			return 0;
		}
		else {
			char item = front.item;
			if(front.rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
			return item;
		}
	}
	

	public char deleteReart() {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
			return 0;
		}
		else {
			char item = rear.item;
			if(rear.llink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
			return item;
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
		}
		else {
			if(rear.llink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
		}
		else {
			if(front.llink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
		}
	}
	
	public char peekFront( ) {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
			return 0;
		}
		else
			return front.item;
	}
	
	public char peekRear( ) {
		if(isEmpty()) {
			System.out.println("Deque is empty!");
			return 0;
		}
		else
			return rear.item;
	}
	
	public void print() {
		if(isEmpty())
			System.out.println("Deque is empty!");
		else {
			DQNode temp = front;
			System.out.print("Deque : ");
			while (temp != null) {
				System.out.printf("%c ", temp.item);
				temp = temp.rlink;
			}
			System.out.println("\n");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dq = new Deque();
		
		dq.insertFront('A');
		dq.insertFront('B');
		dq.insertRear('c');
		dq.print();
		
	}

}
