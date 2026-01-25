package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class HashMap_CountChar {

	public static void main(String[] args) {
		
		// Input string to count character occurrences
        String str = "selenium";
        
        // Create a HashMap to store character counts
        Map<Character, Integer> mp = new HashMap<>();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // str.toCharArray() converts "selenium" into an array of characters: [s, e, l, e, n, i, u, m]
            
            // Increment character count in the map, defaulting to 0 if not present
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        // Print the character counts
        System.out.println(mp);
    }
	
}