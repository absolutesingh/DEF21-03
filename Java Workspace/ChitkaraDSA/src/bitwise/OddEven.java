package bitwise;

public class OddEven {

	static void OddOrEvenUsingAND(int n)
	{
		int bM = 1;
		if((n & bM) == 1) {
			System.out.println(n + " is odd");
		}
		else {
			System.out.println(n + " is even");
		}
	}
	
	static void OddOrEvenUsingOR(int n)
	{
		int bM = 1;
		if((n | bM) == n) {
			System.out.println(n + " is odd");
		}
		else {
			System.out.println(n + " is even");
		}
	}
	
	static void OddOrEvenUsingXOR(int n)
	{
		int bM = 1;
		if((n ^ bM) == n+1) {
			System.out.println(n + " is even");
		}
		else {
			System.out.println(n + " is odd");
		}
	}
	
	public static void main(String[] args) {
		OddOrEvenUsingAND(5);
		OddOrEvenUsingAND(4);
		
		OddOrEvenUsingOR(5);
		OddOrEvenUsingOR(4);
		
		OddOrEvenUsingXOR(5);
		OddOrEvenUsingXOR(4);
	}

}
