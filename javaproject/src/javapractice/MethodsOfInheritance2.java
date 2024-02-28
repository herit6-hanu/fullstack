package javapractice;

public class MethodsOfInheritance2 {
	public static void main(String[] args) {
		Bidda b = new Bidda();
		b.height();
		b.sal();
		b.occupation();

		Ayya a = new Ayya();
		a.height();
	}

}

class Ayya {
	private float height = 5.4f;
	float sal = 500000.00f;

	void height() {
		System.out.println("My height is " + height);
	}

	void sal() {
		System.out.println("My salary is " + sal);
	}

}

class Bidda extends Ayya {
	float sal = 600000.00f;
	String occupation = "Software Engineer";

	// overridden method
	@Override
	void sal() {
		System.out.println("My salary is " + sal);
	}

	// specialized method
	void occupation() {
		System.out.println("My profession is " + occupation);
	}
}