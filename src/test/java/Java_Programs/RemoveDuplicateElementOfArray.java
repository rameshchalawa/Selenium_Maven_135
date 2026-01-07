package Java_Programs;

public class RemoveDuplicateElementOfArray {

	public static void main(String[] args) {
		
		int [] input = {4,5,6,4,2,5,6,8};
		
		for(int i = 0; i<input.length; i++) {
			
			boolean isDuplicate = false;
			
		for(int j = 0; j<i; j++) {
			
			if (input[i] == input[j]) {
				isDuplicate = true;
				break;
			}
		}
		if(!isDuplicate) {
			System.out.print(input[i]+ " ");
		}
		}

	}

}
