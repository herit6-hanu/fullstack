package javapractice;

public class SingleInheritance {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.funA();
		b.funB();
		
	}
}

class A {
	int a;

	void funA() {
		System.out.println("this is a method");
	}
}

class B extends A {
	int b;

	void funB() {
		System.out.println("this is b method");
	}
}