package javaTester;

public class ArrayFunctions {

	public static void main(String[] args) {
		int size = 20; // Suc chua cua mang
		int[] arr = new int[size];
		arr[0] = 1;
		arr[1] = -1;
		arr[2] = 6;
		arr[3] = 5;
		arr[4] = 3;
		int n = 5; // So luong phan tu trong mang hien tai
		int x = 10;
		System.out.print("Truoc khi them: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		// Inserting key
		n = insert(arr, size, n, x);
		System.out.print("\nSau khi them: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	public static int searchElement(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static int insert(int arr[], int size, int n, int x) {
		// Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
		if (n >= size) {
			return n;
		}
		// them X vao vi tri cuoi cua mang
		arr[n] = x;
		return n + 1; // tang so luong phan tu cua mang them 1
	}

	public static int delete(int[] arr, int n, int key) {
		int pos = searchElement(arr, key);
		if (pos == -1) {
			System.out.println("Khong tim thay phan tu can xoa");
		}
		// Xoa phan tu
		for (int i = pos; i < n; i++) {
			arr[i] = arr[i + 1];
		}
		return n - 1;
	}
}
