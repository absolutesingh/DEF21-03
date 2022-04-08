package arrays;

import java.util.*;
//https://leetcode.com/problems/spiral-matrix
class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        ArrayList<Integer> result = new ArrayList<>();
	        int top = 0;
	        int right = matrix[0].length - 1;
	        int bottom = matrix.length - 1;
	        int left = 0;
	        
	        //Outer Loop
	        while(true)
	        {
	            //Printing Top Row
	            for(int i=left;i<=right;i++)
	            {
	                result.add(matrix[top][i]);
	            }
	            top++;
	            
	            if(top>bottom || left>right)
	            {
	                break;
	            }
	            
	            //Printing Right Column
	            for(int i=top;i<=bottom;i++)
	            {
	                result.add(matrix[i][right]);
	            }
	            right--;
	            
	            if(top>bottom || left>right)
	            {
	                break;
	            }
	            
	            //Printing Bottom Row
	            for(int i=right;i>=left;i--)
	            {
	                result.add(matrix[bottom][i]);
	            }
	            bottom--;
	            
	            if(top>bottom || left>right)
	            {
	                break;
	            }
	            
	            //Printing Left Column
	            for(int i=bottom;i>=top;i--)
	            {
	                result.add(matrix[i][left]);
	            }
	            left++;
	            
	            if(top>bottom || left>right)
	            {
	                break;
	            }
	        }
	        
	        return result;
	    }
	}

