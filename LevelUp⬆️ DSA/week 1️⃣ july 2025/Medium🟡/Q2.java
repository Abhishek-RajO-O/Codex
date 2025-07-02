/*
Date -02/07/2025
Q2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example :
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp  = ans;
        int carry = 0 ;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry ;
            if(l1 != null){
                sum+= l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum+= l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(sum%10);
            carry = sum / 10;
            temp = temp.next;
            
            
        }
        return ans.next;
        
    }
}
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


