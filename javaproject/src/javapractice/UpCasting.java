package javapractice;

public class UpCasting {
	public static void main(String[] args) {
		//Pedhayya1 p=new Ayya1();
		Pedhayya1 p;
		p=new Ayya1();
		p.fun1();
		((Ayya1)p).fun2(); //downcasting
		
		p=new Bidda1();//upcasting
		p.fun1();
		p=new Pedhayya1();
		p.fun1();
	}
}

class Pedhayya1 {
	void fun1() {
		System.out.println("This is pedhayya method");
	}
}

class Ayya1 extends Pedhayya1{
	void fun2() {
		System.out.println("This is ayya method");
	}
	@Override
	void fun1() {
		System.out.println("Inherited pedhayya method in ayya class");
	}
}

class Bidda1 extends Pedhayya1{
	void fun3() {
		System.out.println("This is bidda method");
	}
	@Override
	void fun1() {
		System.out.println("inherited pedhayya method in bidda method");
	}
}