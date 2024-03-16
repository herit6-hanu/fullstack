package javapractice;

public class LeetCode4 {
	static int countVowels(String str) {
		int count =0;
		for(char c:str.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
	public static boolean halvesAreAlike(String s) {
		s=s.toLowerCase();
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2);
        if(countVowels(a)==countVowels(b)) {
        	return true;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(halvesAreAlike("Hanu"));
	}
}
