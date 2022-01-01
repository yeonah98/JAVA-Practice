import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		//int[] arr = {10, 2, 6, 4, 3, 7, 5};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 사이즈 입력> ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("사이즈에 맞는 원소 입력> ");
		for (int i = 0; i < size; i++) {
			int n = sc.nextInt(); 
			if(n <= 0 || n >= 100) {
				System.out.println("다시 입력 하세요"); //주어진 범위를 벗어난 입력값을 받으면 종료합니다.
				return ;
			}
			arr[i] = n;
		}
		

		for (int i = 1; i < arr.length; i++) {

			int standard = arr[i];  // 기준
			int aux = i - 1;   // 비교할 대상


			while (aux >= 0 && standard < arr[aux]) {

				arr[aux + 1] = arr[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄

				aux--;
			}
			arr[aux + 1] = standard;  // 기준값 저장
		}
		printArr(arr);
	}


	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
