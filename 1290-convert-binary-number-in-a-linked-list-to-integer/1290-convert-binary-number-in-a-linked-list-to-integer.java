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
    public int getDecimalValue(ListNode head) {
        int[] nums;
        ListNode temp = head;
        int decimalNum = 0;
        
        while(temp!=null){
            decimalNum = (decimalNum << 1) | temp.val;
            temp=temp.next;
        }
        return decimalNum;
    }
}