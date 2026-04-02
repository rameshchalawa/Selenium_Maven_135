package Java_Programs;

public class CountSpecificCharOccurance {

	public static void main(String[] args) {
		
		String str = "Archana";
        char ch = 'a';
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {

            // Compare using equalsIgnoreCase logic (case-insensitive)
            if (str.charAt(i) == ch || str.charAt(i) == Character.toUpperCase(ch)) {
                count++;
            }
        }

        System.out.println("String           : " + str);
        System.out.println("Character to find: " + ch);
        System.out.println("Occurrences of '" + ch + "' : " + count);
    }
}