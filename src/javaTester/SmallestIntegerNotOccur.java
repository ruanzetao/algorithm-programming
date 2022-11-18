package javaTester;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SmallestIntegerNotOccur {

	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 4, 1, 2 };

	}

	public static int solutionUsingSet(int[] A) {

		Set<Integer> set = new TreeSet<>();

		for (int a : A) {
			set.add(a);
		}

		int N = set.size();

		int[] C = new int[N];

		int index = 0;

		for (int a : set) {
			C[index++] = a;
		}

		for (int i = 0; i < N; i++) {

			if (C[i] > 0 && C[i] <= N) {
				C[i] = 0;
			}
		}

		for (int i = 0; i < N; i++) {

			if (C[i] != 0) {
				return (i + 1);
			}
		}

		return (N + 1);
	}

	public int solution(int[] arr) {

		Arrays.sort(arr);

		int smallest = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallest) {
				smallest++;
			}
		}

		return smallest;
	}

}
