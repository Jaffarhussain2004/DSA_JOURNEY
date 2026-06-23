# 2520. Count the Digits That Divide a Number


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Math](https://img.shields.io/badge/Math-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/count-the-digits-that-divide-a-number/)


## 📝 Problem Description

Given an integer `num`, return *the number of digits in `num` that divide *`num`.

An integer `val` divides `nums` if `nums % val == 0`.

 

**Example 1:**

```

**Input:** num = 7
**Output:** 1
**Explanation:** 7 divides itself, hence the answer is 1.

```

**Example 2:**

```

**Input:** num = 121
**Output:** 2
**Explanation:** 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

```

**Example 3:**

```

**Input:** num = 1248
**Output:** 4
**Explanation:** 1248 is divisible by all of its digits, hence the answer is 4.

```

 

**Constraints:**

	- `1 <= num <= 10^9`

	- `num` does not contain `0` as one of its digits.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 0 ms (Beats 100%) |
| 💾 Memory | 42.3 MB (Beats 17.95%) |
| 📅 Solved | 2026-05-25 |
| 💻 Language | Java |