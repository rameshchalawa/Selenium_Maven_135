package Java_Programs;

public class SwapString {

	public static void main(String[] args) {
		
		String str1 = "selenium";
		String str2 = "java";
		
		System.out.println("Str1 is -----> "+str1+" || str2 is -----> "+str2);
		
		str1 = str1+str2;
		
		str2 = str1.substring(0, str1.length()-str2.length());
		
		str1 = str1.substring(str2.length());
		
		System.out.println("Str1 is -----> "+str1+" || str2 is -----> "+str2);

	}

}
