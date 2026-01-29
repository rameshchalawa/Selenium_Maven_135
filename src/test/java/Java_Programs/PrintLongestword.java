package Java_Programs;

public class PrintLongestWord {
	
    public static void main(String[] args) {
    	
        // Input string containing multiple words
        String str = "selenium automation with java";
        
        // Split the string into an array of words
        String[] words = str.split(" ");
        
        // Initialize variable to store the longest word
        String longestWord = "";

        // Iterate through each word in the array
        for(String word : words) {
        	
            // Check if current word's length is greater than the longest word found so far
        	
            if(word.length() > longestWord.length())
                longestWord = word; // Update longest word if current word is longer
        }
        
        // Print the longest word
        System.out.println("This is the longest word: " + longestWord);
    }
}
