package javaTester;

import java.util.StringTokenizer;

public class mostWordsFound {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public int mostWordsFound(String[] sentences) {
		int maxVal = 0;
		for (String s : sentences) {
			StringTokenizer st = new StringTokenizer(s, " ");
			maxVal = Math.max(maxVal, st.countTokens());
		}
		return maxVal;
	}
}
