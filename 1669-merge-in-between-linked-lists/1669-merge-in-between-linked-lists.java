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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode iter = list1;
        int end = 0;
        while(end!=b){
            iter = iter.next;
            end = end+1;
        }
        ListNode temp = list2;
        
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = iter.next;
        
        int begg = 0;
        iter = list1;
        while(begg<(a-1)){
            iter = iter.next;
            begg = begg+1;
        }
        iter.next = list2;
        
        return list1;
    }
}