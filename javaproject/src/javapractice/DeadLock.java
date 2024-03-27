package javapractice;

public class DeadLock {

	public static void main(String[] args) {
		Printer p = new Printer();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		t1.start();
		t2.start();
		t3.start();
	}

}

class Printer implements Runnable {
	public void run() {
		System.out.println("Allow only one member....");
		synchronized(this){
			System.out.println("lock happened...");
			System.out.println("so allow only one member....");
		}
		System.out.println("Allow only one member....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}