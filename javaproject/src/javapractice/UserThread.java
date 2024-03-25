package javapractice;

public class UserThread {
	public static void main(String[] args) {
		System.out.println("Main thread is executing....");
		UThread ut = new UThread();
		ut.start();
		System.out.println("Main thread is completed....");
	}

}


class UThread extends Thread{
	public void run() {
		for(;;) {
			System.out.println("User thread is executing ...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}