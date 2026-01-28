package com.example;

/**
 * Longest Common Subsequence Problem
 * 
 * Problem Description:
 * Given two strings `text1` and `text2`, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * 
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 * 
 * For example, "ace" is a subsequence of "abcde".
 * 
 * Inputs:
 * - Two strings `text1` and `text2`.
 * 
 * Expected Outputs:
 * - An integer representing the length of the longest common subsequence.
 * 
 * Examples:
 * 1. Input: text1 = "abcde", text2 = "ace"
 *    Output: 3
 *    Explanation:
 *      - The longest common subsequence is "ace" and its length is 3.
 * 
 * 2. Input: text1 = "abc", text2 = "abc"
 *    Output: 3
 *    Explanation:
 *      - The longest common subsequence is "abc" and its length is 3.
 * 
 * 3. Input: text1 = "abc", text2 = "def"
 *    Output: 0
 *    Explanation:
 *      - There is no common subsequence, so the result is 0.
 * 
 * Constraints:
 * - 1 <= text1.length, text2.length <= 1000
 * - text1 and text2 consist of only lowercase English characters.
 * 
 * Hints:
 * - This problem can be solved using dynamic programming.
 * - Create a 2D array `dp` where `dp[i][j]` represents the length of the longest common subsequence
 *   of the first `i` characters of `text1` and the first `j` characters of `text2`.
 * - Initialize the `dp` array with zeros and fill it based on whether the current characters match.
 */

public class LongestCommonSubsequence {
    
    /**
     * Calculates the length of the longest common subsequence between two strings.
     * 
     * @param text1 The first string.
     * @param text2 The second string.
     * @return The length of the longest common subsequence.
     */
    public static int longestCommonSubsequence(String text1, String text2) {
        // TODO: Implement the solution here
        return 0;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println("longestCommonSubsequence(\"abcde\", \"ace\") = " + longestCommonSubsequence("abcde", "ace")); // Expected: 3
        System.out.println("longestCommonSubsequence(\"abc\", \"abc\") = " + longestCommonSubsequence("abc", "abc")); // Expected: 3
        System.out.println("longestCommonSubsequence(\"abc\", \"def\") = " + longestCommonSubsequence("abc", "def")); // Expected: 0
        System.out.println("longestCommonSubsequence(\"\", \"\") = " + longestCommonSubsequence("", "")); // Expected: 0
        System.out.println("longestCommonSubsequence(\"abc\", \"\") = " + longestCommonSubsequence("abc", "")); // Expected: 0
        System.out.println("longestCommonSubsequence(\"\", \"abc\") = " + longestCommonSubsequence("", "abc")); // Expected: 0
        System.out.println("longestCommonSubsequence(\"ezupkr\", \"ubmrapg\") = " + longestCommonSubsequence("ezupkr", "ubmrapg")); // Expected: 2
        System.out.println("longestCommonSubsequence(\"abcba\", \"abcbcba\") = " + longestCommonSubsequence("abcba", "abcbcba")); // Expected: 5
    }
}