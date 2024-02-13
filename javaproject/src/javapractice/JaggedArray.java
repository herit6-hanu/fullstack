package javapractice;

public class JaggedArray {
	public static void main(String[] args) {
		//2 classrooms with 3 students and 5 students
		int [][]a={{234,3242,434},{4243,234,24,242,4332}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("value at row "+(i+1)+" & column "+(j+1)+" = "+a[i][j]);
			}
			
		}
	}

}
