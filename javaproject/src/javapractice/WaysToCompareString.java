package javapractice;

public class WaysToCompareString {
	public static void main(String[] args) {
		String str1=new String("Hanu");
		String str2="Hanu";
		if (str1==str2) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are unequal"	);
		}
		if (str1.equals(str2)) {
			System.out.println("Values are equal");
		} else {
			System.out.println("Values are unequal");
		}
		if (str1.compareTo(str2)==0) {
			System.out.println("Character values are same");
		} else {
			System.out.println("Character values are not same");
		}
	}
}
