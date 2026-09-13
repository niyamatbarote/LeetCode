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

    // ListNode midPrev = null;
    //     while (head != null && head.next != null) {
    //         midPrev = (midPrev == null) ? head : midPrev.next;
    //         head = head.next.next; 
    //     }
    //     ListNode mid = midPrev.next;
    //     midPrev.next = null;
    //     return mid;

    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // MidPrev Node is Just Preceding Node of the LIST:
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        midPrev.next = null;
        return slow;
    }

    public ListNode merge(ListNode list1 , ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
                ans = ans.next;
            } else {
                ans.next = list2;
                list2 = list2.next;
                ans = ans.next;
            }
        }
        ans.next = list1 != null ? list1 : list2 ;
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode start = sortList(head);
        ListNode end = sortList(mid);

        return merge(start,end);

    }
    // // Keep your exact concept, but use a reliable slow pointer as midPrev
    // ListNode midPrev = head;
    // ListNode fast = head.next.next; // Start fast two steps ahead

    // while (fast != null && fast.next != null) {
    //     midPrev = midPrev.next;
    //     fast = fast.next.next;
    // }
    
    // // Your exact logic from here down:
    // ListNode mid = midPrev.next;
    // midPrev.next = null; // Sever the link
    // return mid; // Return the head of the right half
}