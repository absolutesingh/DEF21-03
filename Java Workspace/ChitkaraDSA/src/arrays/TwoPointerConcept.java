package arrays;

public class TwoPointerConcept {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 35, 50, 75, 80 };
		int sum = 105;

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int mySum = arr[l] + arr[r];
			if (sum == mySum) {
				System.out.println("Element at index: " + l + " and index: " + r + " add to make " + sum);
				return;
			} 
			
			else if (mySum < sum) {
				l++;
			} 
			
			else {
				r--;
			}
		}
		System.out.println("No elements in the array sum upto: " + sum);
	}

}
