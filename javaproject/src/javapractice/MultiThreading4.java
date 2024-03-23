package javapractice;

public class MultiThreading4 {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		th1.start();
		th2.start();
		th3.start();
	}

}

class Task1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is task - 1");
	}

}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("This is task - 2");
	}
}

class Task3 implements Runnable {
	@Override
	public void run() {
		System.out.println("This is task - 3");
	}
}