class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];
        return loop(visited,arr,start);

        
        
    }
   public boolean loop(boolean[] visited, int[] arr, int index) {
   
    if (index < 0 || index >= arr.length || visited[index]) {
        return false;
    }

    visited[index] = true;

    if (arr[index] == 0) {
        return true;
    }

   
    return loop(visited, arr, index - arr[index]) || loop(visited, arr, index + arr[index]);
}

}