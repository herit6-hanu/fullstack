package javapractice;

public class Pattern3 {
	public static void main(String[] args) {
		// program to print pyramid with stars
		int i, j,k;
		int n = 5;
		for (i=0;i<n;i++) {
			k=0;
			for(j=0;j<n-i-1;j++) {           //spaces
				System.out.print(" ");
				k++;
			}
			for(;k<n;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
