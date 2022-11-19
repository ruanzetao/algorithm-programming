package javaTester;

public class CompoundAString {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public boolean isPrefixString(String s, String[] words) {

		StringBuilder t = new StringBuilder();

		for (String s1 : words) {
			t.append(s1);
			if (s.equals(t.toString()))
				return true;
		}

		return false;
	}
}
