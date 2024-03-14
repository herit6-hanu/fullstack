package javapractice;

import java.util.Scanner;

public class Polymorphism {
	public static void main(String[] args) {
		WoodFactory wf=new WoodFactory();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Wood ref;
		ref=wf.woodFactory(name);
		try {
			ref.woodname();
		}catch(NullPointerException e) {
			System.out.println("Found Null");
		}
		
	}

}

class WoodFactory{
	Wood woodFactory(String name) {
		if (name.equalsIgnoreCase("plywood")) {
			return new PlyWood();
		} else if (name.equalsIgnoreCase("extrawood")){
				return new ExtraWood();
		}else {
			return null;
		}
	}
}
class Wood{
	void woodname() {
		System.out.println("My name is jst wood");
	}
}

class PlyWood extends Wood{
	void woodname() {
		System.out.println("My name is plywood");
	}
}

class ExtraWood extends Wood{
	void woodname() {
		System.out.println("My name is extrawood");
	}
}