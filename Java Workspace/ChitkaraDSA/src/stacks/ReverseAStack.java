package stacks;

import java.util.Stack;

public class ReverseAStack {

	static Stack<Integer> st = new Stack<>();

	static void insertAtBottom(int data) {
		if(st.isEmpty()) //base condition
		{
			st.push(data);
			return;
		}
		int temp = st.pop();
		insertAtBottom(data);
		st.push(temp);
	}

	static void reverse() {
		if (st.size() <= 1) //base condition
			return;

		int temp = st.pop();

		reverse(); // This will return the reversed stack that contains n-1 elements

		insertAtBottom(temp);
	}

	public static void main(String[] args) {
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		System.out.println("Stack before reversing:");
		System.out.println(st);
		
		reverse();
		
		System.out.println("Stack after reversing:");
		System.out.println(st);
	}

}
