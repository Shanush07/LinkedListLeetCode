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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int length = 0;
        
        int result = (int) Math.pow(5, 10);
        int[] arr = new int[result];

        
        while (temp != null) {
            arr[length] = temp.val;
            length = length + 1;
            temp = temp.next;
        }
        
        int count = 0;
        int j = length - 1;
        
        for (int i = 0; i < length; i++) {
            if (arr[i] == arr[j]) {
                count += 1;
            }
            j = j - 1;
        }
        
        if (count == length) {
            return true;
        } else {
            return false;
        }
    }
}
