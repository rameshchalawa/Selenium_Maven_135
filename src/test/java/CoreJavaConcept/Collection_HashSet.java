package CoreJavaConcept;

/*
HashSet - a class implemented Set interface
1. Heterogeneous data ---> allowed
2. Insertion order --> Not preserved (Index not supported)
3. Duplicate elements --> Not Allowed
4. Multiple nulls Not allowed/ only single null is allowed
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection_HashSet {

	public static void main(String[] args) {
		
		HashSet myset=new HashSet();
		
		//Set myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();

		//adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		//Printing hashset
		System.out.println(myset); //HashSet will eliminate duplicate data automatically 
		
		//Size of HashSet
		System.out.println("HashSet Size :"+myset.size());
		
		//To check specific element from HashSet is present or not we use contains() method
		
		System.out.println(myset.contains("welcome")); //true
		
		//Removing element
		myset.remove(10.5); //here 10.5 is element value
		System.out.println("After Removing :"+myset);   //[null, A, 100, welcome, true]
		
		//Insertion/accessing specific element is not possible in HashSet because its unordered 
		
		//workaround to access specific element convert HashSet---->ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all element from HashSet using enhanced for loop
		/*for(Object x:myset) {
			System.out.print(x+" ");
		}*/
		
		//Using iterator
		
		Iterator it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		//clearing all the elements in HashSet
		
		myset.clear();
		System.out.println();
		System.out.println(myset.isEmpty()); //true
	}

}
