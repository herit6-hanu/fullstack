package javapractice;

public class WaysToCreateString {
	public static void main(String[] args) {
		String str1 = new String("Hanumantha Reddy");// creating using object
		String str2 = "Hanumantha Reddy";
		char[] c = { 'H', 'a', 'n', 'u', 'm', 'a', 'n', 't', 'h', 'a', ' ', 'R', 'e', 'd', 'd', 'y' };
		String str3 = new String(c);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
