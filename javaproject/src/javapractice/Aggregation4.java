package javapractice;

public class Aggregation4 {
	public static void main(String[] args) {
		Shirt s = new Shirt("Wrogn", 38);
		Pant p = new Pant("Roadster", 30, s);
		p.print();
		s.print();
	}
}

class Shirt {
	String brandName;
	int size;

	public Shirt(String brandName, int size) {
		// TODO Auto-generated constructor stub
		this.brandName = brandName;
		this.size = size;
	}

	void print() {
		System.out.println("My shirt brand name is " + brandName);
	}
}

class Pant {
	String brandName;
	int size;
	Shirt s;

	public Pant(String brandName, int size, Shirt s) {
		// TODO Auto-generated constructor stub
		this.brandName = brandName;
		this.size = size;
		this.s = s;
	}

	void print() {
		System.out.println("My shirt brand name is " + s.brandName);
	}
}