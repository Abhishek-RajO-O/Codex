/*
Date:- 07/07/2025
Q231. Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
 */
public class Q07E2 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            double x = n;
            while (x > 1) {
                x /= 2;
            }
            return (x == 1);
        }
    }
}
