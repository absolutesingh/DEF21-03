package arrays;
//https://leetcode.com/problems/set-matrix-zeroes
class Solution3 {
    public void setZeroes(int[][] matrix) {
        
        int nRow = matrix.length;
        int nCol = matrix[0].length;
        
        boolean rows[] = new boolean[nRow];
        boolean cols[] = new boolean[nCol];
        
        for(int i=0;i<nRow;i++)
        {
            for(int j=0;j<nCol;j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        for(int i=0;i<nRow;i++)
        {
            for(int j=0;j<nCol;j++)
            {
                if(rows[i] == true || cols[j]==true)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}