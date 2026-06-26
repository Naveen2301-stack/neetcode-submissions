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
    public ListNode reverseList(ListNode head) {
        ListNode rh = null;
        ListNode t = head;
        while(head!=null){
        head =  head.next;
        t.next = null;
        t.next = rh;
        rh=t;
        t=head; 

        }
        return rh;
   
    }
}
