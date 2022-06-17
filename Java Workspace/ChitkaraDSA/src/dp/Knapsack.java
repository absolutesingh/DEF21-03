package dp;

public class Knapsack {

	static int knapsack(int W, int wt[], int val[], int n) {
		if (W == 0 || n == 0)
			return 0;
		if (wt[n - 1] > W)// we can't pick it
		{
			return knapsack(W, wt, val, n - 1);
		}
		// 2 options
		// pick or don't pick
		return Math.max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1), knapsack(W, wt, val, n - 1));
	}
	
	static int knapsackM(int W, int wt[], int val[], int n, int storage[][]) {
		if (W == 0 || n == 0)
			return 0;
		
		if(storage[n][W]!=0)
		{
			return storage[n][W];
		}
		
		if (wt[n - 1] > W)// we can't pick it
		{
			return knapsackM(W, wt, val, n - 1, storage);
		}
		// 2 options
		// pick or don't pick
		storage[n][W] = Math.max(val[n - 1] + knapsackM(W - wt[n - 1], wt, val, n - 1, storage), knapsackM(W, wt, val, n - 1, storage));
		return storage[n][W];
	}
	
	static int knapsackT(int W, int wt[], int val[], int n) {
		
		int dp[][] = new int[n+1][W+1];
		
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < W + 1; j++) {
				if(i==0 || j==0)
				{
					dp[i][j] = 0;
				}
				else if(wt[i - 1] > j)
				{
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}
			}
		}
		return dp[n][W];
	}

	public static void main(String[] args) {
		int W = 50;
		int n = 3;
		int val[] = { 120, 80, 60 };
		int wt[] = { 10, 20, 30 };
		System.out.println(knapsack(W, wt, val, n));
		
		int storage[][] = new int[n+1][W+1];
		System.out.println(knapsackM(W, wt, val, n, storage));
		
		System.out.println(knapsackT(W, wt, val, n));
		
	}

}
