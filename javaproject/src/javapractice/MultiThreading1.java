package javapractice;

public class MultiThreading1 {
	public static void main(String[] args) {
		Demo11 d1 = new Demo11();
		Demo22 d2 = new Demo22();
		Demo33 d3 = new Demo33();
		d1.start();
		d2.start();
		d3.start();
	}
}


class Demo11 extends Thread{
	public void run() {
		System.out.println("Task - 1 is started");
		String[] arr= {"Amma","Nanna","Oooo","tamil","ammai"};
		for(String str:arr) {
			System.out.println(str);
		}
		System.out.println("Task - 1 is ended");
	}
}

class Demo22 extends Thread {
	public void run() {
		System.out.println("Task - 2 is started");
		char[]c="abcdef".toCharArray();
		for(char ctr:c) {
			System.out.println(ctr);
		}
		System.out.println("Task - 2 is ended");
	}
}

class Demo33 extends Thread{
	public void run() {
		System.out.println("Task -3 is started");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Task - 3 is ended");
	}
}