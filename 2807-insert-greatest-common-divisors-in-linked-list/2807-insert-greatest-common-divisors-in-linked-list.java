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
    static int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode rear = head;
        ListNode front = rear.next;
        ListNode dummy = head;
        
        while(front!=null){
            int val1 = rear.val;
            int val2 = front.val;
            ListNode newNode = new ListNode(gcd(val1,val2));
            rear.next = newNode;
            newNode.next = front;
            
            rear = front;
            front = rear.next;
        }
        return dummy;
    }
}