package Java_Programs;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		
		 int a[] = {100, 600, 200, 400, 500};
	        
	        System.out.println("Before sorting....");
	        System.out.println(Arrays.toString(a)); //This will print the Array [100, 600, 200, 400, 500]
	        
	        Arrays.sort(a); // sort elements in array
	        
	        System.out.println("After sorting....");
	        System.out.println(Arrays.toString(a)); 
	}

}
