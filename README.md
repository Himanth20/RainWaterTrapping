# RainWaterTrapping

A comprehensive Java solution collection for the "Rain Water Trapping" problem - one of the most popular coding interview questions.

## Description

This project implements multiple algorithms to solve the rain water trapping problem with varying levels of optimization. Given an elevation map represented by an array of heights, the challenge is to calculate how much rainwater can be trapped after raining.

## Problem Statement

Given an array `height` of non-negative integers representing an elevation map where the width of each bar is 1, compute how much rainwater can be trapped after raining.

### Example:
```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water are trapped.
```

## Solutions Included

This repository contains multiple approaches to solve the problem:

### 1. Brute Force Solution
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)
- For each element, finds the maximum height to its left and right
- Simple but inefficient for large inputs
- File: `RainWaterTrappingWithBruteForce.java`

### 2. Dynamic Programming Solution
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- Pre-computes maximum heights to the left and right of each position
- Trades space for better time complexity
- File: `RainWaterTrappingWithDP.java`

### 3. Two Pointer Approach
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- Most optimal solution using two pointers
- Efficiently finds trapped water without extra space
- File: `RainWaterTrapping.java`

## How It Works

### Two-Pointer Approach (Most Optimal)

The key insight is that the water level at any position is determined by the minimum of:
- The maximum height to its left
- The maximum height to its right

Water trapped at position i = `min(max_left, max_right) - height[i]`

### Algorithm Steps:

1. Initialize two pointers: `left = 0`, `right = n-1`
2. Keep track of `left_max` and `right_max`
3. Move the pointer pointing to the smaller height inward
4. Update the max values as we traverse
5. Accumulate the trapped water at each step

## Requirements

- Java 8 or higher
- No external dependencies

## Getting Started

### Compilation

```bash
# Compile all Java files
javac *.java
```

### Running the Solutions

```bash
# Run the main solution (Two-Pointer approach)
java RainWaterTrapping

# Run the brute force solution
java RainWaterTrappingWithBruteForce

# Run the dynamic programming solution
java RainWaterTrappingWithDP
```

## Complexity Analysis

| Approach | Time Complexity | Space Complexity | Optimal |
|----------|-----------------|------------------|---------|
| Brute Force | O(n²) | O(1) | ❌ |
| Dynamic Programming | O(n) | O(n) | ✓ |
| Two Pointers | O(n) | O(1) | ✓✓ Best |

## Why This Problem Matters

- **Interview Preparation:** Frequently asked in technical interviews at major companies
- **Algorithmic Thinking:** Teaches optimization techniques and space-time tradeoffs
- **Real-world Applications:** Similar logic used in drainage systems, container capacity problems, etc.

## Key Learnings

1. **Multiple approaches exist** for the same problem with different tradeoffs
2. **Optimization techniques:** From brute force → DP → greedy two-pointer approach
3. **Space-time tradeoff:** Understanding when to trade space for time efficiency
4. **Problem understanding:** The importance of analyzing the problem structure to find the optimal solution

## Author

Himanth Sai (Himanth20)

## License

MIT License

## Resources

- [LeetCode - Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
- [GeeksforGeeks - Trapping Rain Water](https://www.geeksforgeeks.org/trapping-rain-water/)

## Contributing

Feel free to fork this repository and suggest improvements or additional solutions!
