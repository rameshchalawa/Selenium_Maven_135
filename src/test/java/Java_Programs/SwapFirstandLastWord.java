package Java_Programs;

public class SwapFirstandLastWord {

	public static void main(String[] args) {
		
		String str = "selenium is fun";
		String[] wd = str.split(" ");
		
		String str2 = "";
		
		for(int i = wd.length-1; i>=0; i--) {
			str2 +=wd[i]+" ";
		}
		
        
        System.out.println(str2.trim());

	}

}