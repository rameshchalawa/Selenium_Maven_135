package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class HashMap_CountChar {

	public static void main(String[] args) {
		
		String str = "selenium";
		
        Map<Character,Integer> mp = new HashMap<>();
        
        for(char ch : str.toCharArray()) //str.toCharArray() converts "selenium" into an array of characters: [s, e, l, e, n, i, u, m]
        {
        	
            mp.put(ch, mp.getOrDefault(ch,0)+1);
            
        }
        System.out.println(mp);

	}

}
