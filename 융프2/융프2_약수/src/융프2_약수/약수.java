package 융프2_약수;

import java.util.Scanner;

public class 약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("약수 구하기");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> "); 
		int N = sc.nextInt();
		sc.close();
			
		System.out.print(N+"의 약수는 [1, ");	
		for(int i=2; i<=N/2; i++) {
			if(N%i==0)
				System.out.print(i + ", ");
		}
		System.out.println(N+"]");
	}

}
