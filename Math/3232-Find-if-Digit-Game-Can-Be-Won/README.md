> 📌 **Cross-listed:** Primary location is [Array/3232-Find-if-Digit-Game-Can-Be-Won](../../Array/3232-Find-if-Digit-Game-Can-Be-Won). This problem also appears under: **Array**, **Math**

# 3232. Find if Digit Game Can Be Won


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Array](https://img.shields.io/badge/Array-purple) ![Math](https://img.shields.io/badge/Math-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/find-if-digit-game-can-be-won/)


## 📝 Problem Description

You are given an array of **positive** integers `nums`.

Alice and Bob are playing a game. In the game, Alice can choose **either** all single-digit numbers or all double-digit numbers from `nums`, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is **strictly greater** than the sum of Bob's numbers.

Return `true` if Alice can win this game, otherwise, return `false`.

 

Example 1:**

**Input:** nums = [1,2,3,4,10]

**Output:** false

**Explanation:**

Alice cannot win by choosing either single-digit or double-digit numbers.

Example 2:**

**Input:** nums = [1,2,3,4,5,14]

**Output:** true

**Explanation:**

Alice can win by choosing single-digit numbers which have a sum equal to 15.

Example 3:**

**Input:** nums = [5,5,5,25]

**Output:** true

**Explanation:**

Alice can win by choosing double-digit numbers which have a sum equal to 25.

 

**Constraints:**

	- `1 <= nums.length <= 100`

	- `1 <= nums[i] <= 99`

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 1 ms (Beats 95.69%) |
| 💾 Memory | 45.7 MB (Beats 7.29%) |
| 📅 Solved | 2026-05-29 |
| 💻 Language | Java |