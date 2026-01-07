package Java_Programs;

public class ConvertUppercaseChartoLowercaseandLowercasetoUppercase {

	public static void main(String[] args) {
		
		String str ="InTeRvieW";
		
		String str2 = "";
		
		for(int i= 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
			str2 = str2+Character.toLowerCase(ch);
			
			}else {
				str2 = str2+Character.toUpperCase(ch);
			}
		}
            System.out.println(str2);
	}

}
