package javapractice;
public class ThreeDArray {
	public static void main(String[] args) {
		int [][][]a={ {{2,3,4,4554},{234,4532,3425,456}},{{234,2142,14234,4543},{313,2142,4,43}},
				{{42,324,234,32},{43232,4324,3242,34}}};
		System.out.println(a.length+" "+a[0].length+" "+a[0][0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(+a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
