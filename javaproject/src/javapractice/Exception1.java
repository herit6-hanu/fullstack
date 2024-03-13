package javapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
		}catch(ArithmeticException e){
			System.out.println("can't divisible by zero");
		}catch(InputMismatchException e) {
			System.out.println("please give a valid integer");
		}
		sc.close();
	}
}
