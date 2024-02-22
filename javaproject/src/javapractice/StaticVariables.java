package javapractice;

public class StaticVariables {
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		Demo5.funStatic();
	}

}
class Demo5{
	static int a,b;
	static {
		System.out.println("This is static block");
	}
	static void funStatic(){
		a=43;
		b=34;
		System.out.println("values are "+a+" and "+b);
	}
	{
		System.out.println(a);
	}
}