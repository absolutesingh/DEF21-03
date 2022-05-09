package stacks;

import java.util.Stack;

public class EvaluatePostfix {
	static int process(char operator, int left, int right) {
		if (operator == '*')
			return left * right;
		if (operator == '/')
			return left / right;
		if (operator == '+')
			return left + right;
		return left - right;
	}

	// Function to evaluate a postfix expression.
	public static int evaluatePostFix(String s) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// if Operand
			if (Character.isDigit(c)) {
				stack.push(c - '0');
			} else {// operator
				int right = stack.pop();
				int left = stack.pop();
				int res = process(c, left, right);
				stack.push(res);
			}
		}

		return stack.pop();
	}
}
