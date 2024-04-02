package javapdfpractice;

import java.util.regex.Pattern;

public class StringMethods {
	public static void main(String[] args) {
		String str1 ="Hanu";
		String str2 = "Anu Hanumantha Reddy";
		System.out.println(str2.contains(str1));
		System.out.println(str2.indexOf(str1));
		
		
		
		String str3 = "This     snajdjjna  ahfiasndifn";
		String[] chunks = str3.split("\\s+");
		System.out.println(chunks.length);
		String regex = Pattern.quote(".");
		System.out.println("aaa.bbb".split(regex).length);
		System.out.println("aaa  af  ".split(" ",5).length);
	}

}
