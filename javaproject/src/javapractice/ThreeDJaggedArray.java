package javapractice;

import java.util.Scanner;

public class ThreeDJaggedArray {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[][][] a = new int[2][][];
			a[0] = new int[3][];
			a[1] = new int[2][];

			a[0][0] = new int[2];
			a[0][1] = new int[3];
			a[0][2] = new int[4];

			a[1][0] = new int[5];
			a[1][1] = new int[6];

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					for (int j2 = 0; j2 < a[i][j].length; j2++) {
						a[i][j][j2] = sc.nextInt();
					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					for (int j2 = 0; j2 < a[i][j].length; j2++) {
						System.out.print(a[i][j][j2] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		}

	}

}
