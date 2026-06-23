# 9. Palindrome Number


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Math](https://img.shields.io/badge/Math-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/palindrome-number/)


## 📝 Problem Description

Given an integer `x`, return `true`* if *`x`* is a ****palindrome****, and *`false`* otherwise*.

 

Example 1:**

```

**Input:** x = 121
**Output:** true
**Explanation:** 121 reads as 121 from left to right and from right to left.

```

Example 2:**

```

**Input:** x = -121
**Output:** false
**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

Example 3:**

```

**Input:** x = 10
**Output:** false
**Explanation:** Reads 01 from right to left. Therefore it is not a palindrome.

```

 

**Constraints:**

	- `-2^31 <= x <= 2^31 - 1`

 

**Follow up:** Could you solve it without converting the integer to a string?

## 🧠 Solution Explanation

**Intuition**
The solution works by reversing the input integer and comparing it to the original. This approach leverages the fact that a palindrome remains the same when its digits are reversed.

**Approach**
1. Check if the input integer is negative, in which case it cannot be a palindrome.
2. Store the original input integer in a variable `dup`.
3. Initialize a variable `rev` to store the reversed integer and a variable `digit` to store the last digit of the input integer.
4. Loop until the input integer `x` becomes 0.
5. In each iteration, extract the last digit of `x` using the modulo operator (`x % 10`).
6. Append the extracted digit to the reversed integer `rev` by shifting its digits to the left and adding the new digit.
7. Remove the last digit from the input integer `x` by performing integer division by 10 (`x / 10`).
8. After the loop, compare the original integer `dup` with the reversed integer `rev` to determine if it's a palindrome.

**Time Complexity**
O(log n), where n is the input integer. This is because the number of iterations in the while loop is proportional to the number of digits in the input integer, which is logarithmic in its magnitude.

**Space Complexity**
O(1), as the solution uses a constant amount of space to store the variables `dup`, `rev`, and `digit`, regardless of the input size.

**Key Insight**
The key insight is to recognize that reversing an integer can be done efficiently by extracting its digits one by one and appending them to the reversed integer. This approach avoids converting the integer to a string, making it more efficient for large inputs.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 5 ms (Beats 79.34%) |
| 💾 Memory | 45.8 MB (Beats 72.22%) |
| 📅 Solved | 2026-01-24 |
| 💻 Language | Java |