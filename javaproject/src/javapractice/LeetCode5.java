package javapractice;

import java.util.Arrays;

public class LeetCode5 {
	public static int[] findErrorNums(int[] nums) {
		int[]res=new int[2];
		int index=0;
		for(int a:nums) {
			index++;
			if(a==nums[index]) {
				//nums[index]=++a;
				res[0]=a;
				res[1]=++a;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,6,7,7,9};
		System.out.println(Arrays.toString(findErrorNums(nums)));
	}
}
