package setsAndMaps;

import java.util.HashSet;
import java.util.Set;;

public class SetStudy {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.add(7);
		s.add(5);
		s.add(27);
		s.add(9);
		System.out.println(s.contains(7));
		System.out.println(s.contains(2));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.remove(7);
		System.out.println(s.contains(7));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.add(27);//Doesn't give an error but doesn't add as well -> duplicates are not allowed
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		System.out.println(s);
		
		//Printing elements in a set -> For each/ Enhanced for loop 
		for(Integer x:s) //For each loop -> One by one each element in collection s will come in x
		{
			System.out.print(x + " ");
		}
		System.out.println();
		
		s.clear(); //Removes all elements from the set
		System.out.println(s.size());
		System.out.println(s.isEmpty());
	}

}
