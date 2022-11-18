package javaTester;

import java.util.ArrayList;

public class SoHoanHao {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");

		String[] arr = new String[languages.size()];

		languages.toArray(arr);

		System.out.print("Các phần tử trong mảng array: ");
		for (String item : arr) {
			System.out.print(item + ", ");
		}

		System.out.println("\n------------------------------------");
		System.out.println("Chương trình này được đăng tại Freetuts.net");
	}

}
