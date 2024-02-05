package javapractice;

public class Pattern3 {
	public static void main(String[] args) {
		//program to print pyramid with stars
		int i;
		int j;
		int n=5;
		for(i=0;i<n;i++) {
			System.out.print(" ");
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
