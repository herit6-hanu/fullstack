package javapractice;

public class Singleton {
	public static void main(String[] args) {
		SingletonObject so=SingletonObject.getObject();
		so.print();
		SingletonObject so1=SingletonObject.getObject();
		so.print();
	}
}


class SingletonObject{
	static int a;
	static SingletonObject so = new SingletonObject();
	{   
		a++;
	}
	private SingletonObject() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonObject getObject() {
		return so;
	}
	static void print() {
		System.out.println(a);
	}
}