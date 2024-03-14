package javapractice;

public class LeetCode2 {
	public static int numSubarraysWithSum(int[] nums, int goal) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j <nums.length; j++) {
				int sum=0;
				for (int k = i; k <=j; k++) {
					sum+=nums[k];
				}
				if(sum==goal) {
					count++;
				}
				System.out.println();
			}
			System.out.println();
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6 };
		int goal = 6;
		System.out.println(numSubarraysWithSum(arr, goal));
		;
	}
}
