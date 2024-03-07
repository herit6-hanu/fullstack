package javapractice;

public class Interface2 {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Monitor ref;
		ref=m;
		ref.display();
		((Mouse)(ref)).specializedMethod();
	}

}


interface Monitor{
	void display();
}

class Mouse implements Monitor{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	void specializedMethod() {
		System.out.println("This is specialized method");
	}
}