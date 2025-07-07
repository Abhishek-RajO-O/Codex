/*
Date:- 07/07/2025
Q75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
public class Q07M {
    public void sortColors(int[] nums) {
        int[] color = new int[3];
        for (int i = 0; i < nums.length; i++) {
            color[nums[i]]++;
        }

        int i = 0;
        while (color[0] > 0) {
            nums[i] = 0;
            i++;
            color[0]--;
        }
        while (color[1] > 0) {
            nums[i] = 1;
            i++;
            color[1]--;
        }
        while (color[2] > 0) {
            nums[i] = 2;
            i++;
            color[2]--;
        }

    }
}
