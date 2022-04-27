package bitwise;

public class LongestConsecutive1 {
	    /*  
	    *   https://practice.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1/
	    *   Function to calculate the longest consecutive ones
	    *   N: given input to calculate the longest consecutive ones
	    */
	    public static int maxConsecutiveOnes(int N) {
	        
	        int count = 0;
	        
	        while(N!=0)
	        {
	            N = N & (N<<1);
	            count ++;
	        }
	        
	        return count;
	                
	    }
	}
