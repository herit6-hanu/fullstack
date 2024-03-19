package javapractice;

public class Singleton1 {
	public static void main(String[] args) {
		SingletonObject1 so = SingletonObject1.getObject();
	}
}

class SingletonObject1 {
	static SingletonObject1 instance;

	private SingletonObject1() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonObject1 getObject() {
		if (instance == null) {
			instance = new SingletonObject1();
		}
		return instance;
	}
}