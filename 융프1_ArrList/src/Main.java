class ArrList<E> {
	private E[] a;
	private int size;
	
	ArrList() {
		a = (E[]) new Object[50];
		size = 0;
	}
	boolean add(E element) {
		a[size] = element;
		size++;
		return true;
	}
	void add(int index, E element) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if(index == size) {
			a[index] = element;
			size++;
		}
		else {
			for (int i = size; i > index; i--) {
				a[i] = a[i-1];
			}
			a[index] = element;
			size++;
		}
	}
	int size() {
		return size;
	}
	E remove(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		E element = a[index];
		a[index] = null;
		
		for (int i = index; i < size; i++) {
			a[i] = a[i+1];
			a[i+1] = null;
		}
		size--;
		return element;
	}
	E get (int index) {
		return a[index];
	}
	void show() {
		for(int i=0; i<size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrList<E>클래스 설계");
		
		ArrList<Integer> arr = new ArrList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(-1);
		
		System.out.println("ArrList요소수: " + arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println();
		
		arr.add(2, 100);
		arr.show();
		
		arr.remove(1);
		arr.show();
	}

}
