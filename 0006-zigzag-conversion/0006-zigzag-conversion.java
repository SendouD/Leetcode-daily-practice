class Solution {
    public String convert(String s, int numRows) {
        char[] ch = new char[s.length()];
        char[] ch1 = new char[s.length()];
        for(int i=0;i<s.length();i++) ch[i] = s.charAt(i);
        int n,index=0;
        if(s.length() <= numRows||numRows==1||(s.length()==0||s.length()==1)) return s;
        for(int i=0;i<numRows;i++){
            n=i;
            while(n<ch.length){
                ch1[index] = ch[n];
                index++;
                if(i!=0&&i!=numRows-1&&(n + 2*(numRows - 1 - i))<ch.length){
                    ch1[index] = ch[n + 2*(numRows - 1 - i)];
                    index++;
                }
                n = n + 2*numRows - 2;
            }
        }
        s = new String(ch1);
        return s;
    }
}