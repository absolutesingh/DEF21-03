package stacks;

class MyStack
{
	int size = 10;
	int arr[] = new int[size];
	int top = -1;
	
	boolean isEmpty()
	{
		return top == -1;
	}
	
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty Stack! Nothing at top.");
			return -1; //Error Code
		}
		return arr[top];
	}
	
	void push(int data)
	{
		if(top >= size - 1)
		{
			System.out.println("Stack Overflow! Unable to push.");
			return;
		}
		
//		top = top + 1;
//		arr[top] = data;
		
		arr[++top] = data;
	}
	
	int pop()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty Stack! Nothing to pop.");
			return -1; //Error Code
		}
		
//		int x = arr[top];
//		top = top - 1;
//		return x;	
		
		return arr[top--]; //First it will return then decrease top
	}
}

public class ArrayImp {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
