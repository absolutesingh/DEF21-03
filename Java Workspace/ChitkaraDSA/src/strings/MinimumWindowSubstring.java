package strings;

//https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1/#

class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int sLen = s.length();
        int pLen = p.length();
        if(pLen > sLen)
        {
            return "-1";
        }
        
        int freqPat[] = new int[256];
        int freqWin[] = new int[256];
        
        for(int i=0;i<pLen;i++)
        {
            freqPat[p.charAt(i)]++;
        }
        
        int count = 0;
        int start = 0;
        int startIndex = -1;
        int minLen = Integer.MAX_VALUE;
        
        for(int i=0;i<sLen;i++)
        {
            freqWin[s.charAt(i)]++;
            
            if(freqWin[s.charAt(i)]<=freqPat[s.charAt(i)])
            {
                count++;
            }
            
            if(count == pLen)
            {
                while(freqWin[s.charAt(start)] > freqPat[s.charAt(start)])
                {
                    freqWin[s.charAt(start)]--;
                    start++;
                }
                int len = i - start + 1;
                if(minLen>len)
                {
                    minLen = len;
                    startIndex = start;
                }
            }
        }
        
        if(startIndex == -1)
        {
            return "-1";
        }
        else
        {//starting Index -> startIndex, length -> minLen
            return s.substring(startIndex, startIndex + minLen);
        }
        
    }
}