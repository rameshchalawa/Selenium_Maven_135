package Java_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurrencesOfCharInString {

	public static void main(String[] args) {
		
		//Approach1
		
        String str = "testing";
		
		Map<Character , Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
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

}  
