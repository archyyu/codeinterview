package com.example;

import java.util.*;

/**
 * Route Between Nodes Problem
 * 
 * Problem Description:
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 * 
 * Inputs:
 * - A directed graph represented as an adjacency list.
 * - Two nodes `start` and `end`.
 * 
 * Expected Outputs:
 * - A boolean indicating whether there is a route from `start` to `end`.
 * 
 * Examples:
 * 1. Input:
 *    Graph: {
 *        0: [1, 2],
 *        1: [2],
 *        2: [3],
 *        3: []
 *    }
 *    Start: 0, End: 3
 *    Output: true
 *    Explanation:
 *      - There is a route from node 0 to node 3: 0 -> 2 -> 3.
 * 
 * 2. Input:
 *    Graph: {
 *        0: [1],
 *        1: [2],
 *        2: [0],
 *        3: [4],
 *        4: []
 *    }
 *    Start: 0, End: 4
 *    Output: false
 *    Explanation:
 *      - There is no route from node 0 to node 4.
 * 
 * Constraints:
 * - The number of nodes in the graph is between 1 and 1000.
 * - The graph is represented as an adjacency list where each node points to its neighbors.
 * 
 * Hints:
 * - Use Breadth-First Search (BFS) or Depth-First Search (DFS) to explore the graph.
 * - Keep track of visited nodes to avoid cycles and redundant checks.
 */

public class RouteBetweenNodes {
    
    /**
     * Checks if there is a route from `start` to `end` in the given directed graph.
     * 
     * @param graph The directed graph represented as an adjacency list.
     * @param start The starting node.
     * @param end The ending node.
     * @return A boolean indicating whether there is a route from `start` to `end`.
     */
    public static boolean hasRoute(Map<Integer, List<Integer>> graph, int start, int end) {
        // TODO: Implement the solution here
        return false;
    }
    
    public static void main(String[] args) {
        // Test cases
        Map<Integer, List<Integer>> graph1 = new HashMap<>();
        graph1.put(0, Arrays.asList(1, 2));
        graph1.put(1, Arrays.asList(2));
        graph1.put(2, Arrays.asList(3));
        graph1.put(3, Arrays.asList());
        System.out.println("hasRoute(graph1, 0, 3) = " + hasRoute(graph1, 0, 3)); // Expected: true
        
        Map<Integer, List<Integer>> graph2 = new HashMap<>();
        graph2.put(0, Arrays.asList(1));
        graph2.put(1, Arrays.asList(2));
        graph2.put(2, Arrays.asList(0));
        graph2.put(3, Arrays.asList(4));
        graph2.put(4, Arrays.asList());
        System.out.println("hasRoute(graph2, 0, 4) = " + hasRoute(graph2, 0, 4)); // Expected: false
        
        Map<Integer, List<Integer>> graph3 = new HashMap<>();
        graph3.put(0, Arrays.asList(1));
        graph3.put(1, Arrays.asList(2));
        graph3.put(2, Arrays.asList(3));
        graph3.put(3, Arrays.asList(4));
        graph3.put(4, Arrays.asList());
        System.out.println("hasRoute(graph3, 0, 4) = " + hasRoute(graph3, 0, 4)); // Expected: true
        
        Map<Integer, List<Integer>> graph4 = new HashMap<>();
        graph4.put(0, Arrays.asList(1));
        graph4.put(1, Arrays.asList(2));
        graph4.put(2, Arrays.asList(3));
        graph4.put(3, Arrays.asList(4));
        graph4.put(4, Arrays.asList());
        System.out.println("hasRoute(graph4, 4, 0) = " + hasRoute(graph4, 4, 0)); // Expected: false
        
        Map<Integer, List<Integer>> graph5 = new HashMap<>();
        graph5.put(0, Arrays.asList(1, 2));
        graph5.put(1, Arrays.asList(3));
        graph5.put(2, Arrays.asList(3));
        graph5.put(3, Arrays.asList(4));
        graph5.put(4, Arrays.asList());
        System.out.println("hasRoute(graph5, 0, 4) = " + hasRoute(graph5, 0, 4)); // Expected: true
    }
}