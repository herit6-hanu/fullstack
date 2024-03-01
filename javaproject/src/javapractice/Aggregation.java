package javapractice;

//Aggregation example
class Department {
	private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class University {
	private String name;
	private Department department;

	public University(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public void displayInfo() {
		System.out.println("University: " + name);
		System.out.println("Department: " + department.getName());
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Department department = new Department("Computer Science");
		University university = new University("Stanford", department);
		university.displayInfo();
		university = null;
		// System.out.println(department.getName());

	}
}
