package Java_Programs;

public class CountUpperCaseAndLowerCaseLetters {

	public static void main(String[] args) {
		
		//Approach1
		String str = "Wlcome To AutomatioN";

		int upperCaseCount = 0;
		int lowerCaseCount = 0;

		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);

			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
		}

		System.out.println("Number of uppercase letters: " + upperCaseCount);
		System.out.println("Number of lowercase letters: " + lowerCaseCount);
		
		  //Approach 2
		
		  // Input string to count uppercase and lowercase letters
		  
        /*String s = "Wlcome To AutomatioN";
        
        // Initialize counters for lowercase and uppercase letters
        int lower = 0;
        int upper = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Ignore spaces
            if (ch != ' ') {
                // Check if character is uppercase
                if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                } 
                // Check if character is lowercase
                else if (ch >= 'a' && ch <= 'z') {
                    lower++;
                }
            }
        }
        
        // Print the counts of lowercase and uppercase letters
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Uppercase letters: " + upper);
		 */

	}

}
