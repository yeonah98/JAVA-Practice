package 융프2_약수;
import java.util.Scanner;

public class 여러수의최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("여러 수의 최대공약수");
		
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		N = sc.nextInt();
		int[] data = new int[N];
		
		for(int i=0; i<N; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int ans = gcd(data[0],data[1]);
		
		for(int i=2; i<N; i++) {
			ans = gcd(ans, data[i]);
		}
		System.out.println(ans);
	}
	//유클리드 호제법 메소
	static int gcd(int a,int b) {
		while(a%b!=0) {
			a = a%b;
			int temp = a;
			a = b;
			b = temp;
		}
		return b;
	}
	//순환
	/*
	static int gcd(int a, int b) {
		if(a%b==0)
			return b;
		return gcd(b, a%b);
	}
	*/

}
