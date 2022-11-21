package javaTester;

public class Test1_NAB {

	public static void main(String[] args) {
		int a[] = { 4, 6, 2, 2, 6, 6, 1 };

	}

	int solution0(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N - 1; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j])
					result = Math.max(result, Math.abs(i - j));
		return result;
	}

	int solution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N - 1; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j])
					result = Math.max(result, Math.abs(i - j));
		return result;
	}

	int solution2(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N / 2 + 1; i++)
			for (int j = N - 1; j > i; j--)
				if (A[i] == A[j]) {
					result = Math.max(result, Math.abs(i - j));
					return result;
				}

		return result;
	}
}
