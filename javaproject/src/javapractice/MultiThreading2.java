package javapractice;

public class MultiThreading2 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t); //Thread[main,5,main]
		//main is thread name , 5 is priority ,main stack
		
		t.setName("Hanu");
		t.setPriority(6);
		System.out.println(t);//updated the given values
		
	}

}
