package Java_Programs;

public class VowelCheck {

	public static void main(String[] args) {
		String str = "welcome";

        if (str.matches(".*[aeiouAEIOU].*")) //.* — match any characters (zero or more) before and after the vowel, [aeiouAEIOU] — match any vowel (both lowercase and uppercase)
        {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}