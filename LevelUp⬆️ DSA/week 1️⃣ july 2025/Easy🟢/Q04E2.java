/*
Date- 04/07/2025
Q169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3 
 */
public class Q04E2 {
    class Solution {
        public int majorityElement(int[] nums) {
            sort(nums);
            int len = nums.length;
            int count = 1;
            int maj = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == maj) {
                    count++;
                    if (count > len / 2) {
                        return maj;
                    }
                } else {
                    maj = nums[i];
                    count = 1;
                }

            }
            return maj;

        }

        static void sort(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (nums[j] < nums[j - 1]) {
                        swap(nums, j);
                    } else {
                        break;
                    }
                }
            }
        }

        static void swap(int[] nums, int j) {
            int tem = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = tem;
        }
    }
}
