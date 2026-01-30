package com.example.slidingwindow;

import java.util.Set;
import java.util.HashSet;

public class LongestSubstring {

    /**
     * Finds the length of the longest substring without repeating characters.
     * 
     * @param s The input string.
     * @return The length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {

        // int max = 0;

        // for (int i = 0; i < s.length(); i++) {

        //     Set<Character> set = new HashSet<>();

        //     for (int j = i; j < s.length(); j++) {
        //         if (!set.add(s.charAt(j))) {
        //             break;
        //         }
        //     }

        //     if (set.size() > max) {
        //         max = set.size();
        //     }

        // }

        // return max;

        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left ++;
            }

            set.add(s.charAt(right));

            if (set.size() > max) {
                max = set.size();
            }

            right ++;

        }

        return max;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        // Test Cases
        String[] testStrings = {
            "abcabcbb",
            "bbbbb",
            "pwwkew",
            "",
            " ",
            "dvdf",
            "abba",
            "tmmzuxt"
        };
        int[] expectedResults = {3, 1, 3, 0, 1, 3, 2, 5};

        for (int i = 0; i < testStrings.length; i++) {
            int result = solution.lengthOfLongestSubstring(testStrings[i]);
            System.out.printf("Test Case %d: Input=\"%s\", Expected=%d, Result=%d - %s%n",
                i + 1, testStrings[i], expectedResults[i], result,
                (result == expectedResults[i] ? "PASSED" : "FAILED"));
        }
    }
}
