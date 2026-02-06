package Java_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListAscDesc {

	public static void main(String[] args) {
		
		// Create a list of strings
        List<String> lt = Arrays.asList("Java", "API", "Selenium", "Playwright");
        
        // Sort the list in ascending order (alphabetical order)
        Collections.sort(lt);
        System.out.println("Ascending : " + lt);
        
        // Sort the list in descending order
        Collections.sort(lt, Collections.reverseOrder());
        System.out.println("Descending : " + lt);

        // Create a string array
        String[] arr = {"A", "B", "C"};
        
        // Convert Array to List
        List<String> lt1 = Arrays.asList(arr);
        System.out.println("List from Array: " + lt1);
        
        // Convert List to Array
        Object[] array = lt1.toArray();
        System.out.println("Array from List: " + Arrays.toString(array));
    }
}
