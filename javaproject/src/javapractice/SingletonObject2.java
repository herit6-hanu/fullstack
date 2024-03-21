package javapractice;

public class SingletonObject2 {
	public static void main(String[] args) {
		SingleObject sa = SingleObject.so;
		SingleObject sa1 = SingleObject.so;
		sa.print();
		sa1.print();
	}
}

class SingleObject {
	static int a;
	static SingleObject so = new SingleObject();

	private SingleObject() {
		// TODO Auto-generated constructor stub
	}
	static {
		a++;
	}
	static void print() {
		System.out.println("Done without getObject "+a);
	}

}
