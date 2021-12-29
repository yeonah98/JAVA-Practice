import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("베르트랑 공준");
		
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//1. 배열 및 초기값 세팅
		
		boolean[] arr = new boolean[2*N];
		//인덱스를 활용하여 인덱스값이 소수인 경우 true, 소수가 아닌 경우 false호 수분하기 위해 불린 배열 생성
		for(int i=2; i<2*N; i++) {
			arr[i] = true;
			//초기
		}
		
		int sqrt2N = (int)Math.sqrt(2*N); //에라토스테네스 체의 하한
		
		//2. 체 알고리즘 만들기
		for(int i=2; i<=sqrt2N; i++) {
			if(arr[i]) {
				for(int j = i*i; j<2*N; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		//3. 베르트랑 공준 적용
		//n < p < 2n 소수의 개수 구하기
		int cnt = 0;
		for(int i=N+1; i<2*N; i++) {
			if(arr[i])
				cnt++;
		}
		System.out.println(cnt);
	}

}
