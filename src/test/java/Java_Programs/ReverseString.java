package Java_Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		// Approach 1: Using char array
		
        String s = "welcome"; // input string
        
        String rev = ""; // initialize reverse string
        
        char a[] = s.toCharArray(); // convert string to char array
        
        for (int i = a.length - 1; i >= 0; i--)    // loop through array in reverse
        { 
        	
            rev = rev + a[i]; // append each char to reverse string
        }
        
        System.out.println("Reverse string is: " + rev); // output reversed string

        // Approach 2: Using charAt() method
        
        /*String s = "selenium"; // input string
         
        String rev = ""; // initialize reverse string
        
        for (int i = s.length() - 1; i >= 0; i--)  // loop through string in reverse
        { 
            rev = rev + s.charAt(i); // append each char to reverse string
        }
        
        System.out.println("Reverse string is: " + rev); // output reversed string
        */
    }
}
