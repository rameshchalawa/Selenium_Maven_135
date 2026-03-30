package Java_Programs;

public class Array_Palindrome {

	public static void main(String[] args) {
		
		int [] arr = {1,2,1,2,1};
		
		 // Assume the array is a palindrome initially
		
        boolean isPalindrome = true;
        
        //Loop through the first half of the array (comparing elements from start and end)
        
        for (int i = 0; i < arr.length / 2; i++)  // Loop runs until the middle of the array. comparing the first half against the second half is enough
         {
        	
            // Compare the i-th element with its counterpart from the end of the array
        	
            if (arr[i] != arr[arr.length - 1 - i]) //1!=arr[5-1-0]=arr[4]=1  //2!=arr[5-1-1]=arr[3]=2 matching elements
            {
            	
                // If elements don't match, set isPalindrome to false and break the loop
            	
                isPalindrome = false;
                break;
            }
        }
        // Print the result: true if the array is a palindrome, false otherwise
        System.out.println(isPalindrome);
	}

}
