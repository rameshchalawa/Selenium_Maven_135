package Java_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrencesOfCharInString {
	
    public static void main(String[] args) {
    	
        //Approach 1
        String str = "testing";
        
        // Create a LinkedHashMap to store character frequencies
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
        	
            // Increment the count of the character in the map
            // If character is not present, default count is 0
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Iterate over the map entries and print character frequencies
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Print character and its frequency
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }

		
		//Approach 2
		
		/*String str = "testing";
		
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			int count = 0;
			
		for(int j = 0; j<str.length(); j++ ) {
			
			if(ch == str.charAt(j)) {
				
				count++;
			}
			
		if(str.indexOf(ch)==i);
		
		}
		System.out.println(ch+"-----> "+count);
		}
		*/

	}
