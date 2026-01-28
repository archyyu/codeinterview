package com.example;

/**
 * Minimal Height Binary Search Tree Problem
 * 
 * Problem Description:
 * Given a sorted (in increasing order) array with unique integer elements, write an algorithm
 * to create a binary search tree with minimal height.
 * 
 * Inputs:
 * - A sorted array of unique integers.
 * 
 * Expected Outputs:
 * - The root of the binary search tree with minimal height.
 * 
 * Examples:
 * 1. Input: [1, 2, 3, 4, 5, 6, 7]
 *    Output: A balanced BST with root 4, left subtree [1, 2, 3], and right subtree [5, 6, 7].
 *    Explanation:
 *      - The middle element (4) is chosen as the root to ensure minimal height.
 * 
 * 2. Input: [1, 2, 3]
 *    Output: A balanced BST with root 2, left child 1, and right child 3.
 *    Explanation:
 *      - The middle element (2) is chosen as the root.
 * 
 * Constraints:
 * - The length of the array is between 1 and 1000.
 * - The array is sorted in increasing order and contains unique integers.
 * 
 * Hints:
 * - Use a recursive approach to build the BST.
 * - Choose the middle element of the current subarray as the root to ensure balance.
 * - Recursively build the left and right subtrees from the left and right halves of the subarray.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class MinimalHeightBST {
    
    /**
     * Creates a binary search tree with minimal height from a sorted array.
     * 
     * @param nums A sorted array of unique integers.
     * @return The root of the binary search tree with minimal height.
     */
    public static TreeNode createMinimalHeightBST(int[] nums) {
        // TODO: Implement the solution here
        return null;
    }
    
    /**
     * Helper method to print the BST in-order (for testing purposes).
     * 
     * @param root The root of the BST.
     */
    public static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root1 = createMinimalHeightBST(nums1);
        System.out.print("createMinimalHeightBST([1, 2, 3, 4, 5, 6, 7]) = ");
        printInOrder(root1);
        System.out.println(); // Expected: 4 2 1 3 6 5 7
        
        int[] nums2 = {1, 2, 3};
        TreeNode root2 = createMinimalHeightBST(nums2);
        System.out.print("createMinimalHeightBST([1, 2, 3]) = ");
        printInOrder(root2);
        System.out.println(); // Expected: 2 1 3
        
        int[] nums3 = {1};
        TreeNode root3 = createMinimalHeightBST(nums3);
        System.out.print("createMinimalHeightBST([1]) = ");
        printInOrder(root3);
        System.out.println(); // Expected: 1
        
        int[] nums4 = {1, 2, 3, 4};
        TreeNode root4 = createMinimalHeightBST(nums4);
        System.out.print("createMinimalHeightBST([1, 2, 3, 4]) = ");
        printInOrder(root4);
        System.out.println(); // Expected: 3 2 1 4
        
        int[] nums5 = {1, 2, 3, 4, 5};
        TreeNode root5 = createMinimalHeightBST(nums5);
        System.out.print("createMinimalHeightBST([1, 2, 3, 4, 5]) = ");
        printInOrder(root5);
        System.out.println(); // Expected: 3 2 1 5 4
    }
}