import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random()*100);
	
		int arr[] = new int[random+1];
		for (int i=0; i<random; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.print("찾을 key값 > ");
		int key = sc.nextInt();
		
		arr[random] = key;
		for (int i=0; i<random+1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length+1; i++) {
			if (arr[i] == key) {
				if(i == random)
					System.out.println("탐색에 실패했습니다.");
				else
					System.out.println("탐색에 성공했습니다.");
				break;
			}
		}
	}

}
