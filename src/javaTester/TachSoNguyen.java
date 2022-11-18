package javaTester;

public class TachSoNguyen {

	public static void main(String[] args) {
		int arrayResult[] = TachSo(1234578);
		for (int element : arrayResult) {
			System.out.println("Array: " + element);
		}
	}

	public static int[] TachSo(int N) {
		int temp = N;
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		int arrayA[] = new int[count];

		int digit = 0;
		int index = 0;
		while (N > 0) {
			digit = N % 10;
			arrayA[index] = digit;
			index++;
			N = N / 10;
		}
		return arrayA;
	}

}
