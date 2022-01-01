package 융프2_약수;

import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 수의 최대공약수");
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		int M = sc.nextInt(); 
		int N = sc.nextInt();
		sc.close();
		
		int gcd = 1; 
		for(int i=2; i<=N; i++) {
			
			while(M%i==0 && N%i==0) {
				gcd*=i;
				M = M/i;
				N = N/i;
			}
		}
		System.out.println(gcd);
	}
}