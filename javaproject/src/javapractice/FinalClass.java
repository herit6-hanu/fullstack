package javapractice;

public class FinalClass {
	final static int a = 0;
	
	public static void main(String[] args) {
		final int a;
		a=20;
		System.out.println(a);
		System.out.println(FinalClass.a);
	}

}
