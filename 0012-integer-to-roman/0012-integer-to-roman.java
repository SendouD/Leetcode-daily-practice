class Solution {
    public String intToRoman(int target) {
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
         String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
         StringBuilder res=new StringBuilder();
         int i=0;
         while(target > 0){
             if(target>=nums[i]){
                 res.append(roman[i]);
                 target-=nums[i];

             }
             else{

                 i++;
             }
         }
         return res.toString();
    }
}