class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length) 
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);}
                
                
            else
                i++;
            }
            List<Integer> res= new ArrayList<Integer>();
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j+1){
                    res.add(nums[j]);
                }


            }
            return res;

        }
        
    
    void swap(int[] arr,int first ,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}