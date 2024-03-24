package javapdfpractice;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		byte byteVar = 65;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;
		System.out.println(doubleVar);
	}

}
