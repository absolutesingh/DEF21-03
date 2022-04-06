package recursion;

public class BinarySearchUsingRecursion {

	static int binarySearchUsingRecursion(int arr[], int n, int left, int right)
	{
		if(left>right) return -1; //Element not found in array
		int mid = (left + right)/2;
		if(arr[mid] == n) return mid;
		if(arr[mid] < n)
		{
			return binarySearchUsingRecursion(arr, n, mid + 1, right);
		}
		else //(arr[mid] > n)
		{
			return binarySearchUsingRecursion(arr, n, left, mid-1);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,5,8,12,16,23,38,56,72};
		int n = 2;
		int res = binarySearchUsingRecursion(arr, n, 0, arr.length - 1);
		if(res == -1)
		{
			System.out.println("Element not found in array.");
		}
		else {
			System.out.println("Element "+ n + " found at index " + res + " in the array.");
		}
	}

}
