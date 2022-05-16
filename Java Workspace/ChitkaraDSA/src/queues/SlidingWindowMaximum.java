package queues;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
public class SlidingWindowMaximum {
	// Function to find maximum of each subarray of size k.
	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
		ArrayList<Integer> result = new ArrayList<>();

		Deque<Integer> dq = new LinkedList<>();

		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i); // add to rear of dq
		}

		for (int i = k; i < n; i++) {
			result.add(arr[dq.peek()]);

			while (!dq.isEmpty() && dq.peek() <= i - k) {
				dq.removeFirst();
			}

			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
				dq.removeLast();
			}

			dq.addLast(i);
		}
		result.add(arr[dq.peek()]); // explicitly for last window

		return result;
	}
}