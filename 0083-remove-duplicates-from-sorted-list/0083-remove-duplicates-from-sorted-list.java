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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        int length = 0;
        
        if (head == null) return null;
        
        while(temp!=null){
            length+=1;
            temp= temp.next;
        }
        temp = head;
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < length; i++){
            set.add(temp.val);
            temp = temp.next;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : set) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
        
    }
}