/*
Date - 05/07/2025
Q83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Example 1:
Input: head = [1,1,2]
Output: [1,2]
 */
public class Q05E2 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                if (temp.next != null && temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
    }
}
