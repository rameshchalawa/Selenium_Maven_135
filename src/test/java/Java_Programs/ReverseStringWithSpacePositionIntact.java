package Java_Programs;

public class ReverseStringWithSpacePositionIntact {

	public static void main(String[] args) {
		
		String str = "Infosys ltd";
	    
	    char[] input = str.toCharArray();
	    char[] result = new char[input.length];
	    
	    // mark space position
	    for(int i = 0 ; i<input.length;i++) {
	        if(input[i] == ' ') {
	            result[i]= ' ';
	        }
	    }
	    
	    int j = input.length - 1;
	    //fill the char from end
	    for(int i = 0; i < input.length; i++) {
	        if(input[i] != ' ') {
	            while(result[j] == ' ') {
	            	j--;
	            }
	            result[j] = input[i];
	            j--;
	        }
	    }
	    System.out.println(String.valueOf(result));

	}

}
