package Java_Programs;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		
		String str = "S?u/j!e@e#t";
		
		String str2 = "";
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
            if((ch>='A' && ch<='Z') ||
			(ch>='a' && ch<='z') ||
			(ch>='0' && ch<='9')) {
            	
            	str2 = str2+ch;
            }
		}
        System.out.println(str2);
	}

}
