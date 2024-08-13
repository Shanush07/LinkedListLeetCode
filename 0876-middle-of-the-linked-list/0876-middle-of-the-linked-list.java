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
    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode temp = head;
        
        while(temp!=null){
            length+=1;
            temp=temp.next;
        }
        int index;
        if(length%2==0){
            index=(length/2)+1;
        }
        else{
            index = (length/2)+(length%2)+1;
        }
        
        ListNode iter = new ListNode(0); 
        iter.next = head;
        
        while(index>1){
            iter=iter.next;
            index--;
        }
        return iter;
    }
}