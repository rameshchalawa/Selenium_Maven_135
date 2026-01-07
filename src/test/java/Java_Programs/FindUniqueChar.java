package Java_Programs;

public class FindUniqueChar {

	public static void main(String[] args) {
		
		String str = "Repetitive";
		
		//Output Rpv
		
		str=str.toLowerCase();
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			//check if character appeared only once
			
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				result.append(ch);
			}
		}
		
		String output = result.toString().substring(0,1).toUpperCase()+result.toString().substring(1);
		
		System.out.println(output);

	}

}
