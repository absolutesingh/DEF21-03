package priorityQueuesAndHeaps;

public class HeapSort{

	int poll(int arr[], int size) {
		int elementToReturn = arr[0];
		
		int temp = arr[0];
		arr[0] = arr[size - 1];// Pick the last element and keep in front.
		arr[size - 1] = temp;//Swapping here so that the element with most priority goes to the end. Required for Heap Sort
		
		size--;
		heapifyDown(arr, 0, size); // heapify down from root till size(elements left now)
		return elementToReturn;
	}
	
	void heapifyDown(int arr[], int start, int size) {
		int index = start;
		
		while (2*index + 1 < size) {
//			Left child will be present for sure
//			So let's consider it to be the larger one for now
			int largerChildIndex = 2*index + 1;

//			If right child exists and is greater -> update the value of largerChildIndex
			if (2*index + 2 < size && arr[2*index + 2] > arr[2*index + 1]) {
				largerChildIndex = 2*index + 2;
			}

//			At this point -> the largerChildIndex contains the index of the child bigger among left and right child

			if (arr[index] > arr[largerChildIndex]) {
				break; // or return - we don't have to do anything now - it is heapified
			} else {
				swap(arr, index, largerChildIndex);
				index = largerChildIndex; // Now our element is at the place of its larger child
			}
		}
	}
	
	void swap(int arr[], int index1, int index2) // Using indexes swap the values in the array
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	void buildHeap(int arr[], int n) {
		int index = (n - 2) / 2; //the first node from end which isn't leaf [parent of last node]

		for (int i = index; i >= 0; i--) {
			heapifyDown(arr, i, n); //start from i'th index till n'th index
		}
		System.out.print("After Heapify: ");
		print(arr);
	}

	void heapSort(int arr[]) {
		int n = arr.length;
		buildHeap(arr, n); //Build a heap from this array;
		
		for(int i=0; i<n-1;i++)
		{
			poll(arr, n-i);
		}
	}

	void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 9, 7, 6, 2 };
		HeapSort sort = new HeapSort();
		sort.heapSort(arr);
		sort.print(arr);
	}

}
