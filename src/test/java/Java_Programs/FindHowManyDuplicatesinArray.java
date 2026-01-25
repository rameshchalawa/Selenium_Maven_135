package Java_Programs;

public class FindHowManyDuplicatesinArray {

	public static void main(String[] args) {
		
		// Input array with duplicate values
        int a[] = {100, 200, 100, 300, 100, 400, 100, 200};
        
        // Target number to find duplicates of
        int num = 100;
        
        // Initialize counter for duplicates
        int count = 0;
        
        // Iterate through the array
        for (int value : a) {
            // Check if current value matches the target number
            if (value == num) {
                // Increment counter if match found
                count++; // 1 2 3 4
            }
        }
        
        // Print the total count of duplicates
        System.out.println("Number of occurrences of " + num + ": " + count);
    }
}