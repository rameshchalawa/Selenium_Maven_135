package Java_Programs;

public class CapitalizeFirstLetterOfWordString {

	public static void main(String[] args) {
		
		String str = "selenium automation with java";
        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1);
            sb.append(firstLetter).append(remainingLetters).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
