package Java_Programs;

import java.util.Arrays;

public class SortingStringsInArray {

	public static void main(String[] args) {
		
		// Create a string array with names
        String s[] = {"scott", "marry", "john", "David"};
        
        // Print the array before sorting
        System.out.println("Before sorting.... " + Arrays.toString(s));
        
        // Sort the array in ascending order (alphabetical order)
        Arrays.sort(s);
        
        // Print the array after sorting
        System.out.println("After sorting.... " + Arrays.toString(s));
    }
}