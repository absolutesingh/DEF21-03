package searchingAndSorting;

public class BubbleSort {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n-1 ; i++) //[0,n-2] -> Loop of passes
		{
			boolean didSwap = false; //flag to check if swapping happened in this pass
			
			for( int j = 0; j < n - i - 1 ; j++) //[0,n-i-2] -> Loop of check and swapping
			{
				if(arr[j] > arr[j+1])
				{
					didSwap = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			if(!didSwap) //[if (didSwap == false)] -> Swapping didn't happen -> Array is Sorted
			{
				break; //we can use return as well here;
				//breaking the outer loop itself
			}
		}
	}

	static void printArray(int arr[], boolean isSorted) {
		if (isSorted) {
			System.out.println("****Sorted Array****");
		} else {
			System.out.println("****Non-Sorted Array****");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 10, 11, 4, 1 };

		printArray(arr, false); // Before Sorting
		bubbleSort(arr);
		printArray(arr, true); // After Sorting

	}

}
