/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode previousNode= new ListNode(1);
        int carry = 0;
        int value = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int a = length(l1);
        int b = length(l2);
        System.out.println(a);
        System.out.println(b);
        if(a!=b){
            int remaining = a>b?a-b:b-a;
            if(a<b){
                ListNode l1t = getLastNode(l1);
                for(int i = 0;i<remaining;i++){
                    l1t.next = new ListNode(0);
                    l1t = l1t.next;
            }
            }
             if(b<a){
                ListNode l2t = getLastNode(l2);
                for(int i = 0;i<remaining;i++){
                    l2t.next = new ListNode(0);
                    l2t = l2t.next;
            }
            }
            
        }
        while(temp1!=null && temp2!=null){
            value = temp1.val+temp2.val+carry;
            carry = value/10;
            value = value % 10;
            previousNode = temp1;
            temp1.val = value;
            temp1 = temp1.next;
            temp2 = temp2.next;  
        }
        if(carry!=0){
            previousNode.next = new ListNode(carry);
        }
        if(temp1!=null){
            while(temp1!=null){
                previousNode.next = temp1;
                previousNode =previousNode.next;
                temp1=temp1.next;
                
            }
        }
        if(temp2!=null){
            while(temp2!=null){
                previousNode.next = temp2;
                previousNode = previousNode.next;
                temp2=temp2.next;
                
            }
        }
       return l1;
    }
    public static int length(ListNode l1){
        int count = 0;
        while(l1!=null)
        {
            l1 = l1.next;
            count++;
            }
        return count;
    }
    public static ListNode getLastNode(ListNode l1){
        while(l1.next!=null){
            l1 = l1.next;
        }
        return l1;
    }
}