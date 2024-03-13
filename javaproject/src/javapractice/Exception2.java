package javapractice;

public class Exception2 {
	static void exception() throws Exception{
		try {
			int a=100/0;
			
		}catch(Exception e){
			System.out.println("Error found");
			throw e;
		}finally {
			System.out.println("exception got terminate");
		}
		
	}
	public static void main(String[] args) {
		try {
			exception();
		}catch(Exception e){
			System.out.println("Handled in main method");
		}
		
	}

}
