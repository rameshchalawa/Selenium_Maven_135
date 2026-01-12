package Java_Programs;

public class CountTheWords {

	public static void main(String[] args) {
		
		//Approach1
		
		String s = "Java is platform independent";
		
		int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' ') )
            {
                count++;
            }
        }
        System.out.println("Number of words in a string:"+ count);
		

		
		//Approach2
		
		/*String str = "Java is platform independent";
		
		String[] wd = str.split("\\s+"); //s+ Matches one or more whitespace characters
		
		System.out.println("Number of words in a string:"+wd.length);
		*/

	}

}
