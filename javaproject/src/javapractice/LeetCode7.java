package javapractice;

import java.util.Arrays;

public class LeetCode7 {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[]res=new int[m+n];
	        int index=0;
	        for(int i=0;i<m;i++){
	            res[index]=nums1[i];
	            index++;
	        }
	        for(int i=0;i<n;i++){
	            res[index]=nums2[i];
	            index++;
	        } 
	        Arrays.sort(res);
	        System.out.println(Arrays.toString(res));
	    }
	public static void main(String[] args) {
		int[]nums1 = {1,2,3,0,0,0}, 
				nums2 = {2,5,6};
		int n = 3;
		int m = 3;
		merge(nums1,m,nums2,n);
	}

}
