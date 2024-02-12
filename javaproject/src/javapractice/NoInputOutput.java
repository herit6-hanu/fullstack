package javapractice;

public class NoInputOutput {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		int res = d.add();
		System.out.println(res);
	}

}

class Demo1 {
	int a = 54;
	int b = 34543;

	int add() {
		int c;
		c = a + b;
		return c;
	}
}