package searchingAndSorting;

public class InsertionSort {

	static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int current = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j]; // arr[j] vali value ko arr[j+1] pe rakhdo
				j--;
			}
			arr[j+1] = current;
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
		insertionSort(arr);
		printArray(arr, true); // After Sorting

	}

}
