package javapdfpractice;

public class Buiders {
	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		
		System.out.println(sb.capacity());
		sb.append("aajdndijfgnianfg");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("a");
		System.out.println(sb.capacity());
		sb.setLength(0);
		System.out.println(sb.toString());
		sb.append("H").append("a").append("n");
		System.out.println(sb);
	}

}
