package com.example;

/**
 * House Robber Problem
 * 
 * Problem Description:
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed.
 * The only constraint stopping you from robbing each of them is that
 * adjacent houses have security systems connected, and it will automatically
 * contact the police if two adjacent houses are robbed on the same night.
 * 
 * Given an integer array `nums` representing the amount of money in each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 * 
 * Inputs:
 * - An integer array `nums` where `nums[i]` is the amount of money in the i-th house.
 * 
 * Expected Outputs:
 * - An integer representing the maximum amount of money that can be robbed without alerting the police.
 * 
 * Examples:
 * 1. Input: nums = [1, 2, 3, 1]
 *    Output: 4
 *    Explanation:
 *      - Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *      - Total amount robbed = 1 + 3 = 4.
 * 
 * 2. Input: nums = [2, 7, 9, 3, 1]
 *    Output: 12
 *    Explanation:
 *      - Rob house 1 (money = 2), rob house 3 (money = 9), and rob house 5 (money = 1).
 *      - Total amount robbed = 2 + 9 + 1 = 12.
 * 
 * 3. Input: nums = [2, 1, 1, 2]
 *    Output: 4
 *    Explanation:
 *      - Rob house 1 (money = 2) and rob house 4 (money = 2).
 *      - Total amount robbed = 2 + 2 = 4.
 * 
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 * 
 * Hints:
 * - This problem can be solved using dynamic programming.
 * - Think about the maximum amount of money that can be robbed up to the i-th house.
 * - At each step, you have two choices: rob the current house or skip it.
 */

public class HouseRobber {
    
    /**
     * Calculates the maximum amount of money that can be robbed without alerting the police.
     * 
     * @param nums An array representing the amount of money in each house.
     * @return The maximum amount of money that can be robbed.
     */
    public static int rob(int[] nums) {

        int max[] = new int[nums.length];

        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<nums.length;i++) {
            max[i] = Math.max(max[i - 1], (max[i - 2] + nums[i]));
        }

        return max[nums.length - 1];
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("rob([1, 2, 3, 1]) = " + rob(nums1)); // Expected: 4
        
        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("rob([2, 7, 9, 3, 1]) = " + rob(nums2)); // Expected: 12
        
        int[] nums3 = {2, 1, 1, 2};
        System.out.println("rob([2, 1, 1, 2]) = " + rob(nums3)); // Expected: 4
    }
}