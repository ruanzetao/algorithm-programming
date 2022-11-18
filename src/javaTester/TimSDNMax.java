package javaTester;

public class TimSDNMax {

	public static void main(String[] args) {
		int a[] = { 102, 203, 304, 405, 505 };
		int arrDaoNguoc[] = new int[a.length];
		arrDaoNguoc = DaoNguocMang(a, arrDaoNguoc, a.length);
		for (int element : arrDaoNguoc) {
			System.out.println("So dao nguoc: " + element);
		}
		System.out.println("So max: " + TimMaxInMang(arrDaoNguoc, arrDaoNguoc.length));

	}

	public static int SoDaoNguoc(int n) {
		int res = 0;
		int temp = 0;
		while (n > 0) {
			temp = n % 10;
			res = res * 10 + temp;
			n = n / 10;
		}
		return res;
	}

	public static int TimMaxInMang(int arr[], int n) {
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int[] DaoNguocMang(int arr[], int arrDaoNguoc[], int n) {
		for (int i = 0; i < n; i++) {
			arrDaoNguoc[i] = SoDaoNguoc(arr[i]);
		}
		return arrDaoNguoc;
	}
}
