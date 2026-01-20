package CoreJavaConcept;

import java.util.ArrayDeque;
import java.util.Stack;

public class Collection_Stack_List {

	public static void main(String[] args) {
		
		Stack<String> name = new Stack<>(); // LIFO
		name.push("Pune");
		name.push("Mumbai");
		name.push("Delhi");
		name.push("Bangalore");

		System.out.println(name);

		name.pop(); //it will remove last record since its LIFO
		System.out.println(name);

		ArrayDeque<String> ct = new ArrayDeque<>(); //FIFO
		ct.push("Bangalore");
		ct.push("Chennai");
		ct.push("Goa");
		ct.push("Delhi");
		System.out.println(ct); //[Delhi, Goa, Chennai, Banglore]
		
		ct.pop();    //it will remove first record from stack
		System.out.println(ct); //[Goa, Chennai, Banglore]

	}

}
