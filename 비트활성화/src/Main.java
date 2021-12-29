import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("i 입력 > ");
		Scanner sc = new Scanner(System.in);
		
		byte flag = 0b000000000000;
		
		int n = sc.nextInt();
		flag = (flag | (1<<n));
		
		flag = (byte)(flag|n);	
		
		System.out.println("출력 > " + flag);
	}

}
