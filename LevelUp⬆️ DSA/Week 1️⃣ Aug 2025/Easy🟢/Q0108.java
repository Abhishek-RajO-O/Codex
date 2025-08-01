/*
Q118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

import java.util.ArrayList;
import java.util.List;

public class Q0108 {
    class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i = 1 ; i < numRows ;i++){
            ans.add(newRow(ans.get(i-1)));
        }
        return ans;
    }
    public static List<Integer> newRow(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 0 ; i < arr.size()-1 ;i++){
            ans.add(arr.get(i)+ arr.get(i+1));
        }
        ans.add(1);
        return ans;
    }
}
}
