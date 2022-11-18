package javaTester;

public class ReverseString {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	class Solution {
		public int solution(String S) {
			int n = S.length();
			if (n % 2 == 0) {
				return -1;
			}
			int r = n / 2;
			for (int i = 0; i < r; i++) {
				if (S.charAt(i) != S.charAt(n - i - 1)) {
					return -1;
				}
			}
			return r;
		}
	}
}
