# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3 = ListNode(l1.val + l2.val)
        carryOver = 0
        point1, point2, point3, prev = (l1, l2, l3, l3)
        if l3.val > 9:
            carrOver = point3.val
            point3.val = point3.val // 10
        while point1.next is not None and point2.next is not None: 
            point3.val = point1.val + point2.val + carryOver
            if point3.val > 9:
                carryOver = point3.val % 10
                point3.val = point3.val // 10
            
            # add the pointer to the list: keep track of previous' next