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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        ListNode iter = head.next;
        int sum = 0;

        while (iter != null) {
            if (iter.val != 0) {
                sum += iter.val;
            } else {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            }
            iter = iter.next;
        }
        return dummy.next;
    }
}
