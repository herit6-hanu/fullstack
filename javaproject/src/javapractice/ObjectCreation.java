package javapractice;

public class ObjectCreation {
	public static void main(String[] args) {
		ObjectClass o = new ObjectClass();
		System.out.println(o);
	}

}
class ObjectClass {
	int a=55;
	int b=32;
	void sum() {
		int c;
		c=a+b;
		System.out.println(c);
	}
}
