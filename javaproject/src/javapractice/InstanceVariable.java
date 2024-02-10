package javapractice;

class InstanceVariable2 {
	int a;
	float b;
	char c;
	boolean d;
	String e;
}
public class InstanceVariable{
	public static void main(String[] args) {
		InstanceVariable2 iv=new InstanceVariable2();
		System.out.println(iv.a);
		System.out.println(iv.b);
		System.out.println(iv.c);
		System.out.println(iv.d);
		System.out.println(iv.e);
	}
}
