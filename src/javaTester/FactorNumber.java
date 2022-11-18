package javaTester;

public class FactorNumber {

	public static void main(String[] args) {
		int N = 24;
		System.out.println("Output: " + countFactorNumber(N));

	}

	public static int countFactorNumber(int N) {
		int count = 0;
		if (N == 0)
			return 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
		}

		return count;
	}
}
