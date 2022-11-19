package javaTester;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public static int thirdMax(int[] nums) {
		int arr_size = nums.length;
		int first = nums[0];
		for (int i = 1; i < arr_size; i++)
			if (nums[i] > first)
				first = nums[i];

		if (arr_size < 3) {
			return first;
		}

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (nums[i] > second && nums[i] < first)
				second = nums[i];

		int count = 0;
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (nums[i] >= third && nums[i] < second) {
				third = nums[i];
				count++;
			}
		if (count > 0)
			return third;
		else
			return first;

	}
}
