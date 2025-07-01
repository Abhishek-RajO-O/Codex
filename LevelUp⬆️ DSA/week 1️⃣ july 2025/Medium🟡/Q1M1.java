/*
Date - 01/07/2025
Q33. Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
 */
public class Q1M1 {
    public int search(int[] nums, int target) {

        int peak=BinarySearch(nums,0,nums.length-1);
        if (target==nums[peak]){
            return peak;
        }else if (target <nums[0]){
            return  binary(nums,target,peak+1,nums.length-1);
        }
        else{
            return binary(nums,target,0,peak-1);
        }
        
    }
    //    finding peak element
    static int BinarySearch(int[] list, int start, int end ){
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(list[mid]>list[mid+1]){
                return mid;
            }else if(list[0]>list[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    // normal
        static int binary(int[] list,int t,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(list[mid]==t){
                return mid;
            } else if (list[mid]>t) {
                end=mid-1;
            }else{
                start=mid+1;
        }
        }
        return -1;
    }
}
