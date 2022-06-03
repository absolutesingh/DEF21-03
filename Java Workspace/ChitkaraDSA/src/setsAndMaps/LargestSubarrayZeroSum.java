package setsAndMaps;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/#
public class LargestSubarrayZeroSum {
	int maxLen(int arr[], int n) {
		int currentSum = 0;
		int maxLen = 0;

		HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, firstIndex>

		for (int i = 0; i < n; i++) {
			currentSum = currentSum + arr[i];

			if (arr[i] == 0 && maxLen == 0) {
				maxLen = 1;
			}

			if (currentSum == 0) // Array from 0 to i index has sum 0
			{
				maxLen = i + 1;
			}

			Integer prevIndex = map.get(currentSum); // have we ever encountered currentSum first(at index j)

			if (prevIndex == null) // not seen
			{
				map.put(currentSum, i);
			} else { // We have found an array with zero sum between indexes -> [prevIndex, i]
				maxLen = Math.max(maxLen, i - prevIndex);
			}
		}

		return maxLen;
	}
}
