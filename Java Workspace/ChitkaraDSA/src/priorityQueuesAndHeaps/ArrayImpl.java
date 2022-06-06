package priorityQueuesAndHeaps;

class PQUsingArray {
	final int size = 10;
	int arr[] = new int[size];
	int nItems = 0; // Number of items in the PQ at any particular time.

	void add(int data) {
		if(this.isEmpty())
		{
			arr[0] = data;
			nItems++;
			return;
		}
		
		int i;
		for(i=nItems - 1; i>=0;i--)
		{
			if(data<arr[i])
			{
				arr[i+1] = arr[i];
			}
			else
			{
				//we have found the smaller element in array
				break;
			}
		}
		arr[i+1] = data; //If we write here -> we'll be able to insert anything at index 0 as well.
		nItems++;//We have to increase this as we have stored a new element.
	}

	int poll() {
//		int temp = arr[nItems - 1];
//		nItems = nItems - 1;
//		return temp;
		
		return arr[--nItems];
	}

	int peek() {
		if(this.isEmpty())
			return -1;
		return arr[nItems - 1];
	}

	boolean isEmpty() {
		return nItems == 0;
	}

	int size() {
		return nItems;
	}
}

public class ArrayImpl {

	public static void main(String[] args) {
		PQUsingArray pq = new PQUsingArray();
		System.out.println(pq.peek());
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		pq.add(3);
		pq.add(4);
		pq.add(1);
		pq.add(9);
		pq.add(5);
		pq.add(7);
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.size());
	}

}
