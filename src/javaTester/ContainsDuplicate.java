package javaTester;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println("Contains duplicated: " + containsDuplicate(a));

	}

	public static boolean containsDuplicate1(int[] nums) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count > 1)
				return true;
		}
		return false;
	}

	public static boolean containsDuplicate2(int[] nums) {
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		if (nums.length == set.size())
			return false;
		else
			return true;
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> numset = new HashSet<>();
		for (int i : nums) {
			if (!numset.add(i))
				return true;
		}
		return false;
	}
}
