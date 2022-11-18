package javaTester;

public class FindUniqueInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 2, 7, 15, 8, 1, 5 };
		System.out.println("Unique position: " + findUnique(a));

	}

	public static int findUnique(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				return arr[i];
			}
		}
		return -1;
	}

	static int findSingle(int A[], int ar_size) {

		// Iterate over every element
		for (int i = 0; i < ar_size; i++) {

			// Initialize count to 0
			int count = 0;

			for (int j = 0; j < ar_size; j++) {

				// Count the frequency
				// of the element
				if (A[i] == A[j]) {
					count++;
				}
			}

			// if the frequency of the
			// element is one
			if (count == 1) {
				return A[i];
			}
		}

		// if no element exist at most once
		return -1;
	}

}
