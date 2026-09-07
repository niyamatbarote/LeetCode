/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        ListNode newEnd = head;
        int size = 1;
        if (head == null || head.next == null) {
            return head;
        }

        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        k %= size;
        int skip = size-k;

        for (int i = 1; i<skip; i++) {
            newEnd = newEnd.next;
        }
        tail.next = head;
        head = newEnd.next;
        newEnd.next = null;

        return head;
    }
}