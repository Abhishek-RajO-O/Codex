/*
Date - 01/07/2025
Q3330 Find The Original Typed String I 

Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.
Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
You are given a string word, which represents the final output displayed on Alice's screen.
Return the total number of possible original strings that Alice might have intended to type.

Example 1:

Input: word = "abbcccc"

Output: 5

Explanation:

The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
 */
public class Q01E1 {
    public int possibleStringCount(String word) {
        return count(word)+1;
    }
    public static int count(String word){
        int n = 0 ;
        for(int i = 0 ; i < word.length() -1;i++){
            if(word.charAt(i) == word.charAt(i+1)){
                n++;
            }
        }
        return n;
    }
}
