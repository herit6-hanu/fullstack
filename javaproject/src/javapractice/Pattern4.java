package javapractice;

public class Pattern4 {
	public static void main(String[] args) {
		int i,j,k,n;
		n=5;
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
