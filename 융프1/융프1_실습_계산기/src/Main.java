
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator A = new Calculator("계산기A", "Red", 50000);
		
		A.show();
		A.add(3, 5);
		A.minus(5, 2);
		A.mutiply(2, 8);
		A.divide(10, 2);
		A.factorial(1);
	}

}

class Calculator {
	private String name;
	private String color;
	private int price;
	
	Calculator(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void show() {
		System.out.println("이름: "+name);
		System.out.println("색깔: "+color);
		System.out.println("가격: "+price);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	public void mutiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public void factorial(int n) {
		int num = 1;
		for(int i=1; i<=n; i++) {
			num *= i;
		}
		System.out.println(num);
	}
}