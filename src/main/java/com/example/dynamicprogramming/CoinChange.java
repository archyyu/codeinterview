package com.example.dynamicprogramming;

/**
 * Coin Change Problem
 * 
 * Problem Description:
 * You are given an integer array `coins` representing coins of different denominations
 * and an integer `amount` representing a total amount of money.
 * 
 * Return the fewest number of coins that you need to make up that amount.
 * If it is not possible to make up the amount with the given coins, return `-1`.
 * 
 * You may assume that you have an infinite number of each kind of coin.
 * 
 * Inputs:
 * - An integer array `coins` where `coins[i]` is the denomination of the i-th coin.
 * - An integer `amount` representing the total amount of money.
 * 
 * Expected Outputs:
 * - An integer representing the fewest number of coins needed to make up the amount.
 *   If it is not possible, return `-1`.
 * 
 * Examples:
 * 1. Input: coins = [1, 2, 5], amount = 11
 *    Output: 3
 *    Explanation:
 *      - 5 + 5 + 1 = 11 (3 coins)
 * 
 * 2. Input: coins = [2], amount = 3
 *    Output: -1
 *    Explanation:
 *      - It is not possible to make up 3 with coins of denomination 2.
 * 
 * 3. Input: coins = [1], amount = 0
 *    Output: 0
 *    Explanation:
 *      - No coins are needed to make up 0.
 * 
 * Constraints:
 * - 1 <= coins.length <= 12
 * - 1 <= coins[i] <= 2^31 - 1
 * - 0 <= amount <= 10^4
 * 
 * Hints:
 * - This problem can be solved using dynamic programming.
 * - Think about the minimum number of coins needed to make up each amount from 0 to `amount`.
 * - Initialize a dynamic programming array where `dp[i]` represents the minimum number of coins needed to make up the amount `i`.
 */

public class CoinChange {
    
    /**
     * Calculates the fewest number of coins needed to make up the given amount.
     * 
     * @param coins An array representing the denominations of the coins.
     * @param amount The total amount of money to make up.
     * @return The fewest number of coins needed, or -1 if it is not possible.
     */
    public static int coinChange(int[] coins, int amount) {

        int mins[] = new int[amount + 1];
        
        for(int i=0;i<mins.length;i++) {
            mins[i] = amount;
        }

        mins[0] = 0;

        for(int i=1;i<amount + 1;i++) {
            for(int coin : coins) {
                if (i - coin >= 0 && mins[i - coin] < amount) {
                    mins[i] = Math.min(mins[i - coin] + 1, mins[i]);
                }
            }
        }

        for(int i=0;i<mins.length;i++) {
            // System.err.println(mins[i]);
        }
        
        return mins[amount] == amount ? -1 : mins[amount];
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] coins1 = {1, 2, 5};
        System.out.println("coinChange([1, 2, 5], 11) = " + coinChange(coins1, 11)); // Expected: 3
        
        int[] coins2 = {2};
        System.out.println("coinChange([2], 3) = " + coinChange(coins2, 3)); // Expected: -1
        
        // int[] coins3 = {1};
        // System.out.println("coinChange([1], 0) = " + coinChange(coins3, 0)); // Expected: 0
        
        int[] coins4 = {1, 3, 4};
        System.out.println("coinChange([1, 3, 4], 6) = " + coinChange(coins4, 6)); // Expected: 2 (3 + 3)
        
        int[] coins5 = {2, 5, 10, 1};
        System.out.println("coinChange([2, 5, 10, 1], 27) = " + coinChange(coins5, 27)); // Expected: 4 (10 + 10 + 5 + 2)
        
        int[] coins6 = {186, 419, 83, 408};
        System.out.println("coinChange([186, 419, 83, 408], 6249) = " + coinChange(coins6, 6249)); // Expected: 20
        
        int[] coins7 = {1, 2, 5};
        System.out.println("coinChange([1, 2, 5], 100) = " + coinChange(coins7, 100)); // Expected: 20 (5 * 20)
        
        int[] coins8 = {3, 7, 405};
        System.out.println("coinChange([3, 7, 405], 406) = " + coinChange(coins8, 406)); // Expected: 2 (405 + 1, but 1 is not available, so -1)
    }
}