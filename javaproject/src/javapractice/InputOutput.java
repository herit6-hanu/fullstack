package javapractice;

public class InputOutput {
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		int a = 43583;
		int b = 44453;
		int res = d.add(a, b);
		System.out.println(res);
	}

}

class Demo3 {
	int add(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
}