package searchingAndSorting;

public class LinearSearch {

	static boolean searchInArray(int arr[], int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == n) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,5,8,12,16,23,38,56,72};
		int n = 17;
		System.out.println(searchInArray(arr, n));
	}

}
