package Java_Programs;

import java.util.*;

public class ArraySmallestSubsetSum {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 6, 2, 1};
        int targetSum = 11;
        List<Integer> result = smallestSubset(arr, targetSum);
        System.out.println("Smallest subset with sum " + targetSum + ": " + result);
    }

    public static List<Integer> smallestSubset(int[] arr, int targetSum) {
        List<Integer> result = new ArrayList<>();
        findSubset(arr, targetSum, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findSubset(int[] arr, int targetSum, int index, List<Integer> current, List<Integer> result) {
        if (targetSum == 0) {
            if (result.isEmpty() || current.size() < result.size()) {
                result.clear();
                result.addAll(current);
            }
            return;
        }

        if (index == arr.length || targetSum < 0) {
            return;
        }

        // Exclude current element
        findSubset(arr, targetSum, index + 1, current, result);

        // Include current element
        current.add(arr[index]);
        findSubset(arr, targetSum - arr[index], index + 1, current, result);
        current.remove(current.size() - 1);
    }
}