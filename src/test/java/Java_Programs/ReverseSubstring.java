package Java_Programs;

public class ReverseSubstring {

	public static void main(String[] args) {
		
		String str = "selenium by sujeet";
		
		// output : Reverse only selenium
		
		//split the string into words
		
		String[] wd=str.split(" ");
		
		//Reverse only the first word
		String Fword = wd[0];
		String Rword="";
		
		for(int i=Fword.length()-1;i>=0;i--) {
			
			Rword = Rword + Fword.charAt(i);
			
		}
			
			String result = Rword = Rword+" "+wd[1]+" "+wd[2];
			System.out.println(result);
			
	}

}
