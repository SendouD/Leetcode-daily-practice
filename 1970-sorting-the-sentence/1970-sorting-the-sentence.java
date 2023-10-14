class Solution {
    public String sortSentence(String s) {
        String word[]=s.split(" ");
        String res[]= new String[word.length];
        int i;
        for(String j: word){
            i=j.charAt(j.length()-1)-'0';
            res[i-1]=j.substring(0,j.length()-1);

        }
        return String.join(" ",res);
      
}}
