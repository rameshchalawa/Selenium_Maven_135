package Java_Programs;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		
		// Input string with special characters
		
        String str = "S?u/j!e@e#t";
        
        String str2 = ""; // Initialize an empty string to store the result

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
        	
            char ch = str.charAt(i); // Get the current character

            // Check if the character is alphanumeric (letter or digit)
            
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            	
                str2 = str2 + ch; // Append the character to the result string
            }
        }

        // Print the string without special characters
        System.out.println(str2);
    }
}