package com.example.arraymanipulation;

/**
 * Two Sum Problem
 *
 * Problem Description:
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers
 * such that they add up to `target`. You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.
 *
 * Inputs:
 * - An integer array `nums` (not necessarily sorted).
 * - An integer `target` representing the target sum.
 *
 * Expected Output:
 * - An integer array `[index1, index2]` with the indices of the two numbers.
 *
 * Examples:
 * 1. Input: nums = [2, 7, 11, 15], target = 9
 *    Output: [0, 1]
 * 2. Input: nums = [3, 2, 4], target = 6
 *    Output: [1, 2]
 * 3. Input: nums = [3, 3], target = 6
 *    Output: [0, 1]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Exactly one valid answer exists.
 */

import java.util.*;

public class TwoSum {

    /**
     * Finds the indices of the two numbers in the array that add up to the target.
     *
     * @param nums The input array.
     * @param target The target sum.
     * @return An array of two integers representing the indices of the two numbers.
     */
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        // Test cases
        // int[] nums1 = {2, 7, 11, 15};
        // int[] result1 = twoSum(nums1, 9);
        // System.out.println("twoSum([2, 7, 11, 15], 9) = [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]

        int[] nums2 = {3, 2, 4};
        int[] result2 = twoSum(nums2, 6);
        System.out.println("twoSum([3, 2, 4], 6) = [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]

        // int[] nums3 = {3, 3};
        // int[] result3 = twoSum(nums3, 6);
        // System.out.println("twoSum([3, 3], 6) = [" + result3[0] + ", " + result3[1] + "]"); // Expected: [0, 1]
    }
}
