package javapractice;

public class MultiThreading6 {
	public static void main(String[] args) {
		A11 a11 = new A11();
		A2 a2 = new A2();
		A3 a3 = new A3();
		a11.start();
		a2.start();
		a3.start();
	}

}

class A2 extends Thread {
	private void task2() {
		System.out.println("This is task - 2");

	}

	public void run() {
		task2();
	}
}

class A3 extends Thread {
	private void task3() {
		System.out.println("This is task - 3");

	}

	public void run() {
		task3();
	}
}

class A11 extends Thread {

	public void run() {
		task1();
	}

	private void task1() {
		System.out.println("This is task - 1");

	}

	private void task2() {
		System.out.println("This is task - 2");

	}

}