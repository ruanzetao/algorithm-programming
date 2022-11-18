package javaTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByFrequent {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 7, 15, 8 };

	}

	public int[] frequencySort(int[] nums) {

		// store frequency in hashmap
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();

		for (int n : nums) {
			if (hm.containsKey(n))
				hm.put(n, hm.get(n) + 1);
			else
				hm.put(n, 1);
		}

		// create array list of hashmap's entrySet so that we can perform Collections.sort on it.
		ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());

		// compare method logic according to problem
		Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue())
					return o2.getKey() - o1.getKey();
				else
					return o1.getValue() - o2.getValue();

			}
		});

		System.out.println(al.toString());

		int sol[] = new int[nums.length];
		// store result in solution array
		int i = 0;
		while (i < nums.length) {
			for (Map.Entry entry : al) {
				int key = (Integer) entry.getKey();
				int value = (Integer) entry.getValue();

				for (int j = 0; j < value; j++) {
					sol[i] = key;
					i++;
				}

			}
		}
		return sol;
	}
}
