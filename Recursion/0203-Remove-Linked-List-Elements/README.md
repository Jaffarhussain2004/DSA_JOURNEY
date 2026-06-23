> 📌 **Cross-listed:** Primary location is [Linked List/0203-Remove-Linked-List-Elements](../../Linked-List/0203-Remove-Linked-List-Elements). This problem also appears under: **Linked List**, **Recursion**

# 203. Remove Linked List Elements


![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3) ![Language](https://img.shields.io/badge/Language-Java-blue) ![Linked List](https://img.shields.io/badge/Linked%20List-purple) ![Recursion](https://img.shields.io/badge/Recursion-purple)


🔗 [View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)


## 📝 Problem Description

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return *the new head*.

 

Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg)
```

**Input:** head = [1,2,6,3,4,5,6], val = 6
**Output:** [1,2,3,4,5]

```

Example 2:**

```

**Input:** head = [], val = 1
**Output:** []

```

Example 3:**

```

**Input:** head = [7,7,7,7], val = 7
**Output:** []

```

 

**Constraints:**

	- The number of nodes in the list is in the range `[0, 10^4]`.

	- `1 <= Node.val <= 50`

	- `0 <= val <= 50`

## 📊 Metrics

| Metric | Value |
|:-------|:------|
| ⏱️ Runtime | 4 ms (Beats 1.32%) |
| 💾 Memory | 47.5 MB (Beats 7.91%) |
| 📅 Solved | 2026-05-24 |
| 💻 Language | Java |