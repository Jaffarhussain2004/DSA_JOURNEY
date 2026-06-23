> 📌 **Cross-listed:** Primary location is [Array/0001-Two-Sum](../../Array/0001-Two-Sum). This problem also appears under: **Array**, **Hash Table**

# 1. Two Sum


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Array](https://img.shields.io/badge/Array-purple) ![Hash Table](https://img.shields.io/badge/Hash%20Table-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/two-sum/)


## 📝 Problem Description

Given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have ***exactly* one solution**, and you may not use the *same* element twice.

You can return the answer in any order.

 

Example 1:**

```

**Input:** nums = [2,7,11,15], target = 9
**Output:** [0,1]
**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

```

Example 2:**

```

**Input:** nums = [3,2,4], target = 6
**Output:** [1,2]

```

Example 3:**

```

**Input:** nums = [3,3], target = 6
**Output:** [0,1]

```

 

**Constraints:**

	- `2 <= nums.length <= 10^4`

	- `-10^9 <= nums[i] <= 10^9`

	- `-10^9 <= target <= 10^9`

	- **Only one valid answer exists.**

 

**Follow-up: **Can you come up with an algorithm that is less than `O(n^2)` time complexity?

## 🧠 Solution Explanation

**Intuition**
This solution works by brute-forcing all possible pairs of numbers in the input array and checking if their sum equals the target. This approach is straightforward but inefficient due to its quadratic time complexity.

**Approach**
1. Initialize an array `res` of size 2 to store the indices of the two numbers that add up to the target.
2. Iterate over the input array `nums` using two nested loops. The outer loop iterates over each element in the array, and the inner loop starts from the next element (i.e., `i+1`) and goes up to the last element.
3. For each pair of elements, check if their sum equals the target. If it does, store the indices of these elements in the `res` array.
4. After checking all pairs, return the `res` array containing the indices of the two numbers that add up to the target.

**Time Complexity**
O(n^2), where n is the length of the input array `nums`. This is because the solution uses two nested loops, each iterating over the array, resulting in a quadratic time complexity.

**Space Complexity**
O(1), excluding the space required for the input array and the output array. The solution uses a constant amount of space to store the `res` array and the indices, making its space complexity constant.

**Key Insight**
The key insight here is that the solution is not efficient due to its quadratic time complexity, which makes it impractical for large input arrays. A more efficient solution would use a hash table to store the numbers and their indices, allowing for a linear time complexity.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 49 ms (Beats 8.28%) |
| 💾 Memory | 47.2 MB (Beats 39.74%) |
| 📅 Solved | 2026-06-04 |
| 💻 Language | Java |