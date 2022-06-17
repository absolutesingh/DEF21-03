package dp;

public class EditDistance {

	static int editDistance(String s1, String s2, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;

//		if last characters are equal
		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			return editDistance(s1, s2, m - 1, n - 1);
		}

		// if the last characters are not equal
		int replace = 1 + editDistance(s1, s2, m - 1, n - 1);
		int insert = 1 + editDistance(s1, s2, m, n - 1);
		int remove = 1 + editDistance(s1, s2, m - 1, n);

		return Math.min(replace, Math.min(insert, remove));
	}

	static int editDistanceM(String s1, String s2, int m, int n, int storage[][]) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;

		if (storage[m][n] != 0) {
			return storage[m][n];
		}

//		if last characters are equal
		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			return editDistanceM(s1, s2, m - 1, n - 1, storage);
		}

		// if the last characters are not equal
		int replace = 1 + editDistanceM(s1, s2, m - 1, n - 1, storage);
		int insert = 1 + editDistanceM(s1, s2, m, n - 1, storage);
		int remove = 1 + editDistanceM(s1, s2, m - 1, n, storage);

		storage[m][n] = Math.min(replace, Math.min(insert, remove));

		return storage[m][n];
	}

	static int editDistanceT(String s1, String s2, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;

		int dp[][] = new int[m + 1][n + 1];

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else if (s1.charAt(i - 1) == s2.charAt(j - 1))// if last characters are equal
				{
					dp[i][j] = dp[i - 1][j - 1];
				} else // last characters are not equal
				{
					dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
				}
			}
		}

		return dp[m][n];
	}

	static void print2DArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "bd";
		int m = s1.length();
		int n = s2.length();
		System.out.println(editDistance(s1, s2, m, n));

		int storage[][] = new int[m + 1][n + 1];
		System.out.println(editDistanceM(s1, s2, m, n, storage));
		
		System.out.println(editDistanceT(s1, s2, m, n));

	}

}
