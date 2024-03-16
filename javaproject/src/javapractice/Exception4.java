package javapractice;

public class Exception4 {
	public static void main(String[] args) throws Exception{
		try {
			int a=100/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}
}
