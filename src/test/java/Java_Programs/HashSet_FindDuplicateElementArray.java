package Java_Programs;

import java.util.HashSet;
import java.util.Set;

//Find duplicate elements in an array using HashSet

public class HashSet_FindDuplicateElementArray {
	
 public static void main(String[] args) {
	 
     // Input array with duplicate elements
     int[] arr = {1, 2, 3, 2, 4, 5, 1};
     
     // Set to store unique elements
     Set<Integer> st = new HashSet<>();
     
     // Set to store duplicate elements
     Set<Integer> dupElement = new HashSet<>();
     
     // Iterate through the array
     for (int num : arr) {
    	 
         // If element is already in the set, it's a duplicate
         if (!st.add(num)) {
             dupElement.add(num); // Add to duplicate set
         }
     }
     
     // Print duplicate elements
     System.out.println("Duplicate Elements: " + dupElement);
 }
}