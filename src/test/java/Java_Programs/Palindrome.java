package Java_Programs;

//Check if a string is a palindrome

public class Palindrome {
 public static void main(String[] args) {
	 
     // Approach 1: Two-pointer technique
     String str = "radar";
     
     // Initialize left and right pointers
     int left = 0;
     int right = str.length() - 1;
     
     // Flag to track if string is palindrome
     boolean isPalindrome = true;
     
     // Compare chars from start and end 
     while (left < right) {
         if (str.charAt(left) != str.charAt(right)) {
             // Mismatch found, not a palindrome
             isPalindrome = false;
             break;
         }
         // Move pointers towards center
         left++;
         right--;
     }
     
     // Print result
     System.out.println(isPalindrome ? "This is a Palindrome" : "This is not a Palindrome");

		

		
		//Approach2
		/*String str1 = "radar";
		String str2 = "";
		
		for(int i =str1.length()-1; i>=0; i--) {
			
			str2 +=str1.charAt(i);
		}
		if(str1.equals(str2)) {
			
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not Palindrome");
		}*/

	}

}
