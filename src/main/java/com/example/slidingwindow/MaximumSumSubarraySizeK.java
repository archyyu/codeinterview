package com.example.slidingwindow;

public class MaximumSumSubarraySizeK {

    /**
     * Finds the maximum sum of any contiguous subarray of size k.
     *
     * @param nums The input array.
     * @param k The window size.
     * @return The maximum sum across all size-k subarrays.
     */
    public int maxSumSubarraySizeK(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }

        int maxSum = 0;

        int left = 0;
        int sum = 0;
        for(int right=0;right<nums.length;right++) {

            sum += nums[right];
            if (right - left + 1 == k) {
                
                if (sum > maxSum) {
                   maxSum = sum;
                }

                sum -= nums[left];
                left ++;
            }

            

        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSumSubarraySizeK solution = new MaximumSumSubarraySizeK();

        // Test Case data: {Input Array, K, Expected Result}
        Object[][] testCases = {
            {new int[] {2, 1, 5, 1, 3, 2}, 3, 9},
            {new int[] {2, 3, 4, 1, 5}, 2, 7},
            {new int[] {-1, -2, -3, -4}, 2, -3},
            {new int[] {5}, 1, 5},
            {new int[] {1, 2, 3}, 4, 0},
            {new int[] {}, 1, 0}
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] nums = (int[]) testCases[i][0];
            int k = (int) testCases[i][1];
            int expected = (int) testCases[i][2];
            int result = solution.maxSumSubarraySizeK(nums, k);

            System.out.printf("Test Case %d: K=%d, Expected=%d, Result=%d - %s%n",
                i + 1, k, expected, result,
                (result == expected ? "PASSED" : "FAILED"));
        }
    }
}
