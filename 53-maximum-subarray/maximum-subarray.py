class Solution(object):
    def maxSubArray(self, nums):
        maxSum= float('-inf')
        cSum=0

        for num in nums:
            cSum+=num

            if cSum>maxSum:
                maxSum=cSum
            if cSum<0:
                cSum=0
        return maxSum
        """
        :type nums: List[int]
        :rtype: int
        """
        