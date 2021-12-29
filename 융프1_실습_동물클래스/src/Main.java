class Animal {
	private String name;
	
	Animal(String name) {
		this.name = name;
	}
	String get_feed(){
		return name;
	}
}

class Fish extends Animal{
	private int water;

	Fish(String name, int water) {
		super(name);
		this.water = water;
	}
	
	void show() {
		System.out.println("먹은 것 : " + super.get_feed() + ", 현재 수심 : " + water + "m");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Tiger = new Animal("토끼");
		System.out.println("먹은 것 : " + Tiger.get_feed());
		
		Fish Shark = new Fish("참치", 30);
		Shark.show();
	}

}
