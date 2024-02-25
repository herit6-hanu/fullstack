package javapractice;

public class MultiInheritance {
	public static void main(String[] args) {
		CA c = new CA();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.funA();
		c.funB();
		c.funC();
	}

}

class AB {
	int a;

	void funA() {
		System.out.println("this is a method");
	}
}

class BC extends AB {
	int b;

	void funB() {
		System.out.println("this is b method");
	}
}

class CA extends BC {
	int c;

	void funC() {
		System.out.println("this is c method");
	}
}