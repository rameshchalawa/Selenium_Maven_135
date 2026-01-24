package Java_Programs;

public class FindUniqueChar {
    public static void main(String[] args) {
    	
        // Input string with repetitive characters
        String str = "Repetitive"; // Output: Rpv
        
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // StringBuilder to store unique characters
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character appears only once (i.e., it's unique)
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result.append(ch);
            }
        }
        
        // Convert first character to uppercase and append the rest
        String output = result.toString().substring(0, 1).toUpperCase() + result.toString().substring(1);
        
        System.out.println(output);
    }
}