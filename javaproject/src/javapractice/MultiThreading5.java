package javapractice;

public class MultiThreading5 {
	public static void main(String[] args) {
		SingleClass sc = new SingleClass();

		Thread t1 = new Thread(sc);
		Thread t2 = new Thread(sc);
		Thread t3 = new Thread(sc);
		
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class SingleClass implements Runnable {

	

	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equalsIgnoreCase("task1")) {
			task1();
		} else if (name.equalsIgnoreCase("task2")) {
			task2();
		} else if (name.equalsIgnoreCase("task3")) {
			task3();
		}else {
			System.out.println(name);
		}
	}

	void task1() {
		System.out.println("This is task - 1");
	}

	void task2() {
		System.out.println("This is task - 2");
	}

	void task3() {
		System.out.println("This is task - 3");
	}
}