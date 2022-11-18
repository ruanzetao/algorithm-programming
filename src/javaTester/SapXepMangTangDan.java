package javaTester;

public class SapXepMangTangDan {

	public static void main(String[] args) {
		int a[] = { 1, 11, 2, 5, 7, 15, 8 };
		SapXepTang(a, a.length);
//		for (int element : a) {
//			System.out.println("element: " + element);
//		}
	}

	public static void SapXepTang(int a[], int n) {
		int i, j;
		int temp;
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
//					HoanVi(a[i], a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int element : a) {
			System.out.println("element: " + element);
		}
	}

	public static void HoanVi(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
}
