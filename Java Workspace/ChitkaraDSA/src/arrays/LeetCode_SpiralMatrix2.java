package arrays;

import java.util.*;
//https://leetcode.com/problems/spiral-matrix
class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        int dir = 0; 
            // 0-> top row(right dir), 1-> right col(down dir);
            //2 -> bottom row(left Dir); 3->left col(up dir)
        
        //Outer Loop
        while(top<=bottom && left<=right)
        {
            if(dir == 0)
            {
                //Printing Top Row
                for(int i=left;i<=right;i++)
                {
                    result.add(matrix[top][i]);
                }
                top++;  
                dir = 1;
            }
            
            else if(dir == 1){
                //Printing Right Column
                for(int i=top;i<=bottom;i++)
                {
                    result.add(matrix[i][right]);
                }
                right--;
                dir = 2;
            }
            
            else if(dir == 2){
                 //Printing Bottom Row
                for(int i=right;i>=left;i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                dir = 3;
            }
            
            else if(dir == 3){
                //Printing Left Column
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        
        return result;
    }
}