package Java_Programs;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String str1 = "selenium";
		
		String str2 ="";
		
		for(int i = 0; i<str1.length(); i++) {
			
			char ch = str1.charAt(i);
			
			if(str2.indexOf(ch) == -1) {
				
				str2 += ch;
			}
		}
      System.out.println("This is new String removed duplicate :"+str2);
	}

}
