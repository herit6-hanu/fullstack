package javapdfpractice;

import java.util.Scanner;

public class ChangeCharacters {
	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chunks = str.toCharArray();
		for(char c:chunks) {
			if(c=='V')
				chunks[c]+=32;
		}
		System.out.println(chunks);
		
	}

}
