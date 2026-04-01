package Java_Programs;

import java.security.SecureRandom;
import java.util.UUID;

public class GenrateRadomStringMoreThan6Char {

	public static void main(String[] args) {
		
		 String reqString;
		 
	     reqString = UUID.randomUUID().toString().replace("-", "").substring(5, 11);
	        
	     System.out.println("String = " + reqString);
	     
	    
	   /*String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	    
        SecureRandom random = new SecureRandom();
        
        StringBuilder sb = new StringBuilder(6);
        
        for (int i = 0; i < 6; i++) 
        {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        System.out.println("String = " + sb.toString());
	    */
	    }
	}