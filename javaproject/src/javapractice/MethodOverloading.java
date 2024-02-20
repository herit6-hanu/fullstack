package javapractice;

public class MethodOverloading {
	public static void main(String[] args) {
		Functions fun = new Functions();
		System.out.println(fun.sub(56, 43));
		System.out.println(fun.sub(56.546f, 43));
		System.out.println(fun.sub(56.456f, 43.564f));
		System.out.println(fun.sub(56, 43.453f));
	}

}

class Functions{
	int sub(int a,int b) {
		return a-b;
	}
	float sub(float a,int b) {
		return a-b;
	}
	float sub(float a,float b) {
		return a-b;
	}
	float sub(int a,float b) {
		return a-b;
	}
	
	
}