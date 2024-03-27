package javapractice;

public class DeadLock2 {
	public static void main(String[] args) {
		Resource r = new Resource();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class Resource implements Runnable {
	Object r1 = new Object();
	Object r2 = new Object();

	public void run() {
		resource1();
		resource2();
	}

	void resource1() {
		synchronized (r1) {
			System.out.println("Thread 1: Holding resource 1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1: Waiting for resource 2");
			synchronized (r2) {
				System.out.println("Thread 1: Holding resource 1 and resource 2");
			}
		}
	}

	void resource2() {
		synchronized (r2) {
			System.out.println("Thread 2: Holding resource 2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread 2: Waiting for resource 1");
			synchronized (r1) {
				System.out.println("Thread 2: Holding resource 1 and resource 2");
			}
		}
	}
}
