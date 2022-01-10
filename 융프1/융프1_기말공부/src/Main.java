import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 
		Example ex = new Example();
		System.out.println(ex.count("ossooosoos", 'o'));
		Example.capital('n');
		
		//2번 
		Appliance tv = new Appliance("유연아tv", 110);
		System.out.println(tv.getName()+"("+tv.getPower()+"V)");
		
		//3번
		Aircon cool = new Aircon("유연아에어콘", 220, 20);
		cool.show();
		
		//4번
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		int A = sc.nextInt();
		int tmp = A;
		int cnt = 0;
				
		do {
			int one = A/10;
			int two = A%10;
			int B = one + two;
			A = (A%10)*10 + B%10;
			cnt++;
		} while(tmp != A);
		
//		while (true) {
//			
//			A = ((A%10)*10) + (((A/10)+(A%10))%10);
//			cnt++;
//			
//			if(A == tmp)
//				break;
//		}
//		
		System.out.print("출력> "+cnt);
		sc.close();
		
	}

}

class Example {
	static int count(String str, char c) {
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) cnt++;
		}
		return cnt;
	}
	
	static void capital(char ch) {
		char up = (char)(ch - 32);
		System.out.println(up);
	}
}

class Appliance {
	private String name;
	private int Power;
	
	Appliance() {
	}
	
	Appliance(String str, int p) {
		this.name = str;
		this.Power = p;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.Power;
	}
}

class Aircon extends Appliance {
	private int tmp;
	
	Aircon() {
	}
	
	Aircon(String n, int p, int t) {
		super(n,p);
		this.tmp = t;
	}
	
	public void show() {
		System.out.println(super.getName()+"("+super.getPower()+"V)의 온도는 "+this.tmp+"도");
	}
}