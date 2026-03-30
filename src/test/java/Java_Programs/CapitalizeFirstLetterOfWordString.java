 package Java_Programs;

 public class CapitalizeFirstLetterOfWordString {
	 
	    public static void main(String[] args) {
	    	
	        // Input string to be processed
	        String str = "selenium automation with java";
	        
	        // Split the string into an array of words using space as delimiter
	        
	        String[] words = str.split(" ");
	        
	        // Create a StringBuffer to store the result efficiently
	        StringBuffer sb = new StringBuffer();
	        
	        // Iterate over each word in the array
	        for (String word : words) {
	        	
	            // Extract the first letter of the word and capitalize it
	            String firstLetter = word.substring(0, 1).toUpperCase(); //"selenium" → substring(0,1) → "s" → toUpperCase() → "S"
	            
	            // Extract the remaining letters of the word
	            String remainingLetters = word.substring(1);//
	            
	            // Append the capitalized word to the StringBuffer
	            sb.append(firstLetter).append(remainingLetters).append(" "); //sb = "S" + "elenium" + " "  → "Selenium "
	        }
	        
	        // Print the resulting string, trimming any trailing whitespace
	        System.out.println("Capitalized String: " + sb.toString().trim()); //Converts StringBuffer → regular String and Removes the trailing space added after the last word
	    }
	}
