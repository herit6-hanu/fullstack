package javapdfpractice;

import java.util.StringTokenizer;

public class StringTokens {
	public static void main(String[] args) {
		StringTokenizer st =new StringTokenizer("thia si sthe on eof the best ","ae");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
