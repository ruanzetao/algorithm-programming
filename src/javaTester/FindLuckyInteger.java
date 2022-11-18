package javaTester;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 3 };

	}

	public static int findLucky1(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : arr) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		int max = -1;

		for (int n : map.keySet()) {
			if (n == map.get(n)) {
				max = Math.max(max, n);
			}
		}
		return max;
	}

	public int findLucky(int[] arr) {
		int[] freq = new int[501];
		for (int n : arr)
			freq[n]++;

		int max = -1;

		for (int i = 1; i < 501; i++) {
			if (freq[i] == i) {
				max = Math.max(max, i);
			}
		}

		return max;
	}
}
