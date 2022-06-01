package setsAndMaps;

import java.util.*;

public class MapStudy {

	public static void main(String[] args) {
//		Big Basket Software -> Fruits and its quantity
//		(Mango, 10)
		Map<String, Integer> map = new HashMap<>(); //Key-Value pair
		
		map.put("Mango", 5);
		map.put("Apple", 7);
		map.put("Banana", 9);
		map.put("Orange", 10);
		map.put("Melon", 10);
		
		System.out.println("Mangoes: " + map.get("Mango"));
		System.out.println(map.get("Kiwi")); //Key not present
		System.out.println(map.containsKey("Kiwi"));
		
		System.out.println(map.keySet()); //This is a set because keys are unique
		System.out.println(map.values()); //This is not a set
		
		System.out.println(map.containsKey("Mango"));
		map.remove("Mango");
		System.out.println(map.containsKey("Mango"));
		
		System.out.println(map.getOrDefault("Melon", 0));
		System.out.println(map.get("Mango"));
		System.out.println(map.getOrDefault("Mango", 0)); //If the key is not present in our map -> if will return the default value given by us
		
	}

}
