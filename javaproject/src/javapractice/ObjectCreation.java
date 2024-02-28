package javapractice;

public class ObjectCreation {
	public static void main(String[] args) {
		ObjectClass ob = new ObjectClass();
		System.out.println(System.identityHashCode(ob));
		//System.out.println(o);
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
