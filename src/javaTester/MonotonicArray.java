package javaTester;

public class MonotonicArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public static boolean isMonotonic(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] <= nums[i + 1])
				count++;
		}
		if (count == n - 1)
			return true;
		count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] >= nums[i + 1])
				count++;
		}
		if (count == n - 1)
			return true;
		return false;
	}
}
