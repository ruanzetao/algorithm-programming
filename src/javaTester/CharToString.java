package javaTester;

public class CharToString {

	public static void main(String[] args) {
		char ch = 'a';
		String str = Character.toString(ch);
		System.out.println("Chuỗi là: " + str);

		// Method 2: Using valueOf() method
		String str2 = String.valueOf(ch);
		System.out.println("Chuỗi là: " + str2);
	}

}
