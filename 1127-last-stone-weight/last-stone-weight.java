class Solution {
    public int lastStoneWeight(int[] nums) {
PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            p.add(num);
        }
        while(p.size()!=1){
            int a=p.poll();
            int b=p.poll();
            p.add(a-b);
        }
        return p.peek();
      
}}

 
 