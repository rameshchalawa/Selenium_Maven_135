package Java_Programs;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		
		 int a[] = {100, 600, 200, 400, 500};
	        
	        System.out.println("Before sorting....");
	        System.out.println(Arrays.toString(a)); //This will print the Array [100, 600, 200, 400, 500]
	        
	        for (int i = 0; i < a.length - 1; i++) 
	        {
	            for (int j = 0; j < a.length - i - 1; j++) 
	            {
	                if (a[j] < a[j + 1])  // swap if left < right
	                {      
	                    int temp = a[j];
	                    a[j]     = a[j + 1];
	                    a[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted Descending: " + Arrays.toString(a)); // This will print the Array in Descending order [600, 500, 400, 200, 100]
	        
	        //Arrays.sort(a); // sort elements in array ascending by default
	        
	        //System.out.println("After sorting....");
	        //System.out.println(Arrays.toString(a)); 
	}

}
