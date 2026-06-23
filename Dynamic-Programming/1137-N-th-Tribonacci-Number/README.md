> 📌 **Cross-listed:** Primary location is [Math/1137-N-th-Tribonacci-Number](../../Math/1137-N-th-Tribonacci-Number). This problem also appears under: **Math**, **Dynamic Programming**, **Memoization**

# 1137. N-th Tribonacci Number


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Math](https://img.shields.io/badge/Math-purple) ![Dynamic Programming](https://img.shields.io/badge/Dynamic%20Programming-purple) ![Memoization](https://img.shields.io/badge/Memoization-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/n-th-tribonacci-number/)


## 📝 Problem Description

The Tribonacci sequence T_n is defined as follows: 

T_0 = 0, T_1 = 1, T_2 = 1, and T_n+3 = T_n + T_n+1 + T_n+2 for n >= 0.

Given `n`, return the value of T_n.

 

Example 1:**

```

**Input:** n = 4
**Output:** 4
**Explanation:**
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

```

Example 2:**

```

**Input:** n = 25
**Output:** 1389537

```

 

**Constraints:**

	- `0 <= n <= 37`

	- The answer is guaranteed to fit within a 32-bit integer, ie. `answer <= 2^31 - 1`.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 0 ms (Beats 100%) |
| 💾 Memory | 41.8 MB (Beats 85.2%) |
| 📅 Solved | 2026-06-12 |
| 💻 Language | Java |