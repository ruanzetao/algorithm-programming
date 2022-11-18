package javaTester;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = { 2, 1, 2, 1, 3 };
		System.out.println("Single number: " + singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return nums[0];
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				return nums[i];
			}
		}
		return 0;
	}
}
