package javapractice;

public class StringBuilder_1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		//Here i am appending multiple type of data in string builder
		sb.append("My name is Hanu ");
		sb.append("My age is ");
		sb.append(24);
		sb.append(" My favourite character is ");
		sb.append('D');
		sb.append(" My favourite number is "+true);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		sb.delete(80, sb.length());
		System.out.println(sb);
		sb.insert(80, true);
		System.out.println(sb);
		sb.replace(80, sb.length(),"false");
		System.out.println(sb);
		System.out.println(sb.substring(80));
		System.out.println(sb.charAt(11));
		//System.out.println(sb.reverse());
		System.out.println(sb.indexOf("H"));
		System.out.println(sb.lastIndexOf("My",30));
		System.out.println(sb);
		System.out.println(sb.indexOf("a",5));
	}
}
