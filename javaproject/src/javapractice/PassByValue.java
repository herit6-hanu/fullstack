package javapractice;

public class PassByValue {
	public static void main(String[] args) {
		int a=2000;
		int b;
		b=a;
		System.out.println(a);
		System.out.println(b);
		b=300; //by changing the b value a is not getting affected or changed
		System.out.println(a);
		System.out.println(b);
	}

}
