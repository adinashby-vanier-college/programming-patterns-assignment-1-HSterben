# Programming Patterns - Assignment 1

This template repository is the starter project for Programming Patterns Assignment 1. Written in Java, and tested with Gradle/JUnit.

### Question(s)

**IMORTANT NOTE:** You will need to use sorting to solve the following problems. You are **NOT** allowed to use Java sorting methods provided to you. You have to define your own sorting algorithm of choice in generic format to solve the following problems. If you use Java's sort methods, you will receive ZERO for the assignment.

1. Given a string `s` and a string array `dictionary`, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:

Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]  
Output: "apple"

Example 2:

Input: s = "abpcplea", dictionary = ["a","b","c"]  
Output: "a"

**Constraints**

1 <= s.length <= 1000  
1 <= dictionary.length <= 1000  
1 <= dictionary[i].length <= 1000  
s and dictionary[i] consist of lowercase English letters.

What is the time and space complexity of your solution? Please give your explaination as comments on top of your solution file.

2. You are given an integer array nums, and you can perform the following operation any number of times on nums:

Swap the positions of two elements nums[i] and nums[j] if gcd(nums[i], nums[j]) > 1 where gcd(nums[i], nums[j]) is the greatest common divisor of nums[i] and nums[j].
Return true if it is possible to sort nums in non-decreasing order using the above swap method, or false otherwise.

Example 1:

Input: nums = [7,21,3]  
Output: true  
Explanation:  
We can sort [7,21,3] by performing the following operations:

- Swap 7 and 21 because gcd(7,21) = 7. nums = [21,7,3]
- Swap 21 and 3 because gcd(21,3) = 3. nums = [3,7,21]

Example 2:

Input: nums = [5,2,6,2]  
Output: false  
Explanation: It is impossible to sort the array because 5 cannot be swapped with any other element.

Example 3:

Input: nums = [10,5,9,3,15]  
Output: true  
We can sort [10,5,9,3,15] by performing the following operations:

- Swap 10 and 15 because gcd(10,15) = 5. nums = [15,5,9,3,10]
- Swap 15 and 3 because gcd(15,3) = 3. nums = [3,5,9,15,10]
- Swap 10 and 15 because gcd(10,15) = 5. nums = [3,5,9,10,15]

**Constraints**

1 <= nums.length <= 3 \* 104
2 <= nums[i] <= 105

What is the time and space complexity of your solution? Please give your explaination as comments on top of your solution file.

### Setup Command

`gradle clean`

### Run Command

`gradle test`
