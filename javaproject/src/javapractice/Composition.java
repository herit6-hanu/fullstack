package javapractice;

public class Composition {
	public static void main(String[] args) {
		Car car = new Car();
		car.startCar();
	}
}

class Engine {
	public void start() {
		System.out.println("Engine started");
	}
}

class Car {
	private Engine engine;

	public Car() {
		this.engine = new Engine(); // Composition: Car "owns" the Engine
	}

	public void startCar() {
		engine.start(); // Delegates starting to the Engine object
		System.out.println("Car started");
	}
}
