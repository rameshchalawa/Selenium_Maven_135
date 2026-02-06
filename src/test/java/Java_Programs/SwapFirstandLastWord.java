package Java_Programs;

public class SwapFirstandLastWord {

	public static void main(String[] args) {
		
		// Input string
        String str = "selenium is the fun";
        
        // Split the string into words using space as delimiter
        String[] wd = str.split(" ");
        
        // Swap the first and last words
        String temp = wd[0];
        wd[0] = wd[wd.length - 1];
        wd[wd.length - 1] = temp;
        
        // Join the words back into a string
        String str2 = String.join(" ", wd);
        
        // Print the resulting string
        System.out.println(str2);
    }
}