package javapractice;

public class NoInputNoOutput {
	public static void main(String[] args) {
		Demo d =new Demo();
		d.add();
	}

}
class Demo {
	int a;
	int b;
	/**
	 * addition method returns nothing
	 * no-input 
	 * @param nooutput
	 */
	void add() {
		int c;
		c=a+b;
		System.out.println(c);
	}
}