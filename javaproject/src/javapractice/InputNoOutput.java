package javapractice;

public class InputNoOutput {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		int a = 45345;
		int b = 8765;
		d.add(a, b);
	}

}

class Demo2 {
	void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
	}
}