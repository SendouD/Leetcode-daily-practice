class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;


    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minHeap=new PriorityQueue<>();

      for(int num:nums){
         if (minHeap.size() < k) {
                minHeap.add(num);
        }else if(num>minHeap.peek()){
            minHeap.add(num);
            minHeap.poll();
        }

      }
        
    }
    
    public int add(int val) {
       if (minHeap.size() < k) {
                minHeap.add(val);
        }else if(val>minHeap.peek()){
            minHeap.add(val);
            minHeap.poll();
        }
        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */