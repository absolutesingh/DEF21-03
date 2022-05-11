package stacks;

import java.util.Stack;

public class ExpressionConversion {
	
	static int Precedence(char c)
	{
		if(c == '+' || c == '-') return 1;
		if(c == '*' || c == '/') return 2;
		return -1;
	}
	
	static String infixToPostfix(String infix)
	{
		String result = "";
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<infix.length();i++)
		{
			char c = infix.charAt(i);
			
			if(Character.isDigit(c))//operand
				result = result + c;
			else {//if operator
				while(!stack.isEmpty() && Precedence(stack.peek())>=Precedence(c))
				{
					result = result + stack.pop();
				}
				stack.push(c);
			}
				
		}
		
		while(!stack.isEmpty())
		{
			result = result + stack.pop();
		}
		
		return result;
	}

	public static void main(String[] args) {
		String infix = "3+4*5";
		String infix2 = "3*4+5";
		String infix3 = "3*4/5";
		String infix4 = "3*4+5*6";
		
		System.out.println(infixToPostfix(infix));
		System.out.println(infixToPostfix(infix2));
		System.out.println(infixToPostfix(infix3));
		System.out.println(infixToPostfix(infix4));
	}

}
