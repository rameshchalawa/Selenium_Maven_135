package Java_Programs;

public class FirstNonRepetitiveChar {

	public static void main(String[] args) {
		
		// Input string to find the first non-repetitive character
        String str = "swiss";
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character appears only once (i.e., it's non-repetitive)
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                // Print the first non-repetitive character and break the loop
                System.out.println("This is the first non-repetitive char: " + ch);
                break;
            }
        }
    }
}