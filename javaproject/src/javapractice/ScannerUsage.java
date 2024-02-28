package javapractice;

import java.util.Scanner;

public class ScannerUsage {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			byte a = scan.nextByte();
			//System.out.println(a);
		}

	}

}
