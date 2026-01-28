package com.example;

/**
 * Edit Distance Problem
 * 
 * Problem Description:
 * Given two strings `word1` and `word2`, return the minimum number of operations required
 * to convert `word1` to `word2`.
 * 
 * You have the following three operations permitted on a word:
 * 1. Insert a character
 * 2. Delete a character
 * 3. Replace a character
 * 
 * Inputs:
 * - Two strings `word1` and `word2`.
 * 
 * Expected Outputs:
 * - An integer representing the minimum number of operations required to convert `word1` to `word2`.
 * 
 * Examples:
 * 1. Input: word1 = "horse", word2 = "ros"
 *    Output: 3
 *    Explanation:
 *      - horse -> rorse (replace 'h' with 'r')
 *      - rorse -> rose (remove 'r')
 *      - rose -> ros (remove 'e')
 * 
 * 2. Input: word1 = "intention", word2 = "execution"
 *    Output: 5
 *    Explanation:
 *      - intention -> inention (remove 't')
 *      - inention -> enention (replace 'i' with 'e')
 *      - enention -> exention (replace 'n' with 'x')
 *      - exention -> exection (replace 'n' with 'c')
 *      - exection -> execution (insert 'u')
 * 
 * Constraints:
 * - 0 <= word1.length, word2.length <= 500
 * - word1 and word2 consist of lowercase English letters.
 * 
 * Hints:
 * - This problem can be solved using dynamic programming.
 * - Create a 2D array `dp` where `dp[i][j]` represents the minimum number of operations required
 *   to convert the first `i` characters of `word1` to the first `j` characters of `word2`.
 * - Initialize the first row and column of the `dp` array to represent the number of operations
 *   required to convert an empty string to the corresponding substring of `word2` or `word1`.
 */

public class EditDistance {
    
    /**
     * Calculates the minimum number of operations required to convert `word1` to `word2`.
     * 
     * @param word1 The first word.
     * @param word2 The second word.
     * @return The minimum number of operations required to convert `word1` to `word2`.
     */
    public static int minDistance(String word1, String word2) {
        // TODO: Implement the solution here
        return 0;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println("minDistance(\"horse\", \"ros\") = " + minDistance("horse", "ros")); // Expected: 3
        System.out.println("minDistance(\"intention\", \"execution\") = " + minDistance("intention", "execution")); // Expected: 5
        System.out.println("minDistance(\"\", \"abc\") = " + minDistance("", "abc")); // Expected: 3
        System.out.println("minDistance(\"abc\", \"\") = " + minDistance("abc", "")); // Expected: 3
        System.out.println("minDistance(\"abc\", \"abc\") = " + minDistance("abc", "abc")); // Expected: 0
        System.out.println("minDistance(\"kitten\", \"sitting\") = " + minDistance("kitten", "sitting")); // Expected: 3
        System.out.println("minDistance(\"sunday\", \"saturday\") = " + minDistance("sunday", "saturday")); // Expected: 3
    }
}