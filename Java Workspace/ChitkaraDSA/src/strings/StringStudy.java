package strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		String name = "Chitkara"; // created using string literal -> object created in String Constant Pool
		String name2 = "Chitkara";
		// == operator compares references for objects, and values for the primitive
		// data types
		System.out.println("name and name2 refer to the same object: " + (name == name2));

		String name3 = new String("Chitkara"); // created string using constructor
		String name4 = new String("Chitkara");
		System.out.println("name3 and name4 refer to the same object: " + (name3 == name4));

		System.out.println("name and name4 refer to the same object: " + (name == name4));

		// STRINGS ARE IMMUTABLE
		// Everytime we do an operation on a string, a new string is created

		// 1. Concatenation
		System.out.println("==================================================");
		System.out.println("1. CONCATENATION");

		String s1 = "Hello";
		s1 = s1 + " People";
		System.out.println(s1);
		System.out.println(s1 + ", How're you doing?");
		System.out.println(s1); // we haven't changed s1

		String s2 = s1.concat(" Good Morning");
		System.out.println("s2: " + s2);
		System.out.println("s1: " + s1);

		// 2. CHECK IF STRINGS ARE EQUAL IN VALUE
		System.out.println("==================================================");
		System.out.println("2. EQUALS() FUNCTION");

		// s1.equals(s2) function checks that the two strings have the same data
		System.out.println("name and name2 have the same content: " + (name.equals(name2)));
		System.out.println("name and name4 have the same content: " + (name.equals(name4)));
		System.out.println("name and name3 have the same content: " + (name.equals(name3)));
		System.out.println("name3 and name3 have the same content: " + (name2.equals(name3)));

		// 3. CREATE A STRING FROM A CHARACTER ARRAY
		System.out.println("==================================================");
		System.out.println("3. CREATE STRING FROM CHAR ARRAY");

		char arr[] = { 'C', 'H', 'I', 'T', 'K', 'A', 'R', 'A' };
		String strFromArr = new String(arr); // Constructor Overloading
		System.out.println("strFromArr:" + strFromArr);

		// 4. CREATE A PARTIAL STRING FROM A CHARACTER ARRAY
		System.out.println("==================================================");
		System.out.println("4. CREATE A PARTIAL STRING FROM CHAR ARRAY");

		String partialStrFromArray = new String(arr, 4, 4); // we pass the array, starting index(included), count of
															// elements to be picked
		System.out.println("partialStrFromArray:" + partialStrFromArray);

		String partialStrFromArray2 = new String(arr, 2, 3); // we pass the array, starting index(included), count of
																// elements to be picked
		System.out.println("partialStrFromArray2:" + partialStrFromArray2);

		// 5. CHANGING THE CASE
		System.out.println("==================================================");
		System.out.println("5. CHANGING THE CASE");

		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		// 6. Splitting
		System.out.println("==================================================");
		System.out.println("6. Splitting");

		System.out.println("Please enter full name: ");
		Scanner sc = new Scanner(System.in);
		String fullName = sc.nextLine(); // we have a space separated input

		String strArr[] = fullName.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		String commaSeparated = "Hello,I,Am,An,Alien";

		String strArr2[] = commaSeparated.split(",");
		for (int i = 0; i < strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}

		String dotSeparated = "Hello.I.Am.A.Dot";

		String strArr3[] = dotSeparated.split("[.]"); // as dot is a meta char in regex, so we will need to put it in
														// square brackets
		for (int i = 0; i < strArr3.length; i++) {
			System.out.println(strArr3[i]);
		}

		// 7. LENGTH OF THE STRING
		System.out.println("==================================================");
		System.out.println("7. LENGTH OF THE STRING");
		System.out.println("The length of the string *" + s1 + "* is: " + s1.length()); // this is a function

		// 8. Finding index of a char in a string
		System.out.println("=======================================================");
		System.out.println("8. Finding index of a char in a string");
		int index = name.indexOf('a'); //return the index of first occurrence of that character
		System.out.println("Index of 'a' in " + name + " is: " + index);
		
		int index2 = name.indexOf('f'); //return the index of first occurrence of that character
		System.out.println("Index of 'f' in " + name + " is: " + index2);
		
		int index3 = name.indexOf("kara"); //return the index of first occurrence of that String
		System.out.println("Index of KARA in " + name + " is: " + index3);

		int index4 = name.indexOf('a', 6); //start searching from index 6, 6 included
		System.out.println("Index of 'a' in " + name + " is: " + index4);
		
		//FIND all indexes in String name where the character is 'a'
		System.out.println("==============FINDING ALL OCCURRENCES================");
		int indexKeeper = -1;
		while(true)
		{
			indexKeeper = name.indexOf('a', indexKeeper + 1);
			if(indexKeeper != -1)
			{
				System.out.println("Index of 'a' in " + name + " is: " + indexKeeper);
			}
			else 
			{
				break;
			}
		}
		
		// 9. Extract a Substring
		System.out.println("=======================================================");
		System.out.println("9. Extract a Substring");
		
		String wF = "Wakanda Forever";
		System.out.println(wF.substring(3)); //From starting index pick string till the end
		
		System.out.println(wF.substring(3,7)); //From starting index pick up to ending index(excluded)
		
		
		// 10. Finding a character at a given index
		System.out.println("=======================================================");
		System.out.println("10. Finding a character at a given index");
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(5));
//		System.out.println(name.charAt(10)); //EXCEPTION if index given >=Length
		
		char charAtIndex = name.charAt(6);
		System.out.println(charAtIndex);
		
		// 11. Char Array from a string
		System.out.println("=======================================================");
		System.out.println("11. Char Array from a string");
		char charArr[] = name.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			System.out.println(charArr[i]);
		}
		
		// 12. Check if a string is empty
		System.out.println("=======================================================");
		System.out.println("12. Check if a string is empty");
		String emptyString = new String();
		String emptyString2 = "";
		String blankString = "   ";
		
		System.out.println(emptyString.equals(""));
		System.out.println(emptyString2.equals(""));
		System.out.println(emptyString2.equals(emptyString));
		
		System.out.println(emptyString.isEmpty());
		System.out.println(emptyString2.isEmpty());
		System.out.println(blankString.isEmpty()); //FALSE
		
		System.out.println(blankString.isBlank());
		System.out.println(emptyString.isBlank());
		
		// 13. Comparing strings lexicographically -> alphabetically
		System.out.println("=======================================================");
		System.out.println("13. Comparing strings lexicographically -> alphabetically");
		String textOne = "QA";
		String textTwo = "RD";
		System.out.println(textOne.compareTo(textTwo)); //compares *character by character*
		System.out.println(textTwo.compareTo(textOne));
		System.out.println(textOne.compareTo(textOne));
 		
		// 14. Trimming white spaces from front and end
		System.out.println("=======================================================");
		System.out.println("14. Trimming white spaces from front and end");
		String s5 = new String("Hello               ");
		String s6 = new String("             Hello              ");
		String s7 = new String("                Hello          People               ");
		System.out.println("*" + s5.trim() + "*"); //Clears spaces at the beginning and at the end
		System.out.println("*" + s6.trim() + "*");
		System.out.println("*" + s7.trim() + "*");	
		
		// 15. Replacing a character
		System.out.println("=======================================================");
		System.out.println("15. Replacing a character");
		System.out.println(s1.replace('l', 'L'));
		System.out.println(s1.replace("eo", ".E.O."));
	}

}
