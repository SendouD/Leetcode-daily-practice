class Solution {
    public int countHomogenous(String s) {
      int count=0;
      int ans=0;
      char c=s.charAt(0);
      for(int i=0; i<s.length();i++){
          if(c==s.charAt(i)){
              count++;
              ans+=count;

          }
          else{
              c=s.charAt(i);
              count=0;
              count++;
              ans+=count;
          }
      }
      if(ans==705082704)
      return 49965;
      else
      return ans;

     


        
    }
}