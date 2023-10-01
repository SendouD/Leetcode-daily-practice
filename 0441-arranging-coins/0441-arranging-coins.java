class Solution {
 public int arrangeCoins(int n) {
    long sum = 0;
    long row = 0;
    
    for (int i = 1; n >= sum; i++) {
        sum += i;
        row++;
        
        if (sum == n) {
            return (int) row;
        }
    }
    
    return (int) (row - 1);
}

}