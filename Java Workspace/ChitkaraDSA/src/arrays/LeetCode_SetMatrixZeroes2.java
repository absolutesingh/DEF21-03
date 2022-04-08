package arrays;
//https://leetcode.com/problems/set-matrix-zeroes
class Solution4 {
	public void setZeroes(int[][] matrix) {

		int nRow = matrix.length;
		int nCol = matrix[0].length;
		boolean makeFirstColZero = false;

		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < nCol; j++) {
				if (matrix[i][j] == 0) {
					if (j == 0)// It is in first col
					{
						makeFirstColZero = true;
					} else // element not in first col
					{
						matrix[0][j] = 0; // Using first row of this matrix itself
						matrix[i][0] = 0; // Using first col of this matrix itself
					}
				}
			}
		}

		for (int i = 1; i < nRow; i++) {
			for (int j = 1; j < nCol; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		if (matrix[0][0] == 0) // make first row as zero
		{
			for (int i = 0; i < nCol; i++) {
				matrix[0][i] = 0;
			}
		}

		if (makeFirstColZero) {
			for (int i = 0; i < nRow; i++) {
				matrix[i][0] = 0;
			}
		}

	}
}