package Java_Programs;

public class StringContainsDigitorChar {

	public static void main(String[] args) {
		
		String str1 = "123456";
		String str2 = "12a45";
		
		System.out.println(str1+"  "+str1.matches("\\d+")); // \\d+ for to check only digit 
		System.out.println(str2+"  "+str2.matches("\\d+")); 

	}

}
