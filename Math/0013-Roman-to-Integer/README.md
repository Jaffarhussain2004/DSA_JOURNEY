> 📌 **Cross-listed:** Primary location is [Hash Table/0013-Roman-to-Integer](../../Hash-Table/0013-Roman-to-Integer). This problem also appears under: **Hash Table**, **Math**, **String**

# 13. Roman to Integer


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Hash Table](https://img.shields.io/badge/Hash%20Table-purple) ![Math](https://img.shields.io/badge/Math-purple) ![String](https://img.shields.io/badge/String-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/roman-to-integer/)


## 📝 Problem Description

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

```

**Symbol**       **Value**
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

	- `I` can be placed before `V` (5) and `X` (10) to make 4 and 9. 

	- `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. 

	- `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

Example 1:**

```

**Input:** s = "III"
**Output:** 3
**Explanation:** III = 3.

```

Example 2:**

```

**Input:** s = "LVIII"
**Output:** 58
**Explanation:** L = 50, V= 5, III = 3.

```

Example 3:**

```

**Input:** s = "MCMXCIV"
**Output:** 1994
**Explanation:** M = 1000, CM = 900, XC = 90 and IV = 4.

```

 

**Constraints:**

	- `1 <= s.length <= 15`

	- `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.

	- It is **guaranteed** that `s` is a valid roman numeral in the range `[1, 3999]`.

## 🧠 Solution Explanation

**Intuition**
The solution works by iterating through the Roman numeral string and keeping track of the current value and the next value. If the current value is less than the next value, it means we need to subtract the current value from the sum, otherwise, we add it. This approach takes advantage of the fact that Roman numerals use subtraction to represent values.

**Approach**
1. Create a HashMap to store the mapping between Roman numerals and their integer values.
2. Initialize a variable `sum` to store the final integer value.
3. Iterate through the Roman numeral string from left to right.
4. For each character, get its integer value from the HashMap.
5. If the current value is less than the next value (if it exists), subtract the current value from the sum.
6. Otherwise, add the current value to the sum.
7. Return the final sum.

**Time Complexity**
O(n), where n is the length of the Roman numeral string. This is because we are iterating through the string once.

**Space Complexity**
O(1), excluding the input string. We are using a constant amount of space to store the HashMap and the sum variable.

**Key Insight**
The key insight is that we can take advantage of the subtraction rule in Roman numerals to simplify the conversion process. By checking if the current value is less than the next value, we can determine whether to add or subtract it from the sum, making the conversion process more efficient.

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 4 ms (Beats 56.15%) |
| 💾 Memory | 46.5 MB (Beats 62.74%) |
| 📅 Solved | 2026-06-23 |
| 💻 Language | Java |