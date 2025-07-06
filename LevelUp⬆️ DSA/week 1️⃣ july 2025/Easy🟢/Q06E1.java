/*
Date : 06/07/2025
Q1394. Find Lucky Integer in an Array
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1.
Example 1:
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
 */

import java.util.Arrays;

public class Q06E1 {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int ans = -1;
        int count = 0;
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            } else {
                if (num == count) {
                    ans = num;
                }
                count = 1;
                num = arr[i];
            }
            System.out.println(num + "  " + count + "  " + ans);
        }
        if (count == num) {
            ans = num;
        }
        return ans;
    }
}
