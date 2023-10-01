class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
       StringBuilder b = new StringBuilder(a);
        String reversed = b.reverse().toString();
        return a.equals(reversed);
      

        
    }
}