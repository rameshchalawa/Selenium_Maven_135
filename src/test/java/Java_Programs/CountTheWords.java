package Java_Programs;

public class CountTheWords {

	public static void main(String[] args) {
		
		String str = "Java is platform independent";
		
		String[] wd = str.split("\\s+"); //s+ Matches one or more whitespace characters
		
		System.out.println("word count :"+wd.length);

	}

}
