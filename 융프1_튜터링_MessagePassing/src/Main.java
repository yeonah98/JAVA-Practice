class Customer {
	int have;
	double statisfaction;
	float n = 0;
	
	Customer(int have) {
		this.have = have;
	}
	
	void show() {
		System.out.println("고객의 현재 보유량 : " + have);
		System.out.println("고객의 현재 만족도 : " + statisfaction + "%");
	}
	
	void order(int or, Factory name) {
		if (name.order_in(or)) {
			have += or;
			this.statisfaction = 1.0/(double)(or/10)*100.0;
		}
		else {
			System.out.println("재고없음");
			this.statisfaction = -100.0;
		}
	}
}

class Factory {
	int stock;
	int inventoryholdingcost;
	
	Factory(int stock) {
		this.stock = stock;
		this.inventoryholdingcost = this.stock*10;
	}
	
	boolean order_in(int or) {
		if(this.stock < or) {
			return false;
		}
		else {
			this.stock -= or;
			this.inventoryholdingcost = this.stock*10;
			return true;
		}
	}
	
	void show() {
		System.out.println("공장의 현재 재고 : " + stock);
		System.out.println("공장의 현재 재고처리비용 : " + inventoryholdingcost);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer person = new Customer(10);
		Factory Samsung = new Factory(50);
		
		person.show();
		Samsung.show();
		System.out.println();
		person.order(30, Samsung);
		person.show();
		Samsung.show();
		System.out.println();
		person.order(40, Samsung);
		person.show();
		Samsung.show();
	
	}

}
