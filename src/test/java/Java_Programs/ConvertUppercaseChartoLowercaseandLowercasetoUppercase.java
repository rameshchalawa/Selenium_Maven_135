package Java_Programs;

public class ConvertUppercaseChartoLowercaseandLowercasetoUppercase {
	
    public static void main(String[] args) {
        
        String str = "InTeRvieW";
        
        // Initialize an empty string to store the result
        String str2 = "";
        
        // Iterate over each character in the input string
        for(int i = 0; i < str.length(); i++) {
        	
            // Get the character at the current index
            char ch = str.charAt(i);
            
            // Check if the character is uppercase
            if(Character.isUpperCase(ch)) {
            	
                // Convert uppercase character to lowercase and append to result string
                str2 = str2 + Character.toLowerCase(ch);
            } 
            else {
                // Convert lowercase character to uppercase and append to result string
                str2 = str2 + Character.toUpperCase(ch);
            }
        }
        
        // Print the resulting string with swapped case
        System.out.println("Swapped Case String: " + str2);
    }
}
