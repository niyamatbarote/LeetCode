/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0;
        // Getting Length of List1 :
        while(tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        // Getting Length of List2 :
        while(tempB != null) {
            tempB = tempB.next;
            lenB++;
        }

        // Making Both Lists At same position from Starting points
        while(lenA>lenB) {
            lenA--;
            headA = headA.next;
        }
        while(lenB>lenA) {
            lenB--;
            headB = headB.next;
        }

        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}