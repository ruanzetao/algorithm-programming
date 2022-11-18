package javaTester;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public int missingNumber(int[] nums) {
		int ex = nums.length * (nums.length + 1) / 2;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		return ex - sum;

	}
}
