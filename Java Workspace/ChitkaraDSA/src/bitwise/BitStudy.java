package bitwise;

public class BitStudy {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = a & b;
		System.out.println(c);
		System.out.println(4&5);
		System.out.println(2|5);
		System.out.println(2^5);
		System.out.println(4^5);
		System.out.println(~5);
		System.out.println(~7);
		
		int x = 5;
		System.out.println(x<<1);
		System.out.println(x<<2); //Left Shift  twice
		System.out.println(x<<3);
		System.out.println(x<<4);
		System.out.println(x>>1);  //Signed Right Shift
		System.out.println(x>>>1); //Unsigned Right Shift
		System.out.println(x>>2);
		System.out.println(x>>>2);
		
		int y = 32;
		System.out.println(y>>2);
		
		int z = -8;
		System.out.println(z>>1);
		System.out.println(z>>2);  //Signed Right Shift
		System.out.println(z>>>2);  //Signed Right Shift
		
		
	}

}
