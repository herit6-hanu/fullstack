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

// super or parent class
class A {
	int a;

	void funA() {
		System.out.println("this is a method");
	}
}
/**
 * One subclass inherits the properties & behaviour of one super class is known as single inheritance
 * class b inherits the properties of class a
 */

// sub or child class
class B extends A {
	int b;

	void funB() {
		System.out.println("this is b method");
	}
}