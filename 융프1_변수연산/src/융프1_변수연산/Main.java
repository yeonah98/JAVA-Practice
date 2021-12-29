package 융프1_변수연산;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연산자 산술체계");
		
		System.out.print("세 자리 숫자 입력> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int d100 = input/100;
		int d10 = (input%100)/10;
		int d1 = input%10;
		int sum = d100 + d10 + d1;
		System.out.println("세 자릿수의 합계= " + sum);
		sc.close();
		
	}

}
