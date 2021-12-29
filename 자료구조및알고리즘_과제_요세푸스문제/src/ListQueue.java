import java.util.NoSuchElementException;

public class ListQueue <E>{
	static class Node<E> {
		private E item;
		private Node<E> next;
		public Node(E newItem, Node<E> node) {
			item = newItem;
			next = node;
		}
		public E 		getItem() { return item; }
		public Node<E> 	getNext() { return next; }
		public void 	setItem(E newItem) { item = newItem; }
		public void 	setNext(Node<E> newNext) { next = newNext; }
	}
	
	private Node<E> front, rear;
	private int size;
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	
	public int size() { return size; }
	
	public boolean isEmpty() { return size()==0; }
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if (isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public E peek() {
		if (isEmpty()) throw new NoSuchElementException();
		else {
			System.out.println(front.getItem());
			return front.getItem();
		}
	}
	
	public void print() {
		if (isEmpty()) throw new NoSuchElementException();
		else {
			System.out.print("Queue elements: ");
			
			Node<E> tempNode = front;
			
			while(tempNode != null) {
				System.out.print(tempNode.getItem() + " ");
				tempNode = tempNode.getNext();
			}
			System.out.println();
		}
	}
}
