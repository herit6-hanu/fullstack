package javapractice;

public class DeamonThread1 {
	public static void main(String[] args) {
		Eclipse e = new Eclipse();
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);

		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.setName("typing");
		t2.setName("saving");
		t3.setName("compiling");
		t1.start();
		t2.start();
		t3.start();
	}
}

class Eclipse implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equalsIgnoreCase("typing")) {
			task1();
		} else if (name.equalsIgnoreCase("saving")) {
			task2();
		} else if (name.equalsIgnoreCase("compiling")) {
			task3();
		}
	}

	public void task1() {
		System.out.println("Typing is started...");
		int i = 1;
		while (i < 5) {
			System.out.println("typing...");
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("Typing is completed...");
	}

	public void task2() {
		System.out.println("Autosave is processing....");
		while (true) {
			System.out.println("Saving...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("Autosave is completed...");
	}

	public void task3() {
		System.out.println("Compilation is starting...");
		while (true) {
			System.out.println("Compiling....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}