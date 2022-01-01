
public class Car {
	String gameID;
	int fuelGuage;
	int carSpeed;
	
	void show( ) {
		System.out.print("게임ID: " + gameID);
		System.out.print("\t 연료: " + fuelGuage + "1");
		System.out.println("\t 속도: " + carSpeed + "km");
	}
	void Accel() {
		if (fuelGuage <= 0)
			System.exit(0);
		else
			fuelGuage--;
	carSpeed += 10;
	}
	void Break() {
		if (carSpeed < 10) {
			carSpeed = 0;
			System.exit(0);
		}
		carSpeed -= 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ADT & 클래스\n");
		Car rider = new Car();
		rider.gameID = "run99";
		rider.fuelGuage = 50;
		rider.carSpeed = 20;
		rider.show();
		rider.Accel();
		rider.Accel();
		rider.show();
		rider.Break();
		rider.show();
	}
}
