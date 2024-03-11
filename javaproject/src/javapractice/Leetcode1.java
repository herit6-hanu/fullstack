package javapractice;

public class Leetcode1 {
	public static int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++){
           int temp=digits[i];
           s+=Integer.toString(temp);
        }
        int integer=Integer.parseInt(s);
        integer++;
        int[] res=new int[0];
        return res;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		plusOne(arr);
	}

}
