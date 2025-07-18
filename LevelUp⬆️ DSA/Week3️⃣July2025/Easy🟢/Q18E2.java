/*
Date:-18/07/2025
Q21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */
public class Q18E2 {
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode  temp1 = list1, temp2 = list2;
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while( temp1 != null && temp2 != null ){
            if(temp1.val > temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
            }else{
                temp.next = temp1;
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
        while(temp1 != null){
            temp.next= temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while(temp2 != null){
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        return ans.next;
    }
    public ListNode smaller(ListNode list1, ListNode list2){
        return ((list1.val > list2.val)? list2 : list1);
    }
}

}
