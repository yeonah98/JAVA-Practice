import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		hanoi('A','B','C',num);
	}
	
	public static void hanoi(char from,char m,char to,int num) {
		if(num==0)
			return;
		hanoi(from,to,m,num-1);
		System.out.printf("원판 %d을 %c에서 %c으로 옮긴다.\n", num,from,to);
		hanoi(m,from,to,num-1);
	}
}
