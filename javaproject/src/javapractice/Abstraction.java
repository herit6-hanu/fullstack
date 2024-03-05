package javapractice;

import java.util.Scanner;

public class Abstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any of the below \n Circle \n Rectangle \n Square");
		String shape = sc.next();
		ShapeFactory sf = new ShapeFactory();
		Shape s = sf.getShape(shape);
		s.area();
		System.out.println(s.displayArea());
	}

}

class ShapeFactory {
	Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		} else {
			return null;
		}
	}
}

abstract class Shape {
	float area;

	abstract float area();

	abstract String displayArea();
}

class Circle extends Shape {
	int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius ");
		radius = sc.nextInt();

	}

	float area() {
		return area = 3.142f * radius * radius;
	}

	String displayArea() {
		return "Area = " + area;
	}
}

class Rectangle extends Shape {
	int length;
	int breadth;
	float area;

	public Rectangle() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ");
		length = sc.nextInt();
		System.out.println("Enter breadth ");
		breadth = sc.nextInt();

	}

	float area() {
		return area = length * breadth;
	}

	String displayArea() {
		return "Area = " + area;
	}
}

class Square extends Shape {
	int side;
	float area;

	public Square() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side ");
		side = sc.nextInt();
	}

	float area() {
		return area = side * side;
	}

	String displayArea() {
		return "Area = " + area;
	}
}