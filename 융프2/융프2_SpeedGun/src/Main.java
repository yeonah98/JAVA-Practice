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

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[OOAD]");
		
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
