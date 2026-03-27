package CoreJavaConcept;

import java.util.LinkedList;

/*
LinkedList - It is a class which implements List and Deque interfaces. 
It is based on the doubly linked list data structure. It can contain duplicate elements. 
It maintains insertion order. It is not synchronized. It can be used as a list, stack or queue.
*/

public class Collection_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ct = new LinkedList<>();
		
		ct.add("Bangalore");
		ct.add("Chennai");
		ct.add("Pune");
		ct.add("Mumbai");
		ct.add("Pune");
		ct.add("null");
		System.out.println(ct);
		
		//to Access first element use getFirst() method
		System.out.println(ct.getFirst());
		
		//to Access last element use getLast() method
		System.out.println(ct.getLast());
		
		ct.addFirst("Goa"); 
		System.out.println(ct);
		
		ct.addLast("Delhi");
		System.out.println(ct);
		
		ct.removeFirst();
		System.out.println(ct);
		
		ct.removeLast();
		System.out.println(ct);
		

	}

}
