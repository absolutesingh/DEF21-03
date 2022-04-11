package searchingAndSorting;

public class SelectionSort {

	static void selectionSort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			
			// index of the min element
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
//			we have found the min element at minIndex
//			now we will swap the elements and bring the smaller element in front
//			swap elements at index i and minIndex
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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
		selectionSort(arr);
		printArray(arr, true); // After Sorting

	}

}
