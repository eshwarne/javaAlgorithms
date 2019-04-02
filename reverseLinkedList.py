# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    header = None
    def reverseList(self, head: ListNode, count=0) -> ListNode:
        if(head==None):
            return head
        if(head.next == None):
            self.header = head
            return head
        else:
            count+=1
            nextNode = self.reverseList(head.next,count)
            count-=1
            nextNode.next =  head
            head.next = None
            if(count==0):
                print(self.header.val)
                return self.header
            return head
        
        