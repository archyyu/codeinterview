package com.example.backtracking;

import java.util.List;
import java.util.ArrayList;

/**
 * Subsets Problem
 * 
 * Problem Description:
 * Given an integer array `nums` of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * 
 * Inputs:
 * - An integer array `nums` of unique elements.
 * 
 * Expected Outputs:
 * - A list of lists representing all possible subsets of `nums`.
 * 
 * Examples:
 * 1. Input: nums = [1, 2, 3]
 *    Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
 *    Explanation:
 *      - The power set of [1, 2, 3] includes all possible subsets.
 * 
 * 2. Input: nums = [0]
 *    Output: [[], [0]]
 *    Explanation:
 *      - The power set of [0] includes the empty set and the set containing 0.
 * 
 * Constraints:
 * - 1 <= nums.length <= 10
 * - -10 <= nums[i] <= 10
 * - All the numbers of `nums` are unique.
 * 
 * Hints:
 * - This problem can be solved using backtracking or bit manipulation.
 * - For backtracking, start with an empty subset and recursively add elements to it.
 * - For bit manipulation, use the binary representation of numbers to generate subsets.
 */

public class Subsets {
    
    /**
     * Generates all possible subsets of the given array.
     * 
     * @param nums An array of unique integers.
     * @return A list of lists representing all possible subsets.
     */
    public static List<List<Integer>> subsets(int[] nums) {
        // TODO: Implement the solution here
        return new ArrayList<>();
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> result1 = subsets(nums1);
        System.out.println("subsets([1, 2, 3]) = " + result1);
        // Expected: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        
        int[] nums2 = {0};
        List<List<Integer>> result2 = subsets(nums2);
        System.out.println("subsets([0]) = " + result2);
        // Expected: [[], [0]]
        
        int[] nums3 = {1, 2};
        List<List<Integer>> result3 = subsets(nums3);
        System.out.println("subsets([1, 2]) = " + result3);
        // Expected: [[], [1], [2], [1, 2]]
        
        int[] nums4 = {1};
        List<List<Integer>> result4 = subsets(nums4);
        System.out.println("subsets([1]) = " + result4);
        // Expected: [[], [1]]
        
        int[] nums5 = {};
        List<List<Integer>> result5 = subsets(nums5);
        System.out.println("subsets([]) = " + result5);
        // Expected: [[]]
    }
}