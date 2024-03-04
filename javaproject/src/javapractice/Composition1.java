package javapractice;

public class Composition1 {
	public static void main(String[] args) {
		Headphones hph = new Headphones("EPOS", 2400.00f);
		hph.display();
	}

}

class Mic {
	private boolean micIsWorking;

	public Mic(boolean micIsWorking) {
		this.micIsWorking = micIsWorking;
	}

	boolean getMicIsWorking() {
		return micIsWorking;
	}
}

class Headphones {
	private String name;
	private float cost;
	private Mic mic;

	public Headphones(String name, float cost) {
		this.mic = new Mic(true);
		this.name = name;
		this.cost = cost;
	}

	void display() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(mic.getMicIsWorking());
	}
}