package Java_Programs;

import java.util.TreeSet;

public class TreeSet_SecondHighestElement {

	public static void main(String[] args) {
		
		int[] arr = {4,10,6,8,10,3};
		
		TreeSet<Integer> tt = new TreeSet<>();
		
		for(int n : arr)
		    tt.add(n);
		System.out.println("Second Highest : "+tt.lower(tt.last())); //finds the Highest element that is strictly less than tt.last(), which is 8.

	}

}
