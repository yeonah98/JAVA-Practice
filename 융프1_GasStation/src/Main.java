class Car {
	private int gas;
	void set_gas(int g) {
		gas = g;
	}
	void show() {
		System.out.println("현재 주유량: " + gas + "l");
	}
	void fill_gas(int g, GasStation st) {
		if(g==st.refuel(g))
			gas += g;
		else
			System.out.println("주유실패");
	}
}

class GasStation {
	private int gas;
	void set_gas(int g) {
		gas = g;
	}
	void show() {
		System.out.println("현재 재고량: " + gas + "l");
	}
	int refuel(int g) {
		if(gas<g) {
			return -1;
		}
		gas-=g;
		return g;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동차와 주유소");
		
		Car BMW = new Car();
		GasStation GS = new GasStation();
		
		BMW.set_gas(10);
		GS.set_gas(500);
		BMW.show();
		GS.show();
		
		BMW.fill_gas(50, GS);
		BMW.show();
		GS.show();
		
		BMW.fill_gas(460, GS);
	}

}
