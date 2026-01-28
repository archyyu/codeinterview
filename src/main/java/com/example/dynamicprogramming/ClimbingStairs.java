package com.example.dynamicprogramming;

/**
 * Climbing Stairs Problem
 * 
 * Problem Description:
 * You are climbing a staircase. It takes `n` steps to reach the top.
 * Each time, you can either climb 1 step or 2 steps.
 * In how many distinct ways can you climb to the top?
 * 
 * Inputs:
 * - An integer `n` (1 ≤ `n` ≤ 45), representing the number of steps in the staircase.
 * 
 * Expected Outputs:
 * - An integer representing the number of distinct ways to climb to the top.
 * 
 * Examples:
 * 1. Input: n = 2
 *    Output: 2
 *    Explanation:
 *      - Way 1: 1 step + 1 step
 *      - Way 2: 2 steps
 * 
 * 2. Input: n = 3
 *    Output: 3
 *    Explanation:
 *      - Way 1: 1 step + 1 step + 1 step
 *      - Way 2: 1 step + 2 steps
 *      - Way 3: 2 steps + 1 step
 * 
 * 3. Input: n = 4
 *    Output: 5
 *    Explanation:
 *      - Way 1: 1 + 1 + 1 + 1
 *      - Way 2: 1 + 1 + 2
 *      - Way 3: 1 + 2 + 1
 *      - Way 4: 2 + 1 + 1
 *      - Way 5: 2 + 2
 * 
 * Constraints:
 * - The solution should efficiently handle the upper constraint (n = 45).
 * - Avoid recursion without memoization, as it will lead to exponential time complexity.
 * 
 * Hints:
 * - This problem follows the Fibonacci sequence pattern.
 * - Think about how the number of ways to reach the n-th step relates to the ways to reach the (n-1)-th and (n-2)-th steps.
 */

public class ClimbingStairs {
    
    /**
     * Calculates the number of distinct ways to climb to the top of a staircase with `n` steps.
     * 
     * @param n The number of steps in the staircase.
     * @return The number of distinct ways to climb to the top.
     */
    public static int climbStairs(int n) {
        
        int steps[] = new int[n];
        steps[0] = 1;
        steps[1] = 2;

        if (n >= 2) {
            for (int i=2;i<n;i++) {
                steps[i] = steps[i - 1] + steps[i - 2];
            }
        }

        return steps[n - 1];
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println("climbStairs(2) = " + climbStairs(2)); // Expected: 2
        System.out.println("climbStairs(3) = " + climbStairs(3)); // Expected: 3
        System.out.println("climbStairs(4) = " + climbStairs(4)); // Expected: 5
        System.out.println("climbStairs(5) = " + climbStairs(5)); // Expected: 8
    }
}