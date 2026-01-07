package Java_Programs;

public class PrintLongestword {

	public static void main(String[] args) {
		
		String str = "selenium automation with java";
		
		String[] words = str.split(" ");
		
		String longestwd ="";
		
		for(String wd : words) {
			if(wd.length()>longestwd.length())
				longestwd=wd;
		}
        System.out.println("This is longest word: "+longestwd);
	}

}
