package priorityQueuesAndHeaps;

class MyHeap{
	//Array implementation of a complete binary tree
	final int capacity = 10; //Size of the array
	int arr[] = new int[capacity];
	int size = 0; // Number of items in the Heap at any particular time.
	
//	-------------------SOME UTILITY FUNCTIONS-------------------
	
//	FUNCTIONS TO GET INDEXES
	int getParentIndex(int i)
	{
		return (i-1)/2;
	}
	
	int getLeftChildIndex(int i)
	{
		return 2*i + 1;
	}
	
	int getRightChildIndex(int i)
	{
		return 2*i + 2;
	}
	
//	FUNCTIONS TO CHECK IF THE PARENT/CHILDREN EXIST
	boolean hasParent(int i)
	{
		return getParentIndex(i) >= 0;
	}
	
	boolean hasLeftChild(int i)
	{
		return getLeftChildIndex(i) < size;
	}
	
	boolean hasRightChild(int i)
	{
		return getRightChildIndex(i) < size;
	}
	
//	FUNCTIONS TO GET THE VALUE OF THE PARENT/CHILDREN
	int getParentValue(int i)
	{
		return arr[getParentIndex(i)];
	}
	
	int getLeftChildValue(int i)
	{
		return arr[getLeftChildIndex(i)];
	}
	
	int getRightChildValue(int i)
	{
		return arr[getRightChildIndex(i)];
	}
	
//	------------------------------------------------------------
	boolean isEmpty()
	{
		return size == 0;
	}
	
	int size()
	{
		return size;
	}
	
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Nothing to peek, Heap is empty!");
			return -1;
		}
		return arr[0];
	}
	
	
	//Insertion in Heaps
	void add(int data)
	{
		if(size == 10)
		{
			System.out.println("Cannot add data, Heap is full.");
			return;
		}
		arr[size++] = data; //Place the new element at index size and then increase size by one.
//		size++;
		heapifyUp(); //Create the heap in a bottom up manner.
	}
	
	void heapifyUp()
	{
		int currIndex = size - 1; //Index of the newly added element
		while(hasParent(currIndex) && getParentValue(currIndex) < arr[currIndex]) //Order of the statements is important
		{
			swap(getParentIndex(currIndex), currIndex); //Swap parent and current element through their indexes
			currIndex = getParentIndex(currIndex);
		}
	}
	
	void swap(int index1, int index2) //Using indexes swap the values in the array
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
	}

}
