package coreJava;

public class PatternOne {

	static void printPattern(int n)
	{
		int k = 1;
		for(int row = 1; row <= n; row++)
		{
			//row -> 1,2,3,4
			for(int col = 1;col<=row;col++)
			{
				System.out.print(k++ + " ");
			}
			//We'll leave a line once the row has been completely printed
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		printPattern(n);
	}

}
