package javapdfpractice;

public class Getters_Setters2 {
	public static void main(String[] args) {
		/**
		 * You can link to members (fields or methods) of a class like so:
		 * {@link javapdfpractice.Getters_Setters#setName(String)} - link the method docu
		 */
		Details d = new Details();
		d.setName("Hanumantha Reddy");
		System.out.println(d.getName());
		d.setAge(78);
		System.out.println(d.getAge());
	}
}


class Details {
	private String name;
	private float age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(float age) {
		this.age = age;

	}

	public float getAge() {
		return age;
	}
}