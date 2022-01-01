class Quiz {
	Quiz() {
		
	}
	
	int speed_limit() {
		int n = (int)(Math.random()*4);
		switch(n) {
		case 0:
			return 60;
		case 1:
			return 70;
		case 2:
			return 80;
		case 3:
			return 100;
		}
		return 0;
	}
	
	int count(String src, String find) {
		int cnt = 0;
		int cut = find.length();
		for(int i=0; i< (src.length()-cut+1); i++) {
			if(src.substring(i, cut+i).equals(find))
				cnt++;
		}
		return cnt;
		
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java API 실습과제");
		Quiz quiz = new Quiz();
		
		System.out.println("제한속도= " + quiz.speed_limit() + "km");
		
		String source = "The old man and the sea";
		System.out.println(quiz.count(source, "he"));
	}

}
