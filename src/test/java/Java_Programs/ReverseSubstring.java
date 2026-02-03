package Java_Programs;

public class ReverseSubstring {
	
    public static void main(String[] args) {
    	
        // Input string
        String str = "selenium by ramesh";
        
        // Split the string into words
        String[] wd = str.split(" ");
        
        // Reverse only the first word
        String Fword = wd[0];
        
        String Rword = "";
        
        for (int i = Fword.length() - 1; i >= 0; i--) {
        	
            // Append each character to Rword in reverse order
            Rword = Rword + Fword.charAt(i);
        }
        
        // Construct the result string with reversed first word and original remaining words
        String result = Rword + " " + wd[1] + " " + wd[2];
        
        System.out.println(result);
    }
}
