import java.util.Scanner; //step2
//3. import
public class Main {

	public static void main(String[] args) {  //1. Entry Point 시작
		// TODO Auto-generated method stub
		
		// 변수 선언 -> 저장 공간 생성
		//int temp  쓰레기값이 들어가있음 (garbage value)(따라서 습관적 초기화 해야함)
		int temp = 5; // 초기화
		int a = 20;
		
		temp = 10; // 대
		
		// 키입력 step1 자동import : crtl + 커맨 + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(정수를 입력하세요) > ");
		a =sc.nextInt(); //step3 키보드입
		temp = a;
	
		
		// 2. Java API
		System.out.println( "결과는 " + temp ); //Ctrl + Space
		
		sc.close(); // step4
	}

}
