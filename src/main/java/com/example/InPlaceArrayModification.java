package com.example;

/**
 * In-Place Array Modification Problem
 * 
 * Problem Description:
 * Given an array of integers, modify the array in-place such that all zeros are moved to the end
 * of the array while maintaining the relative order of the non-zero elements.
 * 
 * Inputs:
 * - An integer array `nums`.
 * 
 * Expected Outputs:
 * - The modified array with all zeros moved to the end.
 * 
 * Examples:
 * 1. Input: nums = [0, 1, 0, 3, 12]
 *    Output: [1, 3, 12, 0, 0]
 *    Explanation:
 *      - All zeros are moved to the end while maintaining the order of non-zero elements.
 * 
 * 2. Input: nums = [0, 0, 1]
 *    Output: [1, 0, 0]
 *    Explanation:
 *      - The single non-zero element is moved to the front.
 * 
 * 3. Input: nums = [1, 2, 3, 4, 5]
 *    Output: [1, 2, 3, 4, 5]
 *    Explanation:
 *      - There are no zeros in the array, so it remains unchanged.
 * 
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 * 
 * Hints:
 * - Use a two-pointer approach to solve this problem efficiently.
 * - One pointer can track the position where the next non-zero element should be placed,
 *   and the other can iterate through the array to find non-zero elements.
 */

public class InPlaceArrayModification {
    
    /**
     * Modifies the array in-place to move all zeros to the end while maintaining the order of non-zero elements.
     * 
     * @param nums The array to be modified.
     */
    public static void moveZeroes(int[] nums) {



    }
    
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("moveZeroes([0, 1, 0, 3, 12]) = [");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Expected: [1, 3, 12, 0, 0]
        
        int[] nums2 = {0, 0, 1};
        moveZeroes(nums2);
        System.out.print("moveZeroes([0, 0, 1]) = [");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Expected: [1, 0, 0]
        
        int[] nums3 = {1, 2, 3, 4, 5};
        moveZeroes(nums3);
        System.out.print("moveZeroes([1, 2, 3, 4, 5]) = [");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Expected: [1, 2, 3, 4, 5]
        
        int[] nums4 = {0, 0, 0, 0};
        moveZeroes(nums4);
        System.out.print("moveZeroes([0, 0, 0, 0]) = [");
        for (int num : nums4) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Expected: [0, 0, 0, 0]
        
        int[] nums5 = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZeroes(nums5);
        System.out.print("moveZeroes([1, 0, 2, 0, 3, 0, 4, 0]) = [");
        for (int num : nums5) {
            System.out.print(num + " ");
        }
        System.out.println("]"); // Expected: [1, 2, 3, 4, 0, 0, 0, 0]
    }
}