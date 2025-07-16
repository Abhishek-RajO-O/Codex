/*
Date:-16/07/2025
Q1290. Convert Binary Number in a Linked List to Integer
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.
Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
 */
public class Q16E2 {
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0 ;
        ListNode temp = head;
        while(temp != null){
            num = num*2 + temp.val;
            temp= temp.next;
        }
        return num;
        
    }
}
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}