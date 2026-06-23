# 1346. Check If N and Its Double Exist


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Array](https://img.shields.io/badge/Array-purple) ![Hash Table](https://img.shields.io/badge/Hash%20Table-purple) ![Two Pointers](https://img.shields.io/badge/Two%20Pointers-purple) ![Binary Search](https://img.shields.io/badge/Binary%20Search-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/check-if-n-and-its-double-exist/)


## 📝 Problem Description

Given an array `arr` of integers, check if there exist two indices `i` and `j` such that :

	- `i != j`

	- `0 <= i, j < arr.length`

	- `arr[i] == 2 * arr[j]`

 

Example 1:**

```

**Input:** arr = [10,2,5,3]
**Output:** true
**Explanation:** For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

```

Example 2:**

```

**Input:** arr = [3,1,7,11]
**Output:** false
**Explanation:** There is no i and j that satisfy the conditions.

```

 

**Constraints:**

	- `2 <= arr.length <= 500`

	- `-10^3 <= arr[i] <= 10^3`

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 2 ms (Beats 97.41%) |
| 💾 Memory | 44.6 MB (Beats 72.15%) |
| 📅 Solved | 2026-06-17 |
| 💻 Language | Java |