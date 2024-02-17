package javapractice;

public class Concat_ConcatFunction {
	public static void main(String[] args) {
		String s1="Hanu";
		String s2="Manu";
		String s3=s1.concat(s2);
		String s4=s1.concat(s2);
		if (s3==s4) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are unequal");
		}
		
		//compareTo
		int res=s3.compareTo(s4);
		if (res==0) {
			System.out.println("Strings are same");
		} 
		else if(res>0){
			System.out.println("s3 is greater than s4");
		}else {
			System.out.println("s4 is greater than s3");
		}
	}

}
