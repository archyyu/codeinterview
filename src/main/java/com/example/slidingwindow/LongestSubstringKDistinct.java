package com.example.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    /**
     * Finds the length of the longest substring with at most k distinct characters.
     * 
     * @param s The input string.
     * @param k The maximum number of distinct characters allowed.
     * @return The length of the longest substring with at most k distinct characters.
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        

        return 0;
    }

    public static void main(String[] args) {
        LongestSubstringKDistinct solution = new LongestSubstringKDistinct();

        // Test Case data: {Input String, K, Expected Result}
        Object[][] testCases = {
            {"eceba", 2, 3},
            {"aa", 1, 2},
            {"a", 0, 0},
            {"eceba", 3, 4},
            {"araaci", 2, 4},
            {"araaci", 1, 2},
            {"cbbebi", 3, 5},
            {"", 1, 0}
        };

        for (int i = 0; i < testCases.length; i++) {
            String s = (String) testCases[i][0];
            int k = (int) testCases[i][1];
            int expected = (int) testCases[i][2];
            int result = solution.lengthOfLongestSubstringKDistinct(s, k);
            
            System.out.printf("Test Case %d: Input=\"%s\", K=%d, Expected=%d, Result=%d - %s%n",
                i + 1, s, k, expected, result,
                (result == expected ? "PASSED" : "FAILED"));
        }
    }
}
