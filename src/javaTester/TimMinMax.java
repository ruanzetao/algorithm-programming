package javaTester;

public class TimMinMax {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };
		int minValue = a[0];
		int maxValue = a[0];
		MinAndMAx(a, minValue, maxValue);

	}

	public static void MinAndMAx(int arr[], int minValue, int maxValue) {
		for (int number : arr) {
			if (number > maxValue) {
				maxValue = number;
			} else if (number < minValue) {
				minValue = number;
			}
		}
		System.out.println("Min value: " + minValue);
		System.out.println("Max value: " + maxValue);
	}

}
