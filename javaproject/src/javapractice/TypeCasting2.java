package javapractice;

public class TypeCasting2 {
	public static void main(String[] args) {
		//narrowing
		int a=272;
		byte b;
		b=(byte) a;
		//here once it reaches the boundary insteading of throwing error it will wrap around
		System.out.println(b); //16
		
	}

}
