package javapractice;

public class Interface8 {
	public static void main(String[] args) {
		// All a = new All();
		AllFactory af = new AllFactory();
		All ref;
	}

}

class AllFactory {
	//All object(String name) {
		//if(name.equalsIgnoreCase("alpha")) {
		    //return (All) new Alpha();}
		//else if(name.equalsIgnoreCase("Beta")) {
			//return (All) new Beta();}
	//}
}

interface Alpha {
	int a = 5;

	void value();
}

interface Beta {
	int b = 10;

	void value();
}

interface Gama {
	int c = 15;

	void value();
}

class All implements Alpha, Beta, Gama {

	@Override
	public void value() {
		// TODO Auto-generated method stub
		System.out.println(Alpha.a);
	}

}