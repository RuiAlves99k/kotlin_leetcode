package others.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
 * <p>
 * Note: If no such array is possible then, return [-1].
 * <p>
 * Examples:
 * <p>
 * Input: arr[] = [1, 2, 3, 7, 5], target = 12
 * Output: [2, 4]
 * Explanation: The sum of elements from 2nd to 4th position is 12.
 */
class IndexesSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
//        return bruteForce(arr, target);
        return optimized(arr, target);
    }

    /**
     * Brute force
     * Time Complexity O(nˆ2)
     * Space O(1)
     */
    private static ArrayList<Integer> bruteForce(int[] arr, int target) {
        int sum;
        for (int l = 0; l < arr.length; l++) {
            sum = arr[l];
            for (int r = l; r < arr.length; r++) {
                if (r != l) {
                    sum += arr[r];
                }
                if (sum == target) {
                    return new ArrayList<Integer>(Arrays.asList(l + 1, r + 1));
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(-1));
    }

    private static ArrayList<Integer> optimized(int[] arr, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            hash.put(sum + arr[i], i);
            if (hash.getOrDefault(sum - target, -1) > 0){
                return new ArrayList<>(List.of(hash.get(sum-target) + 2, i + 2));
            }
        }
        return new ArrayList<>(List.of(-1));
    }
}