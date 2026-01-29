package Java_Programs;

public class Print_A1B2C3D4 {
	
    public static void main(String[] args) {
    	
        // Initialize character and number variables
    	
        char ch = 'A'; // Starting character
        int num = 1;    // Starting number

        // Loop 4 times to print A1, B2, C3, D4
        for(int i = 0; i < 4; i++) {
        	
            // Print character and number
            System.out.print(ch + "" + num);
            
            // Increment character to next alphabet and number by 1
            
            ch++; //Increments ch moves to next char in ASCII
            
            num++;
        }
    }
}

