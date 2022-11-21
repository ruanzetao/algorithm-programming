package javaTester;

public class Test2_NAB {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	int solution0(int N) {
		int largest = N;
		int shift = 0;
		int temp = N;
		for (int i = 1; i < 30; ++i) {
			int index = (temp & 1);
			temp = ((temp >> 1) | (index << 29));
			if (temp > largest) {
				largest = temp;
				shift = i;
			}
		}
		return shift;
	}
}
