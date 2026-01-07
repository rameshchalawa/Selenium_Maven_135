package Java_Programs;

public class replaceAll {

	public static void main(String[] args) {
		
		String str3 = "Hello@2025#selenium!";
		
		String only = str3.replaceAll("[^a-zA-Z0-9]",""); //replaceAll will remove all char outside provided regex
		
		System.out.println("only String :"+only);

	}

}
