package Java_Programs;

public class Array_Palindrome {

	public static void main(String[] args) {
		
		int [] arr = {1,2,1,2,1};
		
		 // Assume the array is a palindrome initially
		
        boolean isPalindrome = true;
        
        //Loop through the first half of the array (comparing elements from start and end)
        
        for (int i = 0; i < arr.length / 2; i++) {
        	
            // Compare the i-th element with its counterpart from the end of the array
        	
            if (arr[i] != arr[arr.length - 1 - i]) {
            	
                // If elements don't match, set isPalindrome to false and break the loop
            	
                isPalindrome = false;
                break;
            }
        }
        // Print the result: true if the array is a palindrome, false otherwise
        System.out.println(isPalindrome);
	}

}
