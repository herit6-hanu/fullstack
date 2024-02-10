package javapractice;

public class PassByReference {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name="Tiger";
		a.legs=4;
		a.cost=32432433.34f;
		System.out.println(a.name);
		System.out.println(a.legs);
		System.out.println(a.cost);
		
		Animal b;
		b=a;
		b.name = "Hen";
		b.legs = 2;
		b.cost = 700.0f;
		
		//after changing the values of reference a
		System.out.println(a.name);
		System.out.println(a.legs);
		System.out.println(a.cost);
		
		System.out.println(b.name);
		System.out.println(b.legs);
		System.out.println(b.cost);
	}

}
class Animal {
	String name;
	int legs;
	float cost;
}