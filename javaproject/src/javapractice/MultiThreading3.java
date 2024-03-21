package javapractice;

public class MultiThreading3 {
	public static void main(String[] args) {
		Addition a = new Addition();
		Multiplication m = new Multiplication();
		Division d = new Division();
		a.start();
		m.start();
		d.start();
	}
}

class Addition extends Thread {
	static int a = 34;
	static int b = 423;

	public void run() {
		System.out.println("Sum of two numbers are " + (a + b));
	}
}

class Multiplication extends Thread {
	static int a = 34;
	static int b = 423;

	public void run() {
		System.out.println("Product of two numbers are " + (a * b));
	}
}

class Division extends Thread {
	static int a = 343435;
	static int b = 423;

	public void run() {
		System.out.println("Division of two numbers are " + (a / b));
	}
}