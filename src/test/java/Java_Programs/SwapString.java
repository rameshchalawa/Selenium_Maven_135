package Java_Programs;

public class SwapString {

	public static void main(String[] args) {
		
		String str1 = "selenium";
		String str2 = "java";
		
		// Print original values
        System.out.println("Str1 is -----> " + str1 + " || str2 is -----> " + str2);

        // Concatenate both strings and store in str1
        str1 = str1 + str2;

        // Extract original str1 value using substring and assign to str2
        str2 = str1.substring(0, str1.length() - str2.length());

        // Extract original str2 value using substring and assign to str1
        str1 = str1.substring(str2.length());

        // Print swapped values
        System.out.println("Str1 is -----> " + str1 + " || str2 is -----> " + str2);
    }
}