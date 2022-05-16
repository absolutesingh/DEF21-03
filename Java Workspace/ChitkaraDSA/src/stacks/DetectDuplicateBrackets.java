package stacks;

import java.util.*;

//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate-brackets-official/ojquestion
public class DetectDuplicateBrackets {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')') {
				if (stack.peek() == '(') {
					System.out.println("true");
					return;
				}
				while (stack.peek() != '(') {
					stack.pop();
				}
				stack.pop(); // for the opening bracket
			} else {
				stack.push(c);
			}
		}

		System.out.println("false");
	}

}
