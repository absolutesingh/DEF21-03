package setsAndMaps;
//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/
import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEachWindow {

	ArrayList<Integer> countDistinct(int A[], int n, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			// if(map.contains(A[i]))
			// {
			// map.put(A[i], map.get(A[i]) + 1);
			// }
			// else{
			// map.put(A[i], 1);
			// }

			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		result.add(map.size()); // added the unique elements in window1 to result

		for (int i = k; i < n; i++) {
			// Add i'th element
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);

			// Remove i-k'th element
			if (map.get(A[i - k]) == 1) // if one occurence only then remove
			{
				map.remove(A[i - k]);
			} else {
				map.put(A[i - k], map.get(A[i - k]) - 1); // if more than one occurrence then reduce count by 1
			}

			result.add(map.size());
		}

		return result;
	}

}
