package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode6 {
	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();
		int i = 0;
		int n = intervals.length;
		while (i < n && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}
		while (i < n && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			i++;
		}

		result.add(newInterval);
		while (i < n) {
			result.add(intervals[i]);
			i++;
		}
		int[][] mergedIntervals = new int[result.size()][2];
		for (int j = 0; j < result.size(); j++) {
			mergedIntervals[j] = result.get(j);
		}

		return mergedIntervals;
	}

	public static void main(String[] args) {
		/**
		 * // case - 1 int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, {
		 * 12, 16 } }; int[] newInterval = { 4, 8 };
		 **/
		/**
		 * // case - 2 int[][] intervals = { { 1, 3 }, { 6, 9 } }; int[] newInterval = {
		 * 2, 5 };
		 **/
		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 4, 8 };
		System.out.println(Arrays.toString(insert(intervals, newInterval)));
	}

}
