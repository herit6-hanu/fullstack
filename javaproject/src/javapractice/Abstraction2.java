package javapractice;

import java.util.Scanner;

public class Abstraction2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BirdFactory bf = new BirdFactory();
		System.out.println("Select any one bird \nSearpent Eagle\nGolden Eagle");
		String birdName = sc.nextLine();
		Bird e = bf.getBirdObject(birdName);
		e.eat();
		e.fly();

	}
}

class BirdFactory {
	Eagle getBirdObject(String birdName) {
		//System.out.println(birdName.equalsIgnoreCase("Searpent Eagle"));
		if (birdName.equalsIgnoreCase("Searpent Eagle")) {
			return new SearpentEagle();
		} else if (birdName.equalsIgnoreCase("Golden Eagle")) {
			return new GoldenEagle();
		} else {
			return null;
		}
	}
}

abstract class Bird {
	abstract void fly();

	abstract void eat();
}

abstract class Eagle extends Bird {

	void fly() {
		System.out.println("Eagle is flying...");
	}

	void eat() {
		System.out.println("Eagle is eating...");
	}
}

class SearpentEagle extends Eagle {
	void fly() {
		System.out.println("Searpent eagle is flying....");
	}

	void eat() {
		System.out.println("Searpent eagle is eating....");
	}
}

class GoldenEagle extends Eagle {
	void fly() {
		System.out.println("Golden eagle is flying....");
	}

	void eat() {
		System.out.println("Golden eagle is eating....");
	}
}
