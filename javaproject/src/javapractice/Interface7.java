package javapractice;

public class Interface7 {
	public static void main(String[] args) {
		System.out.println(Seven.a);
		Seven.method1();
	}
}

interface Seven{
	int a=6;
	static void method1() {
		System.out.println("method-1");
	}
	default void method2() {
		System.out.println("method-2");
	}
}