/*
Date- 05/07/2025
Q 69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
 */
public class Q05E1 {
    class Solution {
        public int mySqrt(int x) {
            double start = 0;
            double end = x / 2;
            while (start <= end) {
                double mid = start + (end - start) / 2;
                if (mid * mid == x) {
                    return (int) (mid);
                } else if (mid * mid > x) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return (int) end;
        }
    }
}
