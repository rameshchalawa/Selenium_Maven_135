package CoreJavaConcept;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet - It is a class of Java Collection Framework which implements the Set interface. 
It stores the elements in a sorted manner and does not allow duplicate values. 
1. Heterogeneous data --> Not allowed (all elements must be of the same type)
2. Insertion order --> Not preserved (Index not supported)
3. Duplicate elements --> Not Allowed
4. Multiple nulls Not allowed/ only single null is allowed
*/

public class Collection_TreeSet {

	public static void main(String[] args) {
		
		Set<String> ct2 = new TreeSet<>();
		ct2.add("sujeet");
		ct2.add("Abhijeet");
		ct2.add("sujeet");
		System.out.println(ct2); //duplicate element not allowed, it will eliminate duplicate value automatically


	}

}
