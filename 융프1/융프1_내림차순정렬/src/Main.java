import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 : ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j= i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("내림차순 : ");
		for (int j=0; j<3; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}

}
