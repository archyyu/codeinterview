# Algorithm Problems and Solutions

This repository contains a collection of algorithm problems and their solutions implemented in Java. The problems cover a wide range of topics, including dynamic programming, graph traversal, tree manipulation, and more.

## Table of Contents

- [Getting Started](#getting-started)
- [Problems](#problems)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/archyyu/codeinterview.git
   ```

2. Navigate to the project directory:

   ```bash
   cd codeinterview
   ```

3. Build the project using Maven:

   ```bash
   mvn clean compile
   ```

## Problems

Here is a list of the problems included in this repository:

1. **Climbing Stairs**: Given a staircase with `n` steps, find the number of distinct ways to climb to the top.
2. **Coin Change**: Given a set of coin denominations and a target amount, find the fewest number of coins needed to make up that amount.
3. **Container With Most Water**: Given an array of vertical lines, find the maximum amount of water that can be contained.
4. **Edit Distance**: Given two strings, find the minimum number of operations required to convert one string to another.
5. **House Robber**: Given an array of house values, find the maximum amount of money that can be robbed without alerting the police.
6. **In-Place Array Modification**: Given an array, move all zeros to the end while maintaining the order of non-zero elements.
7. **List of Depths**: Given a binary tree, create a list of linked lists where each linked list contains the nodes at a specific depth.
8. **Longest Common Subsequence**: Given two strings, find the length of their longest common subsequence.
9. **Minimal Height BST**: Given a sorted array, create a binary search tree with minimal height.
10. **Remove Duplicates**: Given a sorted array, remove duplicates in-place and return the number of unique elements.
11. **Route Between Nodes**: Given a directed graph, determine if there is a route between two nodes.
12. **Subsets**: Given an array of unique integers, generate all possible subsets.
13. **Two Sum (Sorted)**: Given a sorted array and a target sum, find the indices of two numbers that add up to the target.

## How to Run

To run a specific problem, you can use the `mvn exec:java` command. For example, to run the `ClimbingStairs` problem:

```bash
mvn exec:java -Dexec.mainClass="com.example.ClimbingStairs"
```

Replace `ClimbingStairs` with the name of the problem you want to run.

## Contributing

Contributions are welcome! If you have a solution to a problem or want to add a new problem, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push your changes to your fork.
5. Submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.