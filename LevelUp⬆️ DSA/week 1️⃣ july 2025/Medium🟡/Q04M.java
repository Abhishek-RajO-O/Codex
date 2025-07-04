/*
Date- 04/07/2025
Q142. Linked List Cycle II
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
 */
public class Q04M {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode f = head;
            ListNode s = head;
            int len = length(head);
            if (len == 0) {
                return null;
            }
            while (len > 0) {
                s = s.next;
                len--;
            }
            while (f != s) {
                f = f.next;
                s = s.next;
            }
            return f;

        }

        static int length(ListNode head) {
            // 0 -> null ,
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return count(fast, slow);
                }
            }

            return 0;

        }

        static int count(ListNode stop, ListNode start) {
            int n = 0;
            do {
                start = start.next;
                n++;
            } while (start != stop);
            return n;
        }
    }

}
