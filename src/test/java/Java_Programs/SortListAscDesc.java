package Java_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListAscDesc {

	public static void main(String[] args) {
		
		List<String> lt = Arrays.asList("Java", "API", "Selenium", "Playwright");
		
        Collections.sort(lt);
        System.out.println("Ascending : " + lt);
        
        Collections.sort(lt, Collections.reverseOrder());
        System.out.println("Descending : " + lt);
        
        String[] arr = {"A","B","C"};
        // Convert Array to List
        List<String> lt1 = Arrays.asList(arr);
        System.out.println(lt1);
        
        // Convert List to Array
        Object[] array=lt1.toArray();
        System.out.println(Arrays.toString(array));
	}

}
