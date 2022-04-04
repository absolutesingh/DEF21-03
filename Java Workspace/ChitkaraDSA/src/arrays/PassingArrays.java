package arrays;

public class PassingArrays {

	static void addOne(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = arr[i] + 1;
		}
		
		System.out.println("Printing inside the addOne() function once the task is done");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr = null;
		
		System.out.println("arr is null now");
		
		x = 100;
		System.out.println("X in addOne() is: " + x);
	}
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println("X is: " + x);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = i+1;
		}
		
		System.out.println("Printing before calling the addOne() function");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		addOne(arr, x);
		
		System.out.println("Printing after calling the addOne() function");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("X after addOne() is: " + x);
	}

}
