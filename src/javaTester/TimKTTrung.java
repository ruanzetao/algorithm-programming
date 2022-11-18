package javaTester;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimKTTrung {

	public static void main(String[] args) {
		System.out.println("String: Chao Cac Ban !!!");
		System.out.println("-------------------------");
		timKiem("Chao Cac Ban !!!");

		System.out.println("\nString: Bai Tap Java Ve String");
		System.out.println("-------------------------");
		timKiem("Bai Tap Java Ve String");

		System.out.println("\nString: #@$@!#$%!!%@");
		System.out.println("-------------------------");
		timKiem("#@$@!#$%!!%@");

	}

	public static void timKiem(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// Chuyển đổi chuỗi thành mảng char
		char[] chars = str.toCharArray();
		for (char element : chars) {
			System.out.println("Chars: " + element);
		}
		System.out.println("----------------");
		/*
		 * char được chèn dưới dạng khóa và được tính là giá trị. Nếu map đã chứa char rồi thì hãy tăng giá trị lên 1.
		 */
		for (Character ch : chars) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		// lấy key ra
		Set<Character> keys = map.keySet();
		/*
		 * Hiển thị số lượng ký tự nếu nó là lớn hơn 1. Tất cả các ký tự trùng lặp sẽ có giá trị lớn hơn 1.
		 */
		for (Character ch : keys) {
			if (map.get(ch) > 1) {
				System.out.println("Char " + ch + " " + map.get(ch));
			}
		}
	}
}
