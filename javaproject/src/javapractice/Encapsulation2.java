package javapractice;

public class Encapsulation2 {
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		d.setAge(24);
		d.setName("Hanu");
		System.out.println("My name is "+d.getName()+" and my age is "+d.getAge());
	}

}
class Demo8{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}