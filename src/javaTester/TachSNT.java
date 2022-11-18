package javaTester;

public class TachSNT {

	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4, 5 };
		int na = arrayA.length;
		System.out.println("na: " + na);
		int[] arrayB = new int[na];
		int nb = 0;
		int[] arrayC = new int[na];
		int nc = 0;
		TachSNT(arrayA, na, arrayB, nb, arrayC, nc);
		System.out.println("Array B: ");
		for (int element : arrayB) {
			System.out.println(element);
		}
		System.out.println("Array C: ");
		for (int element : arrayC) {
			System.out.println(element);
		}

	}

	public static void TachSNT(int[] a, int na, int[] b, int nb, int[] c, int nc) {
		nb = 0;
		nc = 0;
		for (int i = 0; i < na; i++) {
			if (LaSNT(a[i]) == 1) {
				b[nb] = a[i];
				nb++;
			} else {
				c[nc] = a[i];
				nc++;
			}
		}
	}

	public static int LaSNT(int n) {
		if (n <= 1) {
			return 0;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
