import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[20];
		for(int i=0; i<20; i++) {
			arr[i] = (int)Math.pow(2, i);
		}
		
		System.out.print("찾을 key값> ");
		int key = sc.nextInt();
		
		binarySearch(key, arr);

	}
	public static void binarySearch(int key, int arr[]) {
        int mid;
        int left = 0;
        int right = arr.length - 1;
 
        while (right >= left) {
            mid = (right + left) / 2;
 
            if (key == arr[mid]) {
                System.out.println(mid + "번째 인덱스에서 탐색에 성공했습니다.");
                break;
            }
 
            if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
 
        }
        if (right < left)
        	System.out.println("탐색에 실패했습니다.");
    }
	
}
