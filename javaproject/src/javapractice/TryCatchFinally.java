package javapractice;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int a=100/0;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Exit exception");
		}
	}

}
