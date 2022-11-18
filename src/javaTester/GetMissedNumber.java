package javaTester;

public class GetMissedNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4 };
	}

	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}

}
