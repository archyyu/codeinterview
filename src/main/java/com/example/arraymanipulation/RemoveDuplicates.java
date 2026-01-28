package com.example.arraymanipulation;

/**
 * Remove Duplicates from Sorted Array Problem
 * 
 * Problem Description:
 * Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept the same.
 * 
 * Since it is impossible to change the length of the array in some languages, you must instead
 * have the result be placed in the first part of the array `nums`. More formally, if there are `k` elements
 * after removing the duplicates, then the first `k` elements of `nums` should hold the final result.
 * It does not matter what you leave beyond the first `k` elements.
 * 
 * Return `k` after placing the final result in the first `k` slots of `nums`.
 * 
 * Inputs:
 * - An integer array `nums` sorted in non-decreasing order.
 * 
 * Expected Outputs:
 * - An integer `k` representing the number of unique elements in the array.
 * 
 * Examples:
 * 1. Input: nums = [1, 1, 2]
 *    Output: 2
 *    Explanation:
 *      - The first two elements of `nums` are modified to [1, 2].
 *      - Return 2.
 * 
 * 2. Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 *    Output: 5
 *    Explanation:
 *      - The first five elements of `nums` are modified to [0, 1, 2, 3, 4].
 *      - Return 5.
 * 
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - `nums` is sorted in non-decreasing order.
 * 
 * Hints:
 * - Use a two-pointer approach to solve this problem efficiently.
 * - One pointer can track the position of the last unique element, and the other can iterate through the array.
 */

public class RemoveDuplicates {
    
    /**
     * Removes duplicates from the sorted array in-place and returns the number of unique elements.
     * 
     * @param nums A sorted array of integers.
     * @return The number of unique elements in the array.
     */
    public static int removeDuplicates(int[] nums) {

        int slow = 0;

        for (int faster=0;faster < nums.length;faster++) {
            if (nums[faster] == nums[slow]) {
            } else if (nums[faster] != nums[slow]) {
                slow ++;
                nums[slow] = nums[faster];
            }
        }

        return slow + 1;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.print("removeDuplicates([1, 1, 2]) = " + k1 + ", nums = [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("]"); // Expected: 2, nums = [1, 2]
        
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.print("removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]) = " + k2 + ", nums = [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("]"); // Expected: 5, nums = [0, 1, 2, 3, 4]
        
        int[] nums3 = {1, 1, 1, 1, 1};
        int k3 = removeDuplicates(nums3);
        System.out.print("removeDuplicates([1, 1, 1, 1, 1]) = " + k3 + ", nums = [");
        for (int i = 0; i < k3; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println("]"); // Expected: 1, nums = [1]
        
        int[] nums4 = {1, 2, 3, 4, 5};
        int k4 = removeDuplicates(nums4);
        System.out.print("removeDuplicates([1, 2, 3, 4, 5]) = " + k4 + ", nums = [");
        for (int i = 0; i < k4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println("]"); // Expected: 5, nums = [1, 2, 3, 4, 5]
        
        int[] nums5 = {};
        int k5 = removeDuplicates(nums5);
        System.out.println("removeDuplicates([]) = " + k5 + ", nums = []"); // Expected: 0, nums = []
    }
}