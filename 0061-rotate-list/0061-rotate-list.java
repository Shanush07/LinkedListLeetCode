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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 1;
        ListNode oldTail = head;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }
        
        k=k%length;
        
        while(k>0){
            while(current.next.next!=null){
                current = current.next;
            }
            
            ListNode temp = dummy.next;
            dummy.next = current.next;
            current.next.next= temp;
            current.next = null;
            current = dummy;
            k=k-1;
        }
        return dummy.next;
    }
}