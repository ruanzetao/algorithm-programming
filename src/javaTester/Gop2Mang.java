package javaTester;

public class Gop2Mang {

	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 5 };
		int[] arrayB = { 4, 6 };
		int[] arrayC = new int[arrayA.length + arrayB.length];
		Gop2Mang(arrayA, arrayA.length, arrayB, arrayB.length, arrayC, arrayA.length + arrayB.length);
		for (int element : arrayC) {
			System.out.println("element: " + element);
		}

	}

	public static void Gop2Mang(int[] a, int na, int[] b, int nb, int[] c, int nc) {
		nc = 0;
		for (int i = 0; i < na; i++) {
			c[nc] = a[i];
			nc++;
		}
		for (int i = 0; i < nb; i++) {
			c[nc] = b[i];
			nc++;
		}
	}

}
