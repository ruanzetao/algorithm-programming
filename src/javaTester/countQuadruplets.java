package javaTester;

public class countQuadruplets {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };
		/*
		 * Input: nums = [1,1,1,3,5] Output: 4 Explanation: The 4 quadruplets that satisfy the requirement are: - (0, 1, 2, 3):
		 * 1 + 1 + 1 == 3 - (0, 1, 3, 4): 1 + 1 + 3 == 5 - (0, 2, 3, 4): 1 + 1 + 3 == 5 - (1, 2, 3, 4): 1 + 1 + 3 == 5
		 */
	}

	public int countQuadruplets(int[] nums) {
		int n = nums.length;
		int count = 0;

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
					for (int l = k + 1; l < n; l++)
						if (nums[i] + nums[j] + nums[k] == nums[l])
							count++;

		return count;
	}
}
