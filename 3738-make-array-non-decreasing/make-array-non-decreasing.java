class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int max=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(max<=nums[i]){
                count++;
                max=nums[i];
                            }
        }
        return count;
    }
}