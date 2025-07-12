class Solution(object):
    def search(self, nums, target):
        left=0
        right=len(nums)-1

        while(left<=right):
            mid=left+(right-left)/2

            if(nums[mid]==target):
                return mid
            if nums[left] <= nums[mid]:
                if(nums[left]<=target and target< nums[mid]):
                     right=mid-1
                else:
                    left=mid+1
            else:
                if nums[right]>=target and target>nums[mid]:
                    left=mid+1
                else:
                    right=mid-1
        return -1
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        