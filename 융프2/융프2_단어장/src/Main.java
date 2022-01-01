import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단어장");
		String[][] s = { {"planet", "행성"}, 
				{"alchemist", "연금술사"}, 
				{"industry", "산업"}, 
				{"research", "연구"},
				{"star", "별"},
				{"sun", "태양"},
				{"moon", "별"}, 
				{"cloud", "구름"},
				{"sky", "하늘"},
				{"planet", "행성"} };
		
		int col = s.length;
		int row = s[0].length;
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.printf("%-15s", s[i][j]);
			}
			System.out.println();
		}
		
		int cnt=2, q;
		String a;
		System.out.println("\n단어장 문제");
		Scanner sc =new Scanner(System.in);
		while(true) {
			q = (int)(Math.random()*col);
			System.out.print(s[q][1]+" > ");
			a =sc.next();
			if(a.equals(s[q][0])) {
				System.out.println("YES");
				cnt++;
				if(cnt==5) {
					System.out.println("PASS!");
					break;
				}
			} else {
					System.out.println("NO");
					System.out.println("정답은: "+ s[q][0]);
					cnt--;
					if(cnt<0) {
						System.out.println("FAIL!");
						break;
					}
				}
			}
			sc.close();
		}
	}

