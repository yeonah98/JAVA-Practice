import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1번 : 범위를 입력받아 범위 내의 소수들의 합과 가장 작은 소수 찾기/ 
		System.out.println("찾을 소수의 범위 입력 > ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean arr[] = new boolean[b+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<=Math.sqrt(b+1); i++) {
			for(int j=i*i; j<b+1; j+=i) {
				arr[j] =true; //소수가 아닌 수는 true
			}
		}
		
		int min = Integer.MAX_VALUE; //최솟값 변수 
		int sum = 0;
		for(int i=a; i<b+1; i++) {
			if(arr[i] == false) {
				if(min > i)
					min = i;
				sum += i;
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		//2번 : 비트연산 (활성화 + 해)
		System.out.println("<비트연산>");
		
		int number=0, flag = 0;
		
		while(true) {
			System.out.print("number(1~12) > ");
			number = sc.nextInt();
			if(number==13)
				break;
			flag = flag ^ (1 << (number-1)); //활성화 + 해제
			//flag = flag | (1 << (i-1)); //활성화
			System.out.printf("%03x\n", flag);
		}
		System.out.println("비트 설정 종료~");
		
		//3번 : 2차원배열 구구단
		int[][] gugudan = new int[10][10];
		
		for(int i=2; i<gugudan.length; i++) {
			System.out.println(i+"단");
			
			for(int j=1; j<gugudan[i].length; j++) {
				gugudan[i][j] = i*j;
				
				System.out.print(i + "x" + j+ "=" + gugudan[i][j] + "||");
				
				if(j==9) System.out.println("\n");
			}
		}
		
		//3-1번 : 2차원 배열 단어장
		System.out.println("단어장");
		String[][] voca = {{"planet", "행성"},
						{"love", "사랑"},
						{"sun", "태양"},
						{"cloud", "구름"} };
		int col = voca.length;
		int row = voca[0].length;
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(voca[i][j] + "\t");
			}
			System.out.println();
		}
		
		int cnt=2, question;
		String answer;
		System.out.println("\n단어장 문제");
	
		while(true) {
			question = (int)(Math.random()*col);
			System.out.print(voca[question][1]+" > ");
			answer = sc.next();
			
			if(answer.equals(voca[question][0])) {
				System.out.println("YES");
				cnt++;
				if(cnt==5) {
					System.out.println("PASS!");
					break;
				} 
			}
			else {
				System.out.println("NO");
				System.out.println("정답은: "+ voca[question][0]);
				cnt--;
					if(cnt<0) {
						System.out.println("FAIL!");
						break;
					}
				}
			}
		
		//4. speedgun
		class Navigator {
			private int shortestPath;
			int find_shortest_path() {
				shortestPath = 5 + (int)(Math.random()*6);
				return shortestPath;
			}
			void monitor() {
				System.out.println("\n--------------- navigator monitor ---------------");
				System.out.println("	No. of roads in the shortest path : " + shortestPath + "roads");
				System.out.println("--------------- navigator monitor ---------------");
			}
		}
		
		class Car {
			private int highestSpeed;
			Navigator Navi;// Composition(구성)
			Car() {
				highestSpeed = 140 + 10*((int)(Math.random()*8)); //140~210km
				Navi = new Navigator();
			}
			int getHighestSpeed() {
				return highestSpeed;
			}
			int current_speed() { //current speed 랜덤하게 생성
				return (int)(Math.random()*highestSpeed + 1);
			}
		}


		class Road {
			private int speedLimit;
			Road() {
				int a = (int)(Math.random()*5) +1;
				switch(a) {
				case 1:
					speedLimit=60;
				case 2:
					speedLimit=70;
				case 3:
					speedLimit=80;
				case 4:
					speedLimit=100;
				case 5:
					speedLimit=110;
					break;
				}
			}
			int getSpeedLimit() {
				return speedLimit;
			}
		}
		
		class Speedgun {
			private int theSpeed;
			private void ticketing(int limit) { //속도 검증 method
				if(theSpeed>limit) {
					System.out.println("\t*\t\t\tticked by "+(theSpeed-limit)+"Km over");
				}
			}
			void shot(Car car) {
				theSpeed = car.current_speed(); //current speed 받아오는 Car과의 Message Passing
			}
			void monitor(Road road) {
				int limit = road.getSpeedLimit(); //speedlimit 받아오는 Road와의 Message Passing
				System.out.print("current speed:"+theSpeed+"km\t");
				System.out.println("speed limit:"+limit+"Km\t");
				ticketing( limit );
			}
		}
		
		System.out.println("\n[OOAD]");
	
		Car sonata = new Car();
		System.out.println("Highest Speed:"+sonata.getHighestSpeed()+"Km");
		
		int n = sonata.Navi.find_shortest_path(); //road의 개수 
		sonata.Navi.monitor();
		
		System.out.println("\n--------------- speedgun monitor ---------------");
		for(int i=1; i<=n; i++) { //road 개수만큼 반복문 시행
			Road road = new Road();
			Speedgun police = new Speedgun();
			
			System.out.print("Road"+i+"\t");
			police.shot(sonata);
			police.monitor(road);
	}
}
}
