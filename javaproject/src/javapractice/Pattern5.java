package javapractice;

public class Pattern5 {
	public static void main(String[] args) {
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
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<n-i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
