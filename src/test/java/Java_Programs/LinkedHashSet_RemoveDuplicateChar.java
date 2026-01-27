package Java_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

//Remove duplicate characters from a string using LinkedHashSet

public class LinkedHashSet_RemoveDuplicateChar {
	
 public static void main(String[] args) {
	 
     // Input string with duplicate characters
     String str = "automation";
     
     // LinkedHashSet to store unique characters (preserves insertion order)
     Set<Character> st = new LinkedHashSet<>();
     
     // Iterate through the string's characters
     for (char ch : str.toCharArray()) {
         st.add(ch); // Automatically removes duplicates
     }
     
     // Print string with duplicate characters removed
     System.out.println("Remove Duplicate char: " + st);
 }
}
