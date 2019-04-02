/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        
        else{
            ListNode temp =head;
            head = head.next;
            temp.next = temp.next.next;
            head.next = temp;
            temp.next=swapPairs(temp.next);
            return head;
        }
    }
}