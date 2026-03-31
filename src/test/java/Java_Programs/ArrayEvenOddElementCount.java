package Java_Programs;

public class ArrayEvenOddElementCount {

	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 6, 8, 9, 10};
        
        int evenCount = 0, oddCount = 0;

        System.out.println("Array elements:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) 
            {
                evenCount++;
            } else 
            {
                oddCount++;
            }
        }

        System.out.println("\n--- Count Summary ---");
        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers : " + oddCount);
    }
}