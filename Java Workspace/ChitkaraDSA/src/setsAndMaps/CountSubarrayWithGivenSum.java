package setsAndMaps;

import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum2804/1/
public class CountSubarrayWithGivenSum {

	public static int subArraySum(int[] arr, int n, int sum) {
		int count = 0;
		int currentSum = 0;

		HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, count>

		for (int i = 0; i < n; i++) {
			currentSum = currentSum + arr[i];

			if (currentSum == sum) {
				// Array from 0 to i has the required sum.
				count++;
			}
			if (map.containsKey(currentSum - sum)) {
				// Array from j+1 to i has the required sum.
				count += map.get(currentSum - sum);
			}

			map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
		}

		return count;
	}

}
