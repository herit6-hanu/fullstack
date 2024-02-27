package javapractice;

public class MethodsOfInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		
		//calling the inherited method
		c.study();
		
		//calling the overridden method
		c.trips();
		
		//calling the specialized method
		c.collge();
	}
	
	

}
class Parent{
	void study() {
		System.out.println("I studied 10th class");
	}
	void trips() {
		System.out.println("I haven't gone for any trips");
	}
}

class Child extends Parent{
	// it will inherited the study method
	
	//this is overridden method of parent class
	@Override
	void trips() {
		System.out.println("I went for so many trips which are conducted in my school");
	}
	
	//this is specialized method that only child class have
	void collge() {
		System.out.println("I have completed my graduation too...");
	}
}