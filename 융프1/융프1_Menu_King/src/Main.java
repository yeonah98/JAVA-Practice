import java.util.Scanner;

class King {
	private String name;
	private int order;
	
	King(String name, int order) {
		this.name = name;
		this.order = order;
	}
	void show() {
		System.out.println("조선" + order + "대왕 " + name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실습과제\n");
		
		int mode=5, size=0;
		King[] Joseon = new King[30];
		
		menu();
		
		Scanner sc = new Scanner(System.in);
		while(mode != 0) {
			System.out.print("\n> ");
			mode = sc.nextInt();
			switch(mode) {
			case 0:
				System.out.println("종료되었습니다.");
				break;
			case 1:
				System.out.print("왕의 이름 > ");
				String name = sc.next();
				System.out.print("왕의 순서 > ");
				int order = sc.nextInt();
				Joseon[size++] = new King(name, order);
				break;
			case 2:
				for(int i=0; i<size; i++) {
					Joseon[i].show();
				}
				break;
			case 3:
				menu();
				break;
			}
		}
		sc.close();
	}
	
	static void menu(){
		System.out.println("[ menu ]");
		System.out.println("0 : exit");
		System.out.println("1 : input (King Info.)");
		System.out.println("2 : show (King List)");
		System.out.println("3 : menu");
		
	}
}
