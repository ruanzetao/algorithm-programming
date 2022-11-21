package javaTester;

import java.util.Arrays;

public class Test3_NAB {

	public static void main(String[] args) {
		int a[] = { 0, 44, 32, 30, 42, 18, 34, 16, 35 };
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Arrays.sort(A);
		int n = A.length;
		int hole1 = A[0];
		int hole2 = A[0];
		int current = A[0];
		int max = 99999;
		if (n == 1 || n == 2) {
			return 1;

		}
		if (n == 3) {
			max = Math.min(A[2] - A[1], A[1] - A[0]);
			return max;
		}

		for (int i = 0, j = 1; j < n - 2; j++) {
			hole1 = A[j] - A[i];
			hole2 = A[n - 1] - A[j + 1];
			current = Math.max(hole1, hole2);
			if (current < max) {
				max = current;
			}
		}
		return max;
	}
}
