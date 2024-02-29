package javapractice;

public class UpCasting3 {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.phnName();
	}
	
}


class Phone{
	Phone phnName() {
		System.out.println("This is keypad phn");
		Phone p = new Phone();
		return p;
	}
}


class SmartPhone extends Phone{
	SmartPhone phnName() {
		System.out.println("This is smart phn");
		SmartPhone s = new SmartPhone();
		System.out.println(System.identityHashCode(s));
		return s;
	}
}