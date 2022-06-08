package priorityQueuesAndHeaps;

class MyHeap {
	// Array implementation of a complete binary tree
	final int capacity = 10; // Size of the array
	int arr[] = new int[capacity];
	int size = 0; // Number of items in the Heap at any particular time.

//	-------------------SOME UTILITY FUNCTIONS-------------------

//	FUNCTIONS TO GET INDEXES
	int getParentIndex(int i) {
		return (i - 1) / 2;
	}

	int getLeftChildIndex(int i) {
		return 2 * i + 1;
	}

	int getRightChildIndex(int i) {
		return 2 * i + 2;
	}

//	FUNCTIONS TO CHECK IF THE PARENT/CHILDREN EXIST
	boolean hasParent(int i) {
		return getParentIndex(i) >= 0;
	}

	boolean hasLeftChild(int i) {
		return getLeftChildIndex(i) < size;
	}

	boolean hasRightChild(int i) {
		return getRightChildIndex(i) < size;
	}

//	FUNCTIONS TO GET THE VALUE OF THE PARENT/CHILDREN
	int getParentValue(int i) {
		return arr[getParentIndex(i)];
	}

	int getLeftChildValue(int i) {
		return arr[getLeftChildIndex(i)];
	}

	int getRightChildValue(int i) {
		return arr[getRightChildIndex(i)];
	}

//	------------------------------------------------------------
	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	int peek() {
		if (this.isEmpty()) {
			System.out.println("Nothing to peek, Heap is empty!");
			return -1;
		}
		return arr[0];
	}

	// Insertion in Heaps
	void add(int data) {
		if (size == 10) {
			System.out.println("Cannot add data, Heap is full.");
			return;
		}
		arr[size++] = data; // Place the new element at index size and then increase size by one.
//		size++;
		heapifyUp(); // Create the heap in a bottom up manner.
	}

	void heapifyUp() {
		int currIndex = size - 1; // Index of the newly added element
		while (hasParent(currIndex) && getParentValue(currIndex) < arr[currIndex]) // Order of the statements is
																					// important
		{
			swap(getParentIndex(currIndex), currIndex); // Swap parent and current element through their indexes
			currIndex = getParentIndex(currIndex);
		}
	}

	void swap(int index1, int index2) // Using indexes swap the values in the array
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	// Deletion from Heap
	int poll() {
		if (this.isEmpty()) {
			System.out.println("Nothing to poll, Heap is empty!");
			return -1;
		}

		int elementToReturn = arr[0];
		arr[0] = arr[size - 1];// Pick the last element and keep in front.
		size--;
		heapifyDown(); // heapify down from root
		return elementToReturn;
	}

	void heapifyDown() {
		int index = 0;

		while (hasLeftChild(index)) {
//			Left child will be present for sure
//			So let's consider it to be the larger one for now
			int largerChildIndex = getLeftChildIndex(index);

//			If right child exists and is greater -> update the value of largerChildIndex
			if (hasRightChild(index) && getRightChildValue(index) > getLeftChildValue(index)) {
				largerChildIndex = getRightChildIndex(index);
			}

//			At this point -> the largerChildIndex contains the index of the child bigger among left and right child

			if (arr[index] > arr[largerChildIndex]) {
				break; // or return - we don't have to do anything now - it is heapified
			} else {
				swap(index, largerChildIndex);
				index = largerChildIndex; // Now our element is at the place of its larger child
			}
		}
	}

}

public class HeapImpl {

	public static void main(String[] args) {
		MyHeap heap = new MyHeap();
		System.out.println(heap.isEmpty());
		System.out.println(heap.size());
		heap.add(7);
		System.out.println(heap.isEmpty());
		System.out.println(heap.size());
		System.out.println(heap.peek());
		heap.add(8);
		System.out.println(heap.peek());
		heap.add(2);
		System.out.println(heap.peek());
		heap.add(10);
		System.out.println(heap.peek());
		System.out.println(heap.size());
		System.out.println(heap.poll());
		System.out.println(heap.size());
		System.out.println(heap.poll());
		System.out.println(heap.size());
		System.out.println(heap.poll());
		System.out.println(heap.size());
		System.out.println(heap.poll());
		System.out.println(heap.size());
		System.out.println(heap.poll());
		System.out.println(heap.size());
	}

}
