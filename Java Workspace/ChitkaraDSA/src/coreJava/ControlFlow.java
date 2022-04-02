package coreJava;

public class ControlFlow {

	static void findMax(int a, int b, int c)
	{
		if(a>b)//Nested If-else
		{
			if(a>c)
			{
				System.out.println("A is the largest");
			}
			else //a>b, a<c -> c>a>b  
			{
				System.out.println("C is the largest");
			}
		}
		else {
			if(b>c)
			{
				System.out.println("B is the largest");
			}
			else {
				System.out.println("C is the largest");
			}
		}
	}
	
	public static void main(String[] args) {
		int num = 50;
		if(num>50)
		{
			System.out.println("Person has passed");
		}
		else {
			System.out.println("Person has failed");
		}
		
		//find max of 3 numbers
		int n=5;
		while(n>0)
		{
			findMax(15,100,20);
		}
		
		char c = 'b';
		
		switch(c)
		{
		case 'a':
			System.out.println("Hi, I'm A");
			break; //VV Imp
		case 'b':
			System.out.println("Hi, I'm B");
			break; //VV Imp
		case 'c':
			System.out.println("Hi, I'm C");
			break; //VV Imp
		default:
			System.out.println("I'm not A, B or C");
			break; //VV Imp
		}
		
	}

}
