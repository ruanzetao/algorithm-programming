package javaTester;

public class TimMax {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };
		int na = a.length;
		int max = TimMax(a, na);
		System.out.println("max: " + max);

	}

	public static int TimMax(int[] a, int n) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
