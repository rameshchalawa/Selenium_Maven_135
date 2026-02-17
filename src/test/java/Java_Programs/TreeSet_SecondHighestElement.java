package Java_Programs;

import java.util.TreeSet;

public class TreeSet_SecondHighestElement {

	public static void main(String[] args) {
		
		// Initialize array with numbers
        int[] arr = {4, 10, 6, 8, 10, 3};

        // Create a TreeSet to store unique elements in sorted order
        TreeSet<Integer> tt = new TreeSet<>();

        // Add elements from array to TreeSet
        for (int n : arr) tt.add(n);

        // Print the second highest element (element just before the last one)
        System.out.println("Second Highest : " + tt.lower(tt.last()));
    }
}