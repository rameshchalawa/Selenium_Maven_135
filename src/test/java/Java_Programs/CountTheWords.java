package Java_Programs;

public class CountTheWords {
    public static void main(String[] args) {
    	
        // Approach 1: 
    	//Counting words in a string by tracking spaces
        String s = "Java is platform independent";
        int count = 1; // Initialize word count to 1 (assuming at least one word)
        
        // Iterate through the string, checking for spaces
        for (int i = 0; i < s.length() - 1; i++) {
        	
            // If a space is found and the next character is not a space, increment word count
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        
        // Print the total word count
        System.out.println("Number of words in a string: " + count);

		
		//Approach2
		
		/*String str = "Java is platform independent";
		
		String[] wd = str.split("\\s+"); //s+ Matches one or more whitespace characters
		
		System.out.println("Number of words in a string:"+wd.length);
		*/

	}

}
