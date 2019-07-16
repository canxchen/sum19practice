class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
		#just had a total list with the two combined
        total_list = sorted(nums1+nums2)
        length = len(total_list)
        
        if length %2 ==1: 
            return total_list[length//2]
        else:
            return float(total_list[length//2 - 1]+total_list[length//2])/2