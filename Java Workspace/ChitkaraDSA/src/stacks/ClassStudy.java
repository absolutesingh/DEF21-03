package stacks;

import java.util.Stack;

public class ClassStudy {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		System.out.println(s.isEmpty());
		s.push(1);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}

}
