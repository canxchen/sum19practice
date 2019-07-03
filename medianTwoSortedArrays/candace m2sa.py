class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if not nums1: 
            if len(nums2) % 2 == 0:
                return (nums2[len(nums2) / 2] + nums2[(len(nums2) / 2) - 1]) / 2
            else:
                return nums2[len(nums2) / 2]
        elif not nums2:
            if len(nums1) % 2 == 0:
                return (nums1[len(nums1) / 2] + nums1[(len(nums1) / 2) - 1]) / 2
            else:
                return nums1[len(nums1) / 2]
        totalLen = len(nums1) + len(nums2)
        halfSz = totalLen / 2
        min1 = 1
        max1 = halfSz
        #recursing on the contributions of list 1
        if (len(nums1) < halfSz):
            min1 = 0
            max1 = len(nums1)
        currContributions = min1 + max1 / 2
        # contributions: 0 to 5, elements range: none, 0 to 4
        lastof1 = currContributions - 1
        lastof2 = halfSz - currContributions - 1
        left = min1
        right = max1
        candidateIsFrom1 = False
        while currContributions >= min1 and currContributions <= max1:
            a, b, aa = (0, 0, 0)
            if nums1[lastof1] < nums2[lastof2]:
                a = nums1[lastof1]
                b = nums2[lastof2]
                aa = nums1[lastof1 + 1]
            else:
                a = nums2[lastof2]
                b = nums1[lastof1]
                aa = nums2[lastof2 + 1]
                candidateIsFrom1 = True
            # after ^^, always true that a <= b
            if b < aa or a == b:
                return b
            # at this point, a < aa < b where
            if candidateIsFrom1:
                # l2a < l2aa < l1b(candidate), more contributions for a(list2)
                right = currContributions
                currContributions = (left + currContributions) / 2
            else:
                left = currContributions
                currContributions = (right + currContributions) / 2
        return -1     
        # ATTEMPT 1 TOTALLY OFF get totallength = nums1 + nums2
        # median location = totallength / 2
        # if medianlocation - 1 >= nums1.length, median is in nums2: 
        #   medianlocation = totallength - medianposition - nums2.length #this might be wrong skdjf
        # else its the correct position
        # if totallength %2 == 0
        #   the median is medianlocation + (medianlocation - 1)
        # else its whatevers there

        #ternary statements: (if false, if true)[test]
        #OR if_true if test else if_false