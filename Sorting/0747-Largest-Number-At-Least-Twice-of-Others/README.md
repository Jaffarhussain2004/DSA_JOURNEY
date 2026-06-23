> 📌 **Cross-listed:** Primary location is [Array/0747-Largest-Number-At-Least-Twice-of-Others](../../Array/0747-Largest-Number-At-Least-Twice-of-Others). This problem also appears under: **Array**, **Sorting**

# 747. Largest Number At Least Twice of Others


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Array](https://img.shields.io/badge/Array-purple) ![Sorting](https://img.shields.io/badge/Sorting-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)


## 📝 Problem Description

You are given an integer array `nums` where the largest integer is **unique**.

Determine whether the largest element in the array is **at least twice** as much as every other number in the array. If it is, return *the **index** of the largest element, or return *`-1`* otherwise*.

 

Example 1:**

```

**Input:** nums = [3,6,1,0]
**Output:** 1
**Explanation:** 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.

```

Example 2:**

```

**Input:** nums = [1,2,3,4]
**Output:** -1
**Explanation:** 4 is less than twice the value of 3, so we return -1.

```

 

**Constraints:**

	- `2 <= nums.length <= 50`

	- `0 <= nums[i] <= 100`

	- The largest element in `nums` is unique.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 0 ms (Beats 100%) |
| 💾 Memory | 43.2 MB (Beats 53.66%) |
| 📅 Solved | 2026-06-13 |
| 💻 Language | Java |