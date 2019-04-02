# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
	#RECURSION
        if(head == None):
            return None
        head.next = self.removeElements(head.next,val)
        return head.next if(head.val == val) else head
        if(head==None):
            return None


	#USING DUMMY HEAD
        dummyHead = ListNode(-1)
        dummyHead.next = head;
        head = dummyHead
        current = dummyHead
        while(current.next!=None):
            if(current.next.val == val):
                    current.next = current.next.next
                    current = current
            else:
                current = current.next
        return dummyHead.next


	#WITHOUT DUMMY HEAD
        if(head==None):
            return head
        temp = head
        current = head
        while(not temp==None):
            if(head.val==val):
                head = head.next
                temp =head
                current =head
                continue
            if(temp.val==val):
                current.next = temp.next
                temp = temp.next
            else:
                current = temp
                temp = temp.next
        return head


        