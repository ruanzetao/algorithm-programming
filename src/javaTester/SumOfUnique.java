package javaTester;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SumOfUnique {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public int sumOfUnique(int[] nums) {
		Map<Integer, Boolean> uniqueMap = new HashMap<>();
		for (int n : nums) {
			if (uniqueMap.containsKey(n))
				uniqueMap.put(n, false);
			else
				uniqueMap.put(n, true);
		}
		int result = 0;
		for (int key : uniqueMap.keySet()) {
			if (uniqueMap.get(key))
				result += key;
		}
		return result;
	}

	public int sumOfUnique1(int[] nums) {
		Hashtable<Integer, Integer> ht = new Hashtable<>();

		for (int i = 0; i < nums.length; i++) {

			if (ht.containsKey(nums[i])) {
				ht.put(nums[i], ht.get(nums[i]) + 1);
			} else {
				ht.put(nums[i], 1);
			}
		}

		int sum = 0;
		for (Map.Entry<Integer, Integer> m : ht.entrySet()) {
			if (m.getValue() == 1) {
				sum = sum + m.getKey();
			}
		}

		return sum;
	}
}
