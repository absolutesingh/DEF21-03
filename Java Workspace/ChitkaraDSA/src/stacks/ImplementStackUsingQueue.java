package stacks;

import java.util.*;

class ImplementStackUsingQueue_PopCostly {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	// Function to push an element into stack using two queues.
	void push(int a) {
		q1.add(a);
	}

	// Function to pop an element from stack using two queues.
	int pop() {
		if (q1.isEmpty())
			return -1;

		while (q1.size() != 1) {
			q2.add(q1.poll()); // remove from q1 and add in q2
		}

		int lastElement = q1.poll();

		// Swap the two Queues
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

		return lastElement;
	}

}

class ImplementStackUsingQueue_PushCostly {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	// Function to push an element into stack using two queues.
	void push(int a) {
		q2.add(a);

		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Function to pop an element from stack using two queues.
	int pop() {
		if (q1.isEmpty())
			return -1;

		return q1.poll();
	}

}

class ImplementStackUsingSingleQueue {
	Queue<Integer> q = new LinkedList<Integer>();

	// Function to push an element into stack using two queues.
	void push(int a) {
		q.add(a);
	}

	// Function to pop an element from stack using two queues.
	int pop() {
		if (q.isEmpty())
			return -1;

		int size = q.size();

		for (int i = 0; i < size - 1; i++) {
			q.add(q.poll());
		}

		return q.poll();
	}

}