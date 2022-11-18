package javaTester;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(15);

	}

	public static List<String> fizzBuzz(int n) {
		List<String> outputList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.println("index: " + i);
			if (i % 15 == 0) {
				outputList.add("FizzBuzz");
			} else if (i % 5 == 0) {
				outputList.add("Buzz");
			} else if (i % 3 == 0) {
				outputList.add("Fizz");
			} else {
				outputList.add(String.valueOf(i));
			}
		}

		return outputList;
	}

}
