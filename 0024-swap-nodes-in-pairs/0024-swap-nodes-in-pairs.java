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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        
        dummy.next = head;
        ListNode current = dummy;
        
        while(current.next!=null && current.next.next!=null){
            first = current.next;
            second = current.next.next;
            
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            current = first;
        }
            
        return dummy.next;

    }
}