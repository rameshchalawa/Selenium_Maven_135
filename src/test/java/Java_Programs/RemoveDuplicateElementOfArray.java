package Java_Programs;

public class RemoveDuplicateElementOfArray {

	public static void main(String[] args) {
		
		int [] input = {4,5,6,4,2,5,6,8};
		
		// Iterate through the array
        for (int i = 0; i < input.length; i++) {
        	
            boolean isDuplicate = false; // Flag to track duplicates

            // Check if the current element is a duplicate
            for (int j = 0; j < i; j++) {
                if (input[i] == input[j]) {
                    isDuplicate = true; // Mark as duplicate
                    break; // Exit inner loop
                }
            }

            // Print the element if it's not a duplicate
            if (!isDuplicate) {
                System.out.print(input[i] + " ");
            }
        }
    }
}