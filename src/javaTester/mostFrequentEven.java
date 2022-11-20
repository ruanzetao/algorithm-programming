package javaTester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mostFrequentEven {

	public static void main(String[] args) {
		int a[] = { 29, 47, 21, 41, 13, 37, 25, 7 };

	}

	public int mostFrequentEven1(int[] nums) {
		int n = nums.length;
		int count = 0;
		int min_value = 2;
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (nums[i] == nums[j] && nums[i] % 2 == 0) {
					count++;
				}
				if (count == 2) {
					min_value = nums[i];
					result.add(nums[i]);
				}
			}
		}
		if (result.isEmpty())
			return -1;
		for (Integer element : result) {
			if (element <= min_value) {
				min_value = element;
			}
		}
		return min_value;
	}

	public int mostFrequentEven(int[] nums) {
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (num % 2 == 0 && map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else if (num % 2 == 0)
				map.put(num, 1);
		}

		int maxNum = -1;
		int maxCount = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxNum = entry.getKey();
			} else if (entry.getValue() == maxCount && maxNum > entry.getKey()) {
				maxCount = entry.getValue();
				maxNum = entry.getKey();
			}

		return maxNum;
	}
}
