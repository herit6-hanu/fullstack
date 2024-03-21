package javapractice;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double d = sc.nextDouble();
		String str = sc.nextLine();
		System.out.println("String: " + str);
		System.out.println("Double: " + d);
		System.out.println("Int: " + a);
	}

}
