package javapractice;

public class Concat_Addition {
	public static void main(String[] args) {
		String s1="Hanu";
		String s2="Manu";
		String s3="Hanu"+"Manu";
		String s4="Hanu"+"Manu";
		if (s3==s4) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are unequal");
		}
		s3=s1+s2;
		s4=s1+s2;
		if (s3==s4) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are unequal "+System.identityHashCode(s3)+" "+System.identityHashCode(s4));
		}
	}

}
