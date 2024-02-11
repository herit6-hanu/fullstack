package javapractice;

public class CallMainMethod {
	public static void main(String[] args) {
		int m = MainMethod.main(args);
		System.out.println(m);
	}
	

}
class MainMethod {
	public static int main(String[] args) {
		int a=10;
		System.out.println("Inside main method");
		return a;
	}
}