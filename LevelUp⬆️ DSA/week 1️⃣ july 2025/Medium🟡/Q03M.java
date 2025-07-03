/*
Date - 03/07/2025
Q 17. Letter Combinations of a Phone Number

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

import java.util.ArrayList;
import java.util.List;

public class Q03M {
    class Solution {
        public List<String> letterCombinations(String digits) {
            if (digits.isEmpty()) {
                List<String> ans = new ArrayList<>();
                return ans;
            }
            return permutaion("", digits);
        }

        static List<String> permutaion(String p, String up) {
            List<String> ans = new ArrayList<>();
            if (up.isEmpty()) {
                ans.add(p);
                return ans;
            }
            char ch = up.charAt(0);
            if (ch == '2') {
                ans.addAll(permutaion(p + "a", up.substring(1)));
                ans.addAll(permutaion(p + "b", up.substring(1)));
                ans.addAll(permutaion(p + "c", up.substring(1)));

            } else if (ch == '3') {
                ans.addAll(permutaion(p + "d", up.substring(1)));
                ans.addAll(permutaion(p + "e", up.substring(1)));
                ans.addAll(permutaion(p + "f", up.substring(1)));

            } else if (ch == '4') {
                ans.addAll(permutaion(p + "g", up.substring(1)));
                ans.addAll(permutaion(p + "h", up.substring(1)));
                ans.addAll(permutaion(p + "i", up.substring(1)));

            } else if (ch == '5') {
                ans.addAll(permutaion(p + "j", up.substring(1)));
                ans.addAll(permutaion(p + "k", up.substring(1)));
                ans.addAll(permutaion(p + "l", up.substring(1)));

            } else if (ch == '6') {
                ans.addAll(permutaion(p + "m", up.substring(1)));
                ans.addAll(permutaion(p + "n", up.substring(1)));
                ans.addAll(permutaion(p + "o", up.substring(1)));

            } else if (ch == '7') {
                ans.addAll(permutaion(p + "p", up.substring(1)));
                ans.addAll(permutaion(p + "q", up.substring(1)));
                ans.addAll(permutaion(p + "r", up.substring(1)));
                ans.addAll(permutaion(p + "s", up.substring(1)));

            } else if (ch == '8') {
                ans.addAll(permutaion(p + "t", up.substring(1)));
                ans.addAll(permutaion(p + "u", up.substring(1)));
                ans.addAll(permutaion(p + "v", up.substring(1)));

            } else {// 9
                ans.addAll(permutaion(p + "w", up.substring(1)));
                ans.addAll(permutaion(p + "x", up.substring(1)));
                ans.addAll(permutaion(p + "y", up.substring(1)));
                ans.addAll(permutaion(p + "z", up.substring(1)));

            }
            return ans;
        }
    }
}
