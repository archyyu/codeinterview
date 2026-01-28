package com.example;

/**
 * Container With Most Water Problem
 * 
 * Problem Description:
 * Given `n` non-negative integers `height` where each integer represents the height of a vertical line
 * at position `i`, find two lines that together with the x-axis form a container that holds the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Inputs:
 * - An integer array `height` where `height[i]` is the height of the vertical line at position `i`.
 * 
 * Expected Outputs:
 * - An integer representing the maximum amount of water a container can store.
 * 
 * Examples:
 * 1. Input: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
 *    Output: 49
 *    Explanation:
 *      - The maximum area is formed by the lines at positions 1 and 8 (0-indexed), with heights 8 and 7.
 *      - The area is calculated as: min(8, 7) * (8 - 1) = 7 * 7 = 49.
 * 
 * 2. Input: height = [1, 1]
 *    Output: 1
 *    Explanation:
 *      - The maximum area is formed by the lines at positions 0 and 1 (0-indexed), with heights 1 and 1.
 *      - The area is calculated as: min(1, 1) * (1 - 0) = 1 * 1 = 1.
 * 
 * Constraints:
 * - 2 <= height.length <= 10^5
 * - 0 <= height[i] <= 10^4
 * 
 * Hints:
 * - Use a two-pointer approach to solve this problem efficiently.
 * - Initialize one pointer at the start of the array and another at the end.
 * - Calculate the area formed by the two pointers and update the maximum area.
 * - Move the pointer pointing to the shorter line inward to potentially find a larger area.
 */

public class ContainerWithMostWater {
    
    /**
     * Calculates the maximum amount of water a container can store.
     * 
     * @param height An array of integers representing the heights of vertical lines.
     * @return The maximum amount of water a container can store.
     */
    public static int maxArea(int[] height) {

        int start = 0;
        int end = height.length - 1;

        int max = 0;

        while(start < end) {

            int currentHeight = (end - start) * Math.min(height[start], height[end]);
            if (currentHeight > max) {
                max = currentHeight;
            }

            if (height[start] > height[end]) {
                end --;
            } else {
                start ++;
            }

        }


        return max;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]) = " + maxArea(height1)); // Expected: 49
        
        int[] height2 = {1, 1};
        System.out.println("maxArea([1, 1]) = " + maxArea(height2)); // Expected: 1
        
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("maxArea([4, 3, 2, 1, 4]) = " + maxArea(height3)); // Expected: 16
        
        int[] height4 = {1, 2, 1};
        System.out.println("maxArea([1, 2, 1]) = " + maxArea(height4)); // Expected: 2
        
        int[] height5 = {1, 8, 6, 2, 5, 4, 8, 25, 7};
        System.out.println("maxArea([1, 8, 6, 2, 5, 4, 8, 25, 7]) = " + maxArea(height5)); // Expected: 49
        
        int[] height6 = {1, 2, 4, 3};
        System.out.println("maxArea([1, 2, 4, 3]) = " + maxArea(height6)); // Expected: 4
    }
}