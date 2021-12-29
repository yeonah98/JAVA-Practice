import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ListQueue<Integer> q = new ListQueue<Integer>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		
		StringBuilder people = new StringBuilder();
		people.append('<');
		
		while(q.size()>1) {
			for(int i=0; i<K-1; i++) {
				int value = q.remove();
				q.add(value);
			}
			people.append(q.remove()).append(", ");
		}
		
		people.append(q.remove()).append('>');
		System.out.println(people);
	}

}
