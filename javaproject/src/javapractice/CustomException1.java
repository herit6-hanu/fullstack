package javapractice;

import java.util.Scanner;

public class CustomException1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.enterDetails();
		try {
			e.permit();
		}catch (EmployeeException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
		
	}
}


class Company {
	
}

class Employee{
	String name = "Hanumantha Reddy";
	String id = "E007848";
	String n;
	String i;
	
	Scanner sc=new Scanner(System.in);
	void enterDetails() {
		System.out.println("Enter your name ");
		n = sc.nextLine();
		System.out.println("Enter your employee id ");
		i =sc.next();
	}
	void permit() throws EmployeeException{
		if(this.name==this.n) {
			System.out.println("access granted");
		}else {
			EmployeeException e =new EmployeeException();
			System.out.println(e.getMessage());
			throw e;
		}
	}
}

class EmployeeException extends Exception {
	
	@Override
	public String getMessage() {
		return "Found Employee Exception";
	}
	public void printStackTrace() {
		System.err.println("DetailsNotFoundException");
	}
}