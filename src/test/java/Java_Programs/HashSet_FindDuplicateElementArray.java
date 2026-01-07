package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class HashSet_FindDuplicateElementArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,4,5,1};

		Set<Integer> st = new HashSet<>();
		 
		Set<Integer> dupElement = new HashSet<>();

		for(int num : arr) {
		    if(!st.add(num)) {
		        dupElement.add(num);
		    }
		}
		System.out.println("Duplicate Elements : "+dupElement);


	}

}
