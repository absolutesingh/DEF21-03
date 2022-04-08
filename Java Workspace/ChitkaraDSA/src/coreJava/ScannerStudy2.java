package coreJava;

import java.util.Scanner;

public class ScannerStudy2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Full Name: ");
		String firstName = sc.next(); //It picks up data only till the first space
		String lastName = sc.next(); //It picks up data only till the first space
		
		System.out.println("Please enter your profession: ");
		String profession = sc.next(); //It picks up data only till the first space
		
		System.out.println("Please enter your address: ");
//		sc.nextLine(); //Solution - 1
		String address = sc.nextLine(); //It picks up data only till the first space
		
		System.out.println("Please enter your house number: ");
		String house = sc.next(); //It picks up data only till the first space
		
		System.out.println("First Name entered is: " + firstName);
		System.out.println("Name entered is: " + lastName);
		System.out.println("profession is: " + profession);
		System.out.println("Address is: " + address);
		System.out.println("House Number is: " + house);
		
//		Whenever we need to take mixed inputs like:
//		1. Numbers and Strings both
//		2. Single words first then maybe whole sentences
//		Try to use nextLine() to pick the complete data and then parse the data
		
	}

}
