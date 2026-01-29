package Java_Programs;

public class RemoveDuplicateCharFromString {
	
    public static void main(String[] args) {
    	
        // Input string with duplicate characters
        String str1 = "selenium";
        
        // Initialize an empty string to store unique characters
        String str2 = "";

        // Iterate through each character in the input string
        for(int i = 0; i < str1.length(); i++) {
        	
            char ch = str1.charAt(i); // Get the current character
            
            // Check if the character is not already in str2
            if(str2.indexOf(ch) == -1) {
            	
                str2 += ch; // Add the character to str2 if it's unique
            }
        }
        
        // Print the new string with duplicates removed
        System.out.println("This is the new string with duplicates removed: " + str2);
    }
}
