# LeetCode Daily Solutions
Problem Statement:
Given an integer array nums, perform the following operations:

If two adjacent elements are equal, double the first element and set the second element to 0.
Shift all non-zero elements to the left while maintaining their relative order, and move all zeros to the right.
Approach Explanation:
1️⃣ Merge adjacent duplicates:

Iterate through the array (for loop from 0 to n-1).
If nums[i] == nums[i+1], then:
Multiply nums[i] by 2.
Set nums[i+1] to 0.

2️⃣ Move non-zero elements forward (Swap Approach):

Maintain a pointer j to track the position where the next non-zero element should be placed.
Iterate through nums and whenever nums[i] is non-zero, swap nums[i] with nums[j], then increment j.
This ensures that all non-zero elements are pushed to the left while maintaining their order.
Remaining positions are automatically filled with zeros.
Complexity Analysis:
Merging Step: O(n), as we traverse the array once.
Shifting Step: O(n), since we swap elements in a single pass.
Total Complexity: O(n), making it efficient.
Space Complexity: O(1), since no extra space is used.
Example Walkthrough
Input:
java
Copy
Edit
nums = [2, 2, 0, 4, 4, 8]
Processing:
1️⃣ After Merging: [4, 0, 0, 8, 0, 8]
2️⃣ After Shifting Non-Zero Elements: [4, 8, 8, 0, 0, 0]

Output:
java
Copy
Edit
[4, 8, 8, 0, 0, 0]
