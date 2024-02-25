package javapractice;

public class CyclicInheritance {
	public static void main(String[] args) {
		System.out.println("this is test statement");
	}

}

// cyclic inheritance is not possible in java because there will be process of cycling
/*
 * class ABC extends DEF{ int a; void funA(){
 * System.out.println("this is a method"); } }
 * 
 * class BCD extends ABC{ int b; void funB() {
 * System.out.println("this is b method"); } }
 * 
 * class DEF extends BCD{ int c; void funC() {
 * System.out.println("this is c method"); } }
 */