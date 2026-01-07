package Java_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_RemoveDuplicateChar {

	public static void main(String[] args) {
		
		// Remove Duplicate Char
		
		String str = "automation";
		
		Set<Character> st = new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
		    st.add(ch);
		}
		System.out.println("Remove Duplicate char : "+st);

	}

}
