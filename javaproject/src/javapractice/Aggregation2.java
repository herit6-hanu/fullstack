package javapractice;

public class Aggregation2 {
	public static void main(String[] args) {
		Chair c = new Chair("nilkamal");
		Table t = new Table("hassan furniture", c);
		t.display();
		t = null;
		System.out.println(c.getName());
	}
}

class Table {
	private String name;
	private Chair chair;

	public Table(String name, Chair chair) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.chair = chair;
	}

	void display() {
		System.out.println("table name is " + name);
		System.out.println("chair name is " + chair.getName());
	}
}

class Chair {
	private String name;

	public Chair(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	String getName() {
		return name;
	}

}