package CoreJavaConcept;

import java.util.Set;
import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {
		
		Set<String> ct2 = new TreeSet<>();
		ct2.add("sujeet");
		ct2.add("Abhijeet");
		ct2.add("sujeet");
		System.out.println(ct2); //duplicate element not allowed, it will eliminate duplicate value automatically


	}

}
