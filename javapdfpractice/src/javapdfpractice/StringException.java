package javapdfpractice;

import java.util.Objects;

public class StringException {
	public static void main(String[] args) {
		String str1="Boo";
		String str2 ="Boo";
		
		//System.out.println(str2.equals(str1)); //always pass the null values on the right side to avoid
		//null pointer exception
		System.out.println(Objects.equals(str1, str2));
		
		String str3 ="Hello";
		String str4 =new String("Hello");
		//str4=str4.intern();
		//System.out.println(str3==str4);
		System.out.println(System.identityHashCode(str4));
		String str5 = "Hanu";
		System.out.println(str5.toLowerCase() +" "+ str5.toUpperCase());
	}

}
