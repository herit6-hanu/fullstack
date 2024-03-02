package javapractice;

public class Composition2 {
	public static void main(String[] args) {
		Pen1 p = new Pen1();
		p.penMethod();
	}

}

class Pen1 {
	private String name;
	private Cap cap;

	public Pen1() {
		// TODO Auto-generated constructor stub
		cap = new Cap();
	}

	void penMethod() {
		cap.capMethod();
	}
}

class Cap {
	void capMethod() {
		System.out.println("This is the cap method");
	}
}