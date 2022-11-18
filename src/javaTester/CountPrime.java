package javaTester;

public class CountPrime {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public static int countPrimes(int n) {
		int dem = 0; // Khởi tạo biến dem = 0
		for (int i = 1; i < n; i++) {
			if (checkNT(i) == true)
				dem++; // Nếu i là số nguyên tố thì tăng biến đếm len 1
		}
		return dem;
	}

	public static boolean checkNT(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
