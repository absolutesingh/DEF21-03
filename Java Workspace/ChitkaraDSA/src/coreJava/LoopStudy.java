package coreJava;

public class LoopStudy {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
		
		//FOR Loop
		int i;
		for(i=0;i<=100;i++)
		{
			System.out.println(i);
		}
		//Loop breaks, what is the value of i -> 101
		System.out.println("Value of i after FOR Loop: " + i);
		
		
		//WHILE Loop
		int n = 5;
		while(n>0) //Keep on working till
		{
			System.out.println(n);
			n--;
		}
		System.out.println("Value of n after While Loop: " + n);
		
		//DO-WHILE Loop
		
		int m = 5;
		do {
			System.out.println(m);
			m--;
		}
		while(m>0);
		System.out.println("Value of m after DO While Loop: " + m);
		
		//WHAT IS THE DIFFERENCE BETWEEN WHILE AND DO WHILE LOOP??
		//WHILE Loop
		n = 0;
		while(n>0) //Keep on working till
		{
			System.out.println(n);
			n--;
		}
		System.out.println("Value of n after While Loop: " + n);
		
		//DO-WHILE Loop -> This runs the statements atleast once.
		m= 0;
		do {
			System.out.println(m);
			m--;
		}
		while(m>0);
		System.out.println("Value of m after DO While Loop: " + m);
		
	}

}
