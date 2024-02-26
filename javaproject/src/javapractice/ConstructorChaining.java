package javapractice;

public class ConstructorChaining {
	public static void main(String[] args) {
		Two o = new Two();
		o.print();
	}

}

class One {
	int a, b;

	One() {
		a = 546;
		b = 425;
	}

	One(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Two extends One {
	int x, y;

	Two(int a, int b) {
		super(a, b);
		x = a;
		y = b;
	}

	Two() {
		this(435, 453);
	}

	void print() {
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(x);
		System.out.println(y);
	}
}