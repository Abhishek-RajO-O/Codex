/*
Date:- 16/07/2025
Q3136. Valid Word
A word is considered valid if:
It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.
Return true if word is valid, otherwise, return false.
Notes:
'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
Example 1:
Input: word = "234Adas"
Output: true
Explanation:
This word satisfies the conditions.
 */
public class Q16E1{
    class Solution {
    public boolean isValid(String word) {
        int len = word.length();
        if(len < 3){
            return false;
        }
        boolean vov = false , cons = false;
        for(int i = 0 ; i  <  word.length() ; i++){
            char ch = word.charAt(i);
            if( ! isValid(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                        vov = true ;
                    }else{
                        cons = true;
                    }
            }
        }
        return(vov && cons);
    }
    public static boolean isValid(char ch ){
        return (Character.isLetter(ch) || Character.isDigit(ch));
    }
}

}