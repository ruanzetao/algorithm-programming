package javaTester;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDisappear {

	public static void main(String[] args) {
		int a[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		/*
		 * Input: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
		 */

	}

	public List<Integer> findDisappearedNumbers1(int[] nums) {
		// ArrayList to store duplicate values
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int idx = Math.abs(nums[i]) - 1;
			if (nums[idx] > 0)
				nums[idx] *= -1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ans.add(i + 1);
			}
		}
		return ans;
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		Set<Integer> nos = new TreeSet<>();
		int max = Integer.MIN_VALUE;
		for (int element : nums) {
			nos.add(element);
			max = Math.max(max, element);
		}

		max = Math.max(max, nums.length);

		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= max; i++) {
			if (!nos.contains(i)) {
				result.add(i);
			}
		}

		return result;
	}
}
