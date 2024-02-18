package javapractice;

public class CharArrayToString {
	/**
	 * 
	 * @param a array of characters
	 * @return convert the array of characters to string
	 */
	static String toString(char[] a) {
		String str="";
		for(int i=0;i<a.length;i++) {
			str+=a[i];
		}
		return str;
	}
	/**
	 * 
	 * @param a array of characters
	 * @return ascii values of the characters 
	 */
	static int toUTF(char[] a) {
		int res=0;
		for(int i=0;i<a.length;i++) {
			res+=(int)a[i];
		}
		return res;
	}
	public static void main(String[] args) {
		char []a= {'h','a','n','u'};
		String str=toString(a);
		System.out.println(str);
		int asciivalue=toUTF(a);
		System.out.println(asciivalue);
	}

}
