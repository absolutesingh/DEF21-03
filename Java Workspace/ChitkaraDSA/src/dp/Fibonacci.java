package dp;

public class Fibonacci {

	static int fib(int n)// Recursive approach
	{
		if (n < 2)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	static int fibM(int n, int storage[])// Memoization -> Top-Down Approach
	{
		if (n < 2)
			return n;
		if (storage[n] != 0)// this means already calculated
		{
			return storage[n]; // Step 3: Return the answer directly if it was already calculated
		}
		storage[n] = fibM(n - 1, storage) + fibM(n - 2, storage); // Step 2: Store the answer in array
		return storage[n];
	}
	
	static int fibT(int n) //Tabulation -> Bottom-Up Approach
	{
		int dp[] = new int[n+1]; //we need n index, so size will be n+1
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<dp.length;i++)
		{
			dp[i] = dp[i-1] + dp[i-2];
		}
		//array filled completely
		return dp[n]; //our required value is at the last index
	}

	public static void main(String[] args) {
		int n = 46;
		long start = System.currentTimeMillis();
		System.out.println(fib(n)); // Recursive
		long end = System.currentTimeMillis();
		System.out.println("Time taken by recursive approach: " + (end - start));

		int storage[] = new int[n + 1]; // Step 1: Create an array to store
		
		start = System.currentTimeMillis();
		System.out.println(fibM(n, storage));
		end = System.currentTimeMillis();
		System.out.println("Time taken by Memoization approach: " + (end - start));
		
		start = System.currentTimeMillis();
		System.out.println(fibT(n));
		end = System.currentTimeMillis();
		System.out.println("Time taken by Tabulation approach: " + (end - start));
	}

}
