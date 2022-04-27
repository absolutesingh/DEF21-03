package bitwise;

public class MissingNumber {
	int MissingNumberUsingArithmetic(int array[], int n) {
		int sum = n * (n + 1) / 2;

		for (int i = 0; i < array.length; i++) {
			sum = sum - array[i];
		}

		return sum;
	}
	
int MissingNumberUsingBitwiseXOR(int array[], int n) {
        
        int xorRequired = 0;
        int xorOfArray = 0;
        
       for(int i=1;i<=n;i++)
       {
           xorRequired = xorRequired ^ i;
       }
       
       for(int i=0;i<array.length;i++)
       {
           xorOfArray = xorOfArray ^ array[i];
       }
       
       return xorRequired ^ xorOfArray;
    }
}
