# 7. Reverse Integer


![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffc01e) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Math](https://img.shields.io/badge/Math-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/reverse-integer/)


## 📝 Problem Description

Given a signed 32-bit integer `x`, return `x`* with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

 

Example 1:**

```

**Input:** x = 123
**Output:** 321

```

Example 2:**

```

**Input:** x = -123
**Output:** -321

```

Example 3:**

```

**Input:** x = 120
**Output:** 21

```

 

**Constraints:**

	- `-2^31 <= x <= 2^31 - 1`

## 🧠 Solution Explanation

**Intuition**
The solution works by iteratively extracting the last digit of the input integer `x` using the modulo operator (`x % 10`), and then appending it to the reversed integer `rev` by multiplying `rev` by 10 and adding the extracted digit. This process is repeated until all digits have been processed, at which point the reversed integer is returned.

**Approach**
1. Initialize a variable `rev` to store the reversed integer, and set it to 0.
2. While `x` is not 0, extract the last digit of `x` using `x % 10` and store it in `digit`.
3. Remove the last digit from `x` by performing integer division by 10 (`x = x / 10`).
4. Check for potential overflow by verifying if `rev` is within the valid range for a 32-bit signed integer.
5. If `rev` is within the valid range, append the extracted digit to `rev` by multiplying `rev` by 10 and adding `digit`.
6. Repeat steps 2-5 until all digits have been processed.
7. Return the reversed integer `rev`.

**Time Complexity**
O(log|x|), where |x| is the absolute value of the input integer. This is because each iteration of the while loop removes one digit from the input integer, reducing its magnitude by a factor of 10. The number of iterations required to process all digits is proportional to the number of digits in the input integer, which is logarithmic in the magnitude of the input.

**Space Complexity**
O(1), as the solution only uses a constant amount of space to store the reversed integer `rev` and the temporary variables `digit` and `x`.

**Key Insight**
The key insight is to use the modulo operator to extract the last digit of the input integer, and then use integer division to remove the last digit from the input integer. This process is repeated until all digits have been processed, allowing the solution to efficiently reverse the input integer without requiring additional space to store the intermediate results.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 1 ms (Beats 99.98%) |
| 💾 Memory | 42.2 MB (Beats 97.62%) |
| 📅 Solved | 2026-05-15 |
| 💻 Language | Java |