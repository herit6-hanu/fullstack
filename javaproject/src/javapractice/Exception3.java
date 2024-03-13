
package javapractice;

public class Exception3 {
	static void exception() throws Exception {
		int a = 100 / 0;
	}

	public static void main(String[] args) {
		try {
			exception();
		}catch(Exception e) {
			System.out.println("Error found");
		}
	}
}
