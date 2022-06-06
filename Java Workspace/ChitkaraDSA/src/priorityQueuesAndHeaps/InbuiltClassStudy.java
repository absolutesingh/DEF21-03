package priorityQueuesAndHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class InbuiltClassStudy {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//		Collections.reverseOrder() -> to get Max-Priority Queue
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
		// By default it gives us a Min-Priority Queue
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.size());
	}

}
