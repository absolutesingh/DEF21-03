package searchingAndSorting;

public class BinarySearch {

	static int binarySearch(int arr[], int n)
	{
		int l = 0;
		int r = arr.length - 1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			
			if(arr[mid] == n) return mid;
			if(arr[mid] < n)
			{
				l = mid + 1;
			}
			if(arr[mid] > n)
			{
				r = mid - 1;
			}
		}
		// l>r -> Element not found
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,5,8,12,16,23,38,56,72};
		int n = 16;
		int res = binarySearch(arr, n);
		if(res == -1)
		{
			System.out.println("Element not found in array.");
		}
		else {
			System.out.println("Element "+ n + " found at index " + res + " in the array.");
		}
	}

}
