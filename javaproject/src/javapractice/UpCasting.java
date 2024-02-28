package javapractice;

public class UpCasting {

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

class Bidda extends Pedhayya1{
	void fun3() {
		System.out.println("This is bidda method");
	}
	@Override
	void fun1() {
		System.out.println("inherited pedhayya method in bidda method");
	}
}