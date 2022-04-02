package coreJava;

public class PrimitiveDT {

	public static void main(String[] args) {
		//Java is not purely an object oriented language because primitive DT are not objects.
		//We can create objects from them using Wrapper classes -> Integer, Double, Float etc.
		
		int a = 5;
		System.out.println("A is: " + a);
		
		byte b = 10;
		System.out.println("B is: " + b);
		
		int i = b; //Implicit type casting or Up-Casting or Widening
		System.out.println("I is: " + i);
		
		int c = 130;
		
		byte b2 = (byte)c;//Explicit type casting or Down-Casting or Narrowing
		System.out.println("B2 is: " + b2);
		
		int p = 5;
		int q = p++; //Post increment operator[assign then increase]
		
		System.out.println("P is: " + p);
		System.out.println("Q is: " + q);
		
		int m = 5;
		int n = ++m; //Pre increment operator[increase then assign]
		
		System.out.println("M is: " + m);
		System.out.println("N is: " + n);
		
	}

}
