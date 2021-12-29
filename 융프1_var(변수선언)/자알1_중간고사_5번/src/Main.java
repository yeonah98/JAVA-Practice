import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받는 것을 스캔하기 위해 스캐너를 생성 
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 문자열을 입력받아 s에 저장 
		System.out.print("문자열을 입력하세요 >");
		String s = sc.next();
		
		
		//직접 구현한 배열스택을 사용하기위해 생성 
		ArrayStack<Character> st = new ArrayStack<Character>();
				
		//s를 st스택에 push
		for(int i=0; i<s.length(); i++) {
			st.push(s.charAt(i));
		}
		
		//스택에 push한 문자열을 pop하여 역순문자열 reverse 생성 
		String reverse = ""; //역순문자열 넣을 reverse문자열 생성
		for(int i=0; i<s.length(); i++) {
			reverse += st.pop();
		}
		
		//역순 문자열 reverse 생성 
		System.out.println(reverse);
	}

}
