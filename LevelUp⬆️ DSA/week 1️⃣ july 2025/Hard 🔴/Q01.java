/*
Date -
41. First Missing Positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
 */
public class Q01 {
    class Solution {
    public int firstMissingPositive(int[] nums) {
        sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] -1  != i){
                return i+1;
            }
            
        }
        return nums.length+1;
    }
    private static void sort(int[] nums){
        int i = 0;
        while (i < nums.length){
            if(nums[i] >0 && nums[i] < nums.length){
                int correct = nums[i] -1;
                if(nums[i] != nums[correct]){
                    swap(nums, i , correct );
                }else{
                    i++;
                }

            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp ;
    }
}
}
