package 융프2_약수;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("소인수분해");
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		int N = sc.nextInt();
		sc.close();
		
		for(int i=2; i<=N; i++) {
			
			while(N%i==0) {
				System.out.print(i+" ");
				N = N/i;
			}
		}			
	}
}
