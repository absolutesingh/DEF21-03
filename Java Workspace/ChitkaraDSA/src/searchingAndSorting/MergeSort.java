package searchingAndSorting;

public class MergeSort {

	static void mergeSort(int arr[]) {
		int n = arr.length;
		if(n<2) return; //no need to sort an array with 1 element
		
		int mid = n/2;
		int left[] = new int[mid];
		int right[] = new int[n-mid]; 
		
		for(int i=0;i<mid;i++) //[0,mid-1]
		{
			left[i] = arr[i];
		}
		
		for(int i=mid;i<n;i++) //[mid, n-1]
		{
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);
 	}
	
	static void merge(int arr[], int left[], int right[]) //merge two sorted arrays to form a sorted array
	{
		int nL = left.length;
		int nR = right.length;
		int i = 0; //pointer to left array
		int j = 0; //pointer to right array
		int k = 0; //pointer to main(arr) array
		
		while(i<nL && j<nR)
		{
			if(left[i]<=right[j]) //element in left array is small
			{
				arr[k] = left[i];
				i++;
//				k++; //k++ is common to if else so take it outside the if else
			}
			else {//element in right array is small
				arr[k] = right[j];
				j++;
//				k++;
			}
			k++; //yeh to karna hi hai, chaahe left se uthao, chaahe right se
		}
		
		while(i<nL) //if the fist loop broke when j>nR
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<nR) //if the first loop broke when i>nL
		{
			arr[k] = right[j];
			j++;
			k++;
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
		mergeSort(arr);
		printArray(arr, true); // After Sorting

	}

}
