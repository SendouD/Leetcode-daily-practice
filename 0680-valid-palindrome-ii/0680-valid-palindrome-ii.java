class Solution {
    public boolean validPalindrome(String s) {
        int low = 0 , high = s.length()-1 , count1 = 0 , count2 = 0;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++; high--;
            }else{
                count1++; low++;
            }
        }
        low = 0 ; high = s.length()-1;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++; high--;
            }else{
                count2++; high--;
            }
        }
        if(count1==0 || count1==1 || count2==0 || count2==1) return true;
        return false;



//        Another solution (Try this one) 

        // int low = 0 , high = s.length()-1;        
        // int count = 0;
        // while(low<high){
        //     if((s.charAt(low)!=s.charAt(high)) && s.charAt(low+1)==s.charAt(high)){
        //         low++; count++;
        //     }else if(s.charAt(low)!=s.charAt(high) && s.charAt(high-1) == s.charAt(low)){
        //         count++; high--;
        //     }if((s.charAt(low)!=s.charAt(high)) && s.charAt(low+1)!=s.charAt(high)){
        //         low++; count++;
        //     }else if(s.charAt(low)!=s.charAt(high) && s.charAt(high-1) != s.charAt(low)){
        //         count++; high--;
        //     }
        //     else if(s.charAt(low)!=s.charAt(high)){
        //         low++; high--;
        //     } else{
        //         low++; high--;
        //     }
        // }
        // if(count<=1) return true;
        // return false;
    }
}