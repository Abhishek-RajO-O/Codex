/*
Date- 05/07/2025
Q162. Find Peak Element
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.
Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class Q05M {
    class Solution {
        public int findPeakElement(int[] nums) {
            return BinarySearch2(nums, 0, nums.length - 1);
        }

        static int BinarySearch2(int[] list, int start, int end) {
            int mid = 0;
            while (start < end) {
                mid = start + (end - start) / 2;
                if (list[mid] < list[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }
    }
}
