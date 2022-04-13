package searchingAndSorting;

public class QuickSort {

	static void quickSort(int arr[], int start, int end) {
		if(start>=end) return;
		int pIndex = partition(arr, start, end); //pIndex is the index of pivot. Partitioning is the process
		quickSort(arr, start, pIndex - 1);
		quickSort(arr, pIndex + 1, end);
 	}
	
	static int partition(int arr[], int start, int end)
	{
		int pivot = arr[end]; //Picking the last element as the pivot
		int pIndex = start;
		for(int i=start;i<=end-1;i++)
		{
			if(arr[i]<pivot)
			{
				swap(arr,pIndex,i);
				pIndex++;
			}
		}
		swap(arr,pIndex,end); //swap for the last time
		return pIndex;
	}
	
	static void swap(int arr[], int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
		quickSort(arr, 0, arr.length - 1);
		printArray(arr, true); // After Sorting

	}

}
