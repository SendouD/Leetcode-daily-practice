class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0,temp=0; 
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            if(mp.containsKey(temp-goal)) ans+=mp.get(temp-goal);
            if(mp.containsKey(temp)) mp.put(temp,mp.get(temp)+1);
            else mp.put(temp,1);
        }
        return ans;
    }
}