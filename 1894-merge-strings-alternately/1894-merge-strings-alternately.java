class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder res =new StringBuilder();
       int flag=0;
       for(int i=0;i<word1.length()+word2.length();i++){
           if(i<word1.length()){
               res.append(word1.charAt(flag));
           }
           if(i<word2.length()){
               res.append(word2.charAt(flag));
    
           }
                      flag++;
       }
       return res.toString();




        
    }
}