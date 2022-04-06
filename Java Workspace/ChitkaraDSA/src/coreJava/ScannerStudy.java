package coreJava;

import java.util.Scanner;

public class ScannerStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = sc.next(); //It picks up data only till the first space
//		System.out.println("Name entered is: " + firstName);
//		System.out.println("Please enter your last name: ");
		String lastName = sc.next(); //It picks up data only till the first space
//		System.out.println("Name entered is: " + lastName);
		
//		System.out.println("Please enter your profession: ");
		String profession = sc.next(); //It picks up data only till the first space
//		System.out.println("profession is: " + profession);
		
//		System.out.println("Please enter your address: ");
		String address = sc.nextLine(); //It picks up data only till the first space
//		System.out.println("Address is: " + address);
		
//		System.out.println("Please enter your house number: ");
		int house = sc.nextInt(); //It picks up data only till the first space
		
		System.out.println("First Name entered is: " + firstName);
		System.out.println("Name entered is: " + lastName);
		System.out.println("profession is: " + profession);
		System.out.println("Address is: " + address);
		System.out.println("House Number is: " + house);
		
	}

}
