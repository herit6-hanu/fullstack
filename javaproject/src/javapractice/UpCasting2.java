package javapractice;

public class UpCasting2 {
	public static void main(String[] args) {
		
		//this is tight coupling we can't achieve polymorphism through this
		Bitco b = new Bitco();
		Cello c = new Cello();
		Reynolds r = new Reynolds();
		
		
		Stationary st = new Stationary();
		
		//this is loose coupling let short the code more flexible
		/*
		Pen ref;
		ref=b;
		ref.ink();
		ref.name();
		
		ref=c;
		ref.ink();
		ref.name();
		
		
		ref=r;
		ref.ink();
		ref.name();
		*/
		
		st.print(b);
		st.print(c);
		st.print(r);
		Pen ref=new Cello();
		((Cello)ref).speciliazedMethod();
		
	}

}
class Stationary{
	void print(Pen ref) {
		ref.name();
		ref.ink();
		
	}
}

class Pen{
	void name() {
		System.out.println("pen name goes here...");
	}
	void ink() {
		System.out.println("ink of the pen");
	}
}

class Bitco extends Pen{
	void name() {
		System.out.println("Pen name is Bitco");
	}
	void ink() {
		System.out.println("ink of the pen is black");
	}
}

class Reynolds extends Pen{
	void name() {
		System.out.println("Pen name is Reynolds");
	}
	void ink() {
		System.out.println("ink of the pen is blue");
	}
}


class Cello extends Pen{
	void name() {
		System.out.println("Pen name is Cello");
	}
	
	void ink() {
		System.out.println("ink of the pen is red");
	}
	void speciliazedMethod() {
		System.out.println("Specialized method");
	}
}