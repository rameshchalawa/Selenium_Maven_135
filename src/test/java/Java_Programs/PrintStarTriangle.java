package Java_Programs;

public class PrintStarTriangle {
	
    public static void main(String[] args) {
    	
        // Outer loop to control the number of rows
        for(int i = 1; i <= 5; i++) {
        	
            // Inner loop to print stars in each row
            for(int j = 1; j <= i; j++) {
            	
                System.out.print("* "); // Print star with a space
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}