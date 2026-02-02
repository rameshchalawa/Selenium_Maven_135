package Java_Programs;

public class ReverseStringWithSpacePositionIntact {
	
    public static void main(String[] args) {
    	
    	// Input string to reverse while keeping spaces intact
        String str = "Infosys ltd";
        
        // Convert string to char arrays for manipulation
        char[] input = str.toCharArray();
        char[] result = new char[input.length];

        // Pointer to fill characters from the end
        int j = input.length - 1;
        
        // Iterate through input and reverse string, preserving spaces
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                result[i] = ' '; // Keep space in original position
            } else {
                // Find next non-space position from end and fill character
                while (result[j] == ' ') j--;
                result[j--] = input[i];
            }
        }
        
        // Print the reversed string with spaces intact
        System.out.println(String.valueOf(result));
    }
}
