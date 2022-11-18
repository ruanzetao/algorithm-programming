package javaTester;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TimElementTrung {

	public static void main(String[] args) {
		int arrA[] = { 1, 2, 5, 7, 15, 8, 2 };
		if (bruteforce(arrA)) {
			System.out.println("Co phan tu trung lap");
		} else {
			System.out.println("KCo phan tu trung lap");
		}
	}

	public static boolean bruteforce(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if ((input[i] == input[j]) && i != j) {
					// input[i].equals(input[j])
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkDuplicateUsingSet(String[] input) {
		List inputList = Arrays.asList(input);
		Set inputSet = new HashSet(inputList);
		if (inputSet.size() < inputList.size()) {
			return true;
		}
		return false;
	}

	public static boolean checkDuplicateUsingAdd(String[] input) {
		Set tempSet = new HashSet();
		for (String str : input) {
			if (!tempSet.add(str)) {
				return true;
			}
		}
		return false;
	}
}
