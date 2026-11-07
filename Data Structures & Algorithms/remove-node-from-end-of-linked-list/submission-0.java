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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           int k =count(head)-n;
              if(k==0){
               return head.next;
           }
           ListNode curren=head;
           for(int i=0;i<k-1;i++){
            curren=curren.next;
           }
           curren.next=curren.next.next;
           return head;
    }
    public int count(ListNode head){
        ListNode curren=head;
        int count=0;
        while(curren !=null){
            curren=curren.next;
            count++;
        }
        return count;
    }
}
