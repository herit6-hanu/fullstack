package javapractice;

public class Pattern6 {
	public static void main(String[] args) {
		int i, j, k, n;
		n = 5;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 0; i <=n; i++) {
			for (j = n; j >=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
