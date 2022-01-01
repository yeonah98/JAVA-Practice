
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Example ex = new Example();
			
			//1번 
			int a = 5;
			System.out.print("1번문제= ");
			if(ex.odd(a))
				System.out.println("홀수");
			else
				System.out.println("짝수");
			
			//2번 
			char c = 's';
			c = next(c);
			System.out.println("2번문제= " +c);
			
			//3번 
			int[] data = {10, 5, 8, 20, 7, 3, 30, 25, 15};
			System.out.println("3번문제= "+ ex.min(data));
			
	}
	
		static char next(char c) {
			return (char)(c+1);
		}

}

class Example{

	boolean odd(int a) {
		if(a%2 == 0) 
			return false;
		else
			return true;
	}
	
	int min(int[] data) {
		int max = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i] >max) 
			max = data[i];
			}
		return max;
	}
}

