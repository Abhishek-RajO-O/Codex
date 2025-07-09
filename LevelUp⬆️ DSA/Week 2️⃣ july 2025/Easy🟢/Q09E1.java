/*
Date:- 09/07/2025
Q263. Ugly Number
An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
 */
public class Q09E1 {
    public boolean isUgly(int n) {
        while (n != 0) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
        return false;
    }
}
