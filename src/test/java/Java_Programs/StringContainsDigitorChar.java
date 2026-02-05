package Java_Programs;

public class StringContainsDigitorChar {

	public static void main(String[] args) {
		
		// Define two string variables
	    String str1 = "123456";
	    String str2 = "12a45";
	    
	    // Check if str1 contains only digits using regex \\d+
	    
	    // \\d+ matches one or more digits (0-9)
	    System.out.println(str1 + " " + str1.matches("\\d+"));
	    
	    // Check if str2 contains only digits using regex \\d+
	    System.out.println(str2 + " " + str2.matches("\\d+"));
	}
}
