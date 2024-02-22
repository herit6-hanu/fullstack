package javapractice;

public class AllVariables {
	public static void main(String[] args) {
		Demo7 d=new Demo7();
	}

}
class Demo7{
	//declaring instance variables
	int a;
	int b;
	static int x;
	static int y;
	{
		x=43;
		System.out.println("This is non-static block "+x);
	}
	void fun1() {
		System.out.println("This is non-static method");
	}
	Demo7() {
		a=44;
		b=434;
	}
	static{
		x=434;
		System.out.println("This is static block "+x);
	}
	static void fun2() {
		System.out.println("This is static method");
	}
}