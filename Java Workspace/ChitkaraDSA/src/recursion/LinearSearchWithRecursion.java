package recursion;

public class LinearSearchWithRecursion {
	
	static boolean searchInArrayUsingRecursion(int arr[], int n, int index)
	{
		if(index >= arr.length) return false; //Base Condition -> Element not found
		if(arr[index] == n) return true;// Element found;
		return searchInArrayUsingRecursion(arr, n, index+1);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,5,8,12,16,23,38,56,72};
		int n = 17;
		System.out.println(searchInArrayUsingRecursion(arr, n, 0));
	}
}
