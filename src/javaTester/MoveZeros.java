package javaTester;

public class MoveZeros {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3, 12 };
		moveZeroes(a);
	}

	public static void moveZeroes(int[] nums) {
		int length = nums.length;
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
