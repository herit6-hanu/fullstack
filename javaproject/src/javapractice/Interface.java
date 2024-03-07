package javapractice;

public class Interface {
	public static void main(String[] args) {
		SampleFactory sf = new SampleFactory();
		Sample1 s1 = new Sample1();
		Sample2 s2 = new Sample2();
		sf.factoryMethod(s1);
		sf.factoryMethod(s2);
	}

}

class SampleFactory{
	void factoryMethod(Sample ref){
		ref.method1();
		ref.method2();
	}
}
interface Sample{
	void method1();
	void method2();
}

class Sample1 implements Sample{
	@Override
	public void method1() {
		System.out.println("method - class 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method - class12");
	}
}

class Sample2 implements Sample{
	@Override
	public void method1() {
		System.out.println("method - class2");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method - class22");
	}
}