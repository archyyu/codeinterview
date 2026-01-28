package com.example;

/**
 * Two Sum (Sorted) Problem
 * 
 * Problem Description:
 * Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific `target` number.
 * 
 * Return the indices of the two numbers as a 1-indexed array `[index1, index2]` where `index1 < index2`.
 * 
 * Inputs:
 * - An integer array `numbers` sorted in non-decreasing order.
 * - An integer `target` representing the target sum.
 * 
 * Expected Outputs:
 * - An integer array `[index1, index2]` representing the 1-indexed indices of the two numbers that add up to the target.
 * 
 * Examples:
 * 1. Input: numbers = [2, 7, 11, 15], target = 9
 *    Output: [1, 2]
 *    Explanation:
 *      - The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.
 * 
 * 2. Input: numbers = [2, 3, 4], target = 6
 *    Output: [1, 3]
 *    Explanation:
 *      - The sum of 2 and 4 is 6. Therefore, index1 = 1, index2 = 3.
 * 
 * 3. Input: numbers = [-1, 0], target = -1
 *    Output: [1, 2]
 *    Explanation:
 *      - The sum of -1 and 0 is -1. Therefore, index1 = 1, index2 = 2.
 * 
 * Constraints:
 * - 2 <= numbers.length <= 3 * 10^4
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order.
 * - -1000 <= target <= 1000
 * 
 * Hints:
 * - Since the array is sorted, you can use a two-pointer approach to solve this problem efficiently.
 * - Initialize one pointer at the start of the array and another at the end.
 * - Adjust the pointers based on whether the current sum is less than or greater than the target.
 */

public class TwoSumSorted {
    
    /**
     * Finds the indices of the two numbers in the sorted array that add up to the target.
     * 
     * @param numbers A sorted array of integers.
     * @param target The target sum.
     * @return An array of two integers representing the 1-indexed indices of the two numbers.
     */
    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while(start != end) {

            if (numbers[start] + numbers[end] > target) {
                end --;
            } else if (numbers[start] + numbers[end] < target) {
                start ++;
            } else {
                return new int[]{start + 1, end + 1};
            }
            
        }

        return new int[0];
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] numbers1 = {2, 7, 11, 15};
        int[] result1 = twoSum(numbers1, 9);
        System.out.println("twoSum([2, 7, 11, 15], 9) = [" + result1[0] + ", " + result1[1] + "]"); // Expected: [1, 2]
        
        int[] numbers2 = {2, 3, 4};
        int[] result2 = twoSum(numbers2, 6);
        System.out.println("twoSum([2, 3, 4], 6) = [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 3]
        
        int[] numbers3 = {-1, 0};
        int[] result3 = twoSum(numbers3, -1);
        System.out.println("twoSum([-1, 0], -1) = [" + result3[0] + ", " + result3[1] + "]"); // Expected: [1, 2]
        
        int[] numbers4 = {5, 25, 75};
        int[] result4 = twoSum(numbers4, 100);
        System.out.println("twoSum([5, 25, 75], 100) = [" + result4[0] + ", " + result4[1] + "]"); // Expected: [2, 3]
        
        int[] numbers5 = {1, 2, 3, 4, 4, 9, 56, 90};
        int[] result5 = twoSum(numbers5, 8);
        System.out.println("twoSum([1, 2, 3, 4, 4, 9, 56, 90], 8) = [" + result5[0] + ", " + result5[1] + "]"); // Expected: [4, 5]
    }
}