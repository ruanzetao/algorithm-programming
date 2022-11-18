package javaTester;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		int arrA[] = { 1, 2, 5, 7, 15, 8, 5, 2 };
		Set<Integer> uniqueSet = new HashSet<>();
		for (int element : uniqueSet) {
			System.out.println("element: " + element);
			uniqueSet.add(element);
		}
	}
}
