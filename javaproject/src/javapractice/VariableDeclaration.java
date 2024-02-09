package javapractice;

public class VariableDeclaration {
	public static void main(String[] args) {
		int a=10,b=20; // we can assign multiple values like this if the data type is same
		int res=a++ / (b++ * --a) + ++a;
		System.out.println(res);
	}

}
