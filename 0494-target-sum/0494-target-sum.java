class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
 return res(nums,target,0,0);
        
    }
    int res(int nums[],int target,int index,int cursum){
        if(index==nums.length){
            if(cursum==target){
                return 1;
            }
            else 
            return 0;
        }
        int left=res(nums,target,index+1,cursum+nums[index]);
        int right=res(nums,target,index+1,cursum-nums[index]);
        return left+right;

    }
}