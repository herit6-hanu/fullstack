package javapractice;

public class ConstructorOverloading {
	public static void main(String[] args) {
		Demo4 d=new Demo4("Hanu",24,true);
		d.printInfo();
	}
	
}

class Demo4 {
	String name;
	int age;
	boolean isSingle;
//	public Demo() {
//		
//	}
	public Demo4(String name) {
		this.name=name;
	}
	public Demo4(String name,int age) {
		this(name);
		this.age=age;
		
	}
	public Demo4(String name,int age,boolean isSingle) {
		this(name,age);
		this.isSingle=isSingle;
	}
	void printInfo() {
		System.out.println("My name is "+name+" My age is "+age+" if you ask am i single - "+isSingle);
	}
}