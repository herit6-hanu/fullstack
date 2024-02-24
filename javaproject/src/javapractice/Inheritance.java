package javapractice;

public class Inheritance extends Demo8{
	public static void main(String[] args) {
		Demo10 d=new Demo10();
		System.out.println(d.a+" "+d.b);
	}
}

class Demo9 {
	int a=453;
	int b;
}

class Demo10 extends Demo9 {
	{
	a=44;
	b=435;
	}
}