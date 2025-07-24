/*
Date :- 24/07/2025
Q707. Design Linked List
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
Implement the MyLinkedList class:
MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
Example 1:
Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]
 */
public class Q24M {
class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        System.out.println(size);
        Node cur = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node p = new Node(val);
        if (size == 0) {
            head = p;
            tail = head;
        } else {
            p.next = head;
            head = p;
        }
        size++;
    }

    public void addAtTail(int val) {

        Node p = new Node(val);
        if (size == 0) {
            head = p;
            tail = head;
        } else {
            tail.next = p;
            tail = p;
        }
        size++;

    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node p = new Node(val);
        Node cur = head;
        int count = 1;
        while (cur != null) {
            if (count == index) {
                p.next = cur.next;
                cur.next = p;
                size++;
                return;
            }
            cur = cur.next;
            count++;
        }

    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        int count = 1;
        while (cur != null) {
            if (count == size - 1) {
                tail = cur;
                cur.next = null;
                size--;
                return;
            }
            if (count == index) {
                cur.next = cur.next.next;
                size--;
                return;
            }
            cur = cur.next;
            count++;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
