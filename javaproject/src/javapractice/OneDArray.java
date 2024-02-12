package javapractice;

public class OneDArray {
	public static void main(String[] args) {
		int[] a = new int[10];
		// set the values to the array
		int set = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = set;
			set++;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
