package CoreJavaConcept;

/*
HashMap - a class implemented Map interface
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved (Index not followed).
 */

import java.util.HashMap;

public class Collection_HashMap {

	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		//Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David"); //incase of duplicate key old value will get replace with latest value i.e. override

		System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}

		System.out.println("Size of hashmap:"+ hm.size()); //4 

		//remove pair
		hm.remove(103); // to remove particular pair, provide key
		System.out.println("Size of hashmap:"+ hm); //{101=John, 102=David, 104=Scott}
		
		//Access value of the key
		System.out.println(hm.get(102));
		
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values()); //[John, David, Scott]
		System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]
		
		hm.put(105, "John");
		System.out.println(hm);
		
		//reading data from HashMap 
		
		//Using Enhanced for loop
		for(int k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		
		hm.clear();
		System.out.println(hm.isEmpty()); //true
			

	}

}
