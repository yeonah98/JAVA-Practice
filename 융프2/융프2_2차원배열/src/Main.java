import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 가로, 세로크기 키입력
		System.out.print("2차원배열 가로, 세로크기 입력> ");
		int row, col;
		Scanner sc = new Scanner(System.in);
		col = sc.nextInt();
		row = sc.nextInt();
		sc.close();
		
		//2. 각각의 값은 랜덤 (10~99)
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = 10 + (int)(Math.random()*90);
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		//3. 2차원 -> 1차원  :이론 
		int[] arr_1d = new int[row*col];
		/*
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr_1d[i*col+j] = arr[i][j];			
			}
		}
		for(int i=0; i<row*col; i++) {
			System.out.print(arr_1d[i] + " ");
		}
		*/
		//4. 메소드 - 배열리턴 
		
		// 메소드 호출
		arr_1d = d2tod1(arr);
		
		for(int i=0; i<row*col; i++) {
			System.out.print(arr_1d[i] + " ");
		}
	}
	
	static int[] d2tod1(int[][] a) {
		int row, col;
		row = a.length;
		col = a[0].length;
		int[] temp = new int[row*col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				temp[i*col+j] = a[i][j];			
			}
		}
		return temp;
	}
}
