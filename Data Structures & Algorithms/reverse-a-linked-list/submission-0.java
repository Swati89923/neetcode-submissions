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
        ListNode prev=null;
        ListNode curren=head;
        while(curren != null){
            ListNode nextNode=curren.next;
            curren.next=prev;
            prev=curren;
            curren=nextNode;
        }
        return prev;
    }
}
