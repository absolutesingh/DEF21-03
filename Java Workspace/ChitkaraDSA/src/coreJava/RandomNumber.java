package coreJava;

public class RandomNumber {

	public static void main(String[] args) {
		double x = Math.random(); //random number [0,1]
		int min = 5;
		int max = 10;
		int range = max - min + 1;
		
//		x*range -> [0,range]
//		x*range + min -> [min,max]
		
		double rand = x*range + min;
		
		int random = (int) rand;
		
		System.out.println("Random Number: " + random);
	}

}
