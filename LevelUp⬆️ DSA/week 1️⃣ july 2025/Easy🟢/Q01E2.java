/*
Date - 01/07/2025
Q9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class Q01E2 {
    public boolean isPalindrome(int x) {
        int copy = x;
        int rev =0 ;
        while( copy > 0 ){
            rev = rev*10 +(copy%10);
            copy /= 10 ;
        }
        return x == rev;
    }
}
