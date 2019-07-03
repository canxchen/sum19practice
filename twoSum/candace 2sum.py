class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapOfNums = {}
        i = 0
        while i < len(nums):
            mapOfNums[nums[i]] = i
            i += 1
        for k, v in mapOfNums.items:
            if (target-k) in mapOfNums:
                return [v,mapOfNums[target-k]]
        return [-1,-1]
       