package stacks;

import java.util.Stack;

public class SortAStack {

	static Stack<Integer> st = new Stack<>();

	static void sortedInsert(int data) {
		if (st.isEmpty() || data > st.peek()) // base condition
		{
			st.push(data);
			return;
		}
		int temp = st.pop();
		sortedInsert(data);
		st.push(temp);
	}

	static void sortStack() {
		if (st.size() <= 1) // base condition
			return;

		int temp = st.pop();

		sortStack(); // This will return the reversed stack that contains n-1 elements

		sortedInsert(temp);
	}

	public static void main(String[] args) {
		st.push(1);
		st.push(0);
		st.push(5);
		st.push(2);

		System.out.println("Stack before sorting:");
		System.out.println(st);

		sortStack();

		System.out.println("Stack after sorting:");
		System.out.println(st);
	}

}
