package com.example;

import java.util.*;

/**
 * List of Depths Problem
 * 
 * Problem Description:
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 * 
 * Inputs:
 * - The root of a binary tree.
 * 
 * Expected Outputs:
 * - A list of linked lists, where each linked list contains the nodes at a specific depth.
 * 
 * Examples:
 * 1. Input:
 *        1
 *       / \
 *      2   3
 *     / \
 *    4   5
 *    
 *    Output: [[1], [2, 3], [4, 5]]
 *    Explanation:
 *      - Depth 0: [1]
 *      - Depth 1: [2, 3]
 *      - Depth 2: [4, 5]
 * 
 * 2. Input:
 *        1
 *       / \
 *      2   3
 *         \
 *          4
 *         / \
 *        5   6
 *    
 *    Output: [[1], [2, 3], [4], [5, 6]]
 *    Explanation:
 *      - Depth 0: [1]
 *      - Depth 1: [2, 3]
 *      - Depth 2: [4]
 *      - Depth 3: [5, 6]
 * 
 * Constraints:
 * - The number of nodes in the tree is between 0 and 1000.
 * - The tree is a binary tree with unique integer values.
 * 
 * Hints:
 * - Use Breadth-First Search (BFS) to traverse the tree level by level.
 * - For each level, create a linked list of nodes and add it to the result list.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class ListOfDepths {
    
    /**
     * Creates a list of linked lists, where each linked list contains the nodes at a specific depth.
     * 
     * @param root The root of the binary tree.
     * @return A list of linked lists, where each linked list contains the nodes at a specific depth.
     */
    public static List<List<Integer>> listOfDepths(TreeNode root) {
        // TODO: Implement the solution here
        return new ArrayList<>();
    }
    
    /**
     * Helper method to create a binary tree from an array (for testing purposes).
     * 
     * @param arr The array representing the tree in level-order traversal.
     * @return The root of the binary tree.
     */
    public static TreeNode createTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }
        
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;
            
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static void main(String[] args) {
        // Test cases
        TreeNode root1 = createTree(new Integer[]{1, 2, 3, 4, 5, null, null});
        List<List<Integer>> result1 = listOfDepths(root1);
        System.out.println("listOfDepths([1, 2, 3, 4, 5]) = " + result1);
        // Expected: [[1], [2, 3], [4, 5]]
        
        TreeNode root2 = createTree(new Integer[]{1, 2, 3, null, null, null, 4, 5, 6});
        List<List<Integer>> result2 = listOfDepths(root2);
        System.out.println("listOfDepths([1, 2, 3, null, null, null, 4, 5, 6]) = " + result2);
        // Expected: [[1], [2, 3], [4], [5, 6]]
        
        TreeNode root3 = createTree(new Integer[]{1});
        List<List<Integer>> result3 = listOfDepths(root3);
        System.out.println("listOfDepths([1]) = " + result3);
        // Expected: [[1]]
        
        TreeNode root4 = createTree(new Integer[]{});
        List<List<Integer>> result4 = listOfDepths(root4);
        System.out.println("listOfDepths([]) = " + result4);
        // Expected: []
        
        TreeNode root5 = createTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        List<List<Integer>> result5 = listOfDepths(root5);
        System.out.println("listOfDepths([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) = " + result5);
        // Expected: [[1], [2, 3], [4, 5, 6, 7], [8, 9, 10]]
    }
}