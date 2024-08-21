class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        int left=0;
        int right=0;
        long count=0;
        int n=nums.length;
        while(right<n){
            sum+=nums[right];
            while((sum*(right-left+1)>=k)){
                sum-=nums[left];
                left++;

            }
            count+=right-left+1;
            right++;
        }
        return count;

    }
}