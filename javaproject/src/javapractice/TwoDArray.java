package javapractice;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]a=new int[2][5];
		//provide the values to the 2d array using the scanner class
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print("Enter an integer at "+(i+1)+" row & coloumn "+(j+1)+" - ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("");
		//print the values inside the 2d array
		System.out.println("printing the values:");
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println("Value at row "+(i+1)+" & coloumn "+(j+1)+" = "+a[i][j]);
			}
		}
		
	}

}
