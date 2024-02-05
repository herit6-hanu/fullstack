package javapractice;

public class Pattern7 {
	public static void main(String[] args) {
		int i,j,n;
		n=15;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				if(j==0 || j==i||i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
