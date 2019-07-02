class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        # get totallength = nums1 + nums2
        # median location = totallength / 2
        # if medianlocation - 1 >= nums1.length, median is in nums2: 
        #   medianlocation = totallength - medianposition - nums2.length #this might be wrong skdjf
        # else its the correct position
        # if totallength %2 == 0
        #   the median is medianlocation + (medianlocation - 1)
        # else its whatevers there