> 📌 **Cross-listed:** Primary location is [Array/0004-Median-of-Two-Sorted-Arrays](../../Array/0004-Median-of-Two-Sorted-Arrays). This problem also appears under: **Array**, **Binary Search**, **Divide and Conquer**

# 4. Median of Two Sorted Arrays


![Difficulty](https://img.shields.io/badge/Difficulty-Hard-ff375f) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Array](https://img.shields.io/badge/Array-purple) ![Binary Search](https://img.shields.io/badge/Binary%20Search-purple) ![Divide and Conquer](https://img.shields.io/badge/Divide%20and%20Conquer-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)


## 📝 Problem Description

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

Example 1:**

```

**Input:** nums1 = [1,3], nums2 = [2]
**Output:** 2.00000
**Explanation:** merged array = [1,2,3] and median is 2.

```

Example 2:**

```

**Input:** nums1 = [1,2], nums2 = [3,4]
**Output:** 2.50000
**Explanation:** merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

**Constraints:**

	- `nums1.length == m`

	- `nums2.length == n`

	- `0 <= m <= 1000`

	- `0 <= n <= 1000`

	- `1 <= m + n <= 2000`

	- `-10^6 <= nums1[i], nums2[i] <= 10^6`

## 🧠 Solution Explanation

**Intuition**
The solution uses a brute-force approach by merging the two sorted arrays, sorting the merged array, and then finding the median. However, this approach does not meet the time complexity requirement of O(log (m+n)). To achieve the required time complexity, we need to use a more efficient algorithm that takes advantage of the fact that the input arrays are sorted.

**Approach**
1. Merge the two input arrays into a single array `a`.
2. Sort the merged array `a`.
3. Find the median of the merged array `a`.
   - If the length of the merged array is odd, the median is the middle element.
   - If the length of the merged array is even, the median is the average of the two middle elements.

**Time Complexity**
O((m+n)log(m+n)) due to the sorting step. However, this is not the required time complexity of O(log (m+n)). To achieve the required time complexity, we need to use a more efficient algorithm that takes advantage of the fact that the input arrays are sorted.

**Space Complexity**
O(m+n) for storing the merged array.

**Key Insight**
The key insight is to use a binary search approach to find the median without merging and sorting the entire array. This can be achieved by finding the partition point in the merged array such that all elements on the left side are less than or equal to all elements on the right side. The median will be the average of the two middle elements if the length of the merged array is even, or the middle element if the length of the merged array is odd. This approach can be implemented using a binary search algorithm with a time complexity of O(log (m+n)).

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 8 ms (Beats 14.3%) |
| 💾 Memory | 48.3 MB (Beats 97.84%) |
| 📅 Solved | 2026-06-15 |
| 💻 Language | Java |