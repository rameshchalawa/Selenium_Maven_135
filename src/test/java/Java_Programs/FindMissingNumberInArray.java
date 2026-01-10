package Java_Programs;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1; // expected length (5 in this case)
        
        // Calculate the expected sum using the formula: n * (n + 1) / 2
        int sum = n * (n + 1) / 2; // sum = 5 * (5 + 1) / 2 = 15
        
        int actualSum = 0;
        
        // Calculate the actual sum of array elements
        for (int num : arr) {
            actualSum += num; // actualSum = 1 + 2 + 3 + 5 = 11
        }
        
        // Find the missing number by subtracting actual sum from expected sum
        int missingNumber = sum - actualSum; // missingNumber = 15 - 11 = 4
        
        System.out.println("Missing number: " + missingNumber);

	}

}
