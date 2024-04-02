package javapdfpractice;

import java.util.StringTokenizer;

public class MultipleDelimeters {
	public static void main(String[] args) {
		String s = "This is one of the largest number in the world...";
		StringTokenizer str = new StringTokenizer(s,"ioe");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			
			
		}
		String[] elements= {"Nenu","Nuvvu","Manam"};
		System.out.println(String.join("+", elements));
	}
}